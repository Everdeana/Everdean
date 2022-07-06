import cv2
import dlib
from functools import wraps
from scipy.spatial import distance
import RPi.GPIO as GPIO
import time
import pymysql    # pymysql 임포트
import json
import requests


url = "https://kapi.kakao.com/v2/api/talk/memo/default/send"

# 사용자 토큰
headers = {
  "Content-Type": "application/x-www-form-urlencoded",
  "Authorization": "Bearer " + \
  "aXm2CVceEw7Ym_p63lzST79fF7UKi0haIbu5IfeJCil1KQAAAYFqCfjt"
}

data = {
  "template_object" : json.dumps({ 
  "object_type" : "text",
  "text" : "운전자가 졸고 있습니다.",
  "link" : {
    "web_url" : "http://www.jkelec.co.kr"
  },
 })
}


# 전역변수 선언부 
db = None 
cur = None 

# 접속정보
db = pymysql.connect(host='192.168.0.170', user='root', password='1234123412', db='mysql', charset='utf8')


def calculate_EAR(eye): # 눈 거리 계산
    A = distance.euclidean(eye[1], eye[5])
    B = distance.euclidean(eye[2], eye[4])
    C = distance.euclidean(eye[0], eye[3])
    ear_aspect_ratio = (A+B)/(2.0*C)
    return ear_aspect_ratio

# 카메라 셋팅
cap = cv2.VideoCapture(0)
cap.set(3, 640)
cap.set(4, 480)

# dlib 인식 모델 정의
hog_face_detector = dlib.get_frontal_face_detector()
dlib_facelandmark = dlib.shape_predictor("shape_predictor_68_face_landmarks.dat")

# gpio 셋팅
lastsave = 0
output_pin = 18
GPIO.setmode(GPIO.BCM)
GPIO.setup(output_pin, GPIO.OUT, initial = GPIO.LOW)

def counter(func):
    @wraps(func)
    def tmp(*args, **kwargs):
        tmp.count += 1
        time.sleep(0.05)
        global lastsave
        if time.time() - lastsave > 5:
            lastsave = time.time()
            tmp.count = 0
        return func(*args, **kwargs)
    tmp.count = 0
    return tmp

@counter
def close():
    cv2.putText(frame,"DROWSY",(20,100), cv2.FONT_HERSHEY_SIMPLEX,3,(0,0,255),4)

def sound():
    global curr_value
    GPIO.output(output_pin, GPIO.HIGH)
    time.sleep(3) 
    GPIO.output(output_pin, GPIO.LOW)
    
def sound1():
    global curr_value
    GPIO.output(output_pin, GPIO.HIGH)
    time.sleep(0.3) 
    GPIO.output(output_pin, GPIO.LOW)
    time.sleep(0.3) 
    GPIO.output(output_pin, GPIO.HIGH)
    time.sleep(0.3) 
    GPIO.output(output_pin, GPIO.LOW)
    time.sleep(0.3) 
    GPIO.output(output_pin, GPIO.HIGH)
    time.sleep(0.3) 
    GPIO.output(output_pin, GPIO.LOW)

while True:
    cur = db.cursor() # 커서생성 
    _, frame = cap.read()
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

    faces = hog_face_detector(gray)
    for face in faces:

        face_landmarks = dlib_facelandmark(gray, face)
        leftEye = []
        rightEye = []

        for n in range(36,42): # 오른쪽 눈 감지
            x = face_landmarks.part(n).x
            y = face_landmarks.part(n).y
            leftEye.append((x,y))
            next_point = n+1
            if n == 41:
                next_point = 36
            x2 = face_landmarks.part(next_point).x
            y2 = face_landmarks.part(next_point).y
            cv2.line(frame,(x,y),(x2,y2),(0,255,0),1)

        for n in range(42,48): # 왼쪽 눈 감지
            x = face_landmarks.part(n).x
            y = face_landmarks.part(n).y
            rightEye.append((x,y))
            next_point = n+1
            if n == 47:
                next_point = 42
            x2 = face_landmarks.part(next_point).x
            y2 = face_landmarks.part(next_point).y
            cv2.line(frame,(x,y),(x2,y2),(0,255,0),1)

        left_ear = calculate_EAR(leftEye)
        right_ear = calculate_EAR(rightEye)

        EAR = (left_ear+right_ear)/2
        EAR = round(EAR,2)

        if EAR<0.19:
            close()
            print(f'close count : {close.count}')
            if close.count == 1:
                print("Driver is sleeping")
                sql = "INSERT INTO drowsy(sleep) VALUES ('sleeping')"
                print(sql)
                # 실행할 sql문 
                cur.execute(sql)
                # 커서로 sql문 실행
                db.commit() # 저장
                sound1()
                response = requests.post(url, headers=headers, data=data)
                print(response.status_code)
                if response.json().get('result_code') == 0:
                    print('Message send successed.')
                else:
                    print('Message send failed. : ' + str(response.json()))

            elif close.count == 4:
                print("Driver is sleeping")
                sql = "INSERT INTO drowsy(sleep) VALUES ('Dangerous!!!')"
                print(sql)
                # 실행할 sql문 
                cur.execute(sql)
                # 커서로 sql문 실행
                db.commit() # 저장
                sound()
                response = requests.post(url, headers=headers, data=data)
        print(EAR)

    cv2.imshow("Are you Sleepy", frame)

    key = cv2.waitKey(30)
    if key == 27:
        break
        
cap.release()
cv2.destroyAllWindows()



