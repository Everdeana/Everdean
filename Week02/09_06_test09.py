# import turtle
from turtle import *
color('red', 'yellow') # ('선', '채우기')
begin_fill()
while True:
    forward(200)
    left(170)
    if abs(pos()) < 1: 
        break
end_fill()
done()