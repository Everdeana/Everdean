from flask import Flask
import RPi.GPIO as GPIO

app = Flask(__name__)

LED = 8
GPIO.setmode(GPIO.BOARD) # BOARD는 커넥터 pin번호 사용
GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)

@app.route("/")
def helloworld():
	return "Hello World"

@app.route("/led/<state>")
def led(state):
    if state == "on":
      GPIO.output(LED, GPIO.HIGH)
    else:
      GPIO.output(LED, GPIO.LOW)
    return "LED " + state
  
@app.route("/gpio/cleanup")
def gpio_cleanup():
    GPIO.cleanup()
    return "GPIO CLEANUP"

if __name__ == "__main__":
	app.run(host="0.0.0.0")
