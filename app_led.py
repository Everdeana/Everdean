from flask import Flask
import RPi.GPIO as GPIO

app = Flask(__name__)

LED = 8
GPIO.setmode(GPIO.BOARD) # BOARD는 커넥터 pin번호 사용
GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)

@app.route("/")
def helloworld():
	return "Hello World"

@app.route("/led/on")
def led_on():
	return "LED ON"

@app.route("/led/off")
def led_off():
	return "LED OFF"
  
@app.route("/gpio/cleanup")
def gpio_cleanup():
    GPIO.cleanup()
    return "GPIO CLEANUP"

if __name__ == "__main__":
	app.run(host="0.0.0.0")
