from tkinter import *

window = Tk()

label1 = Label(window, text = "SmartIT, 데이터 분석 과정")
label2 = Label(window, text = "Study Hard", font = ("맑은고딕", 30), fg = "blue")
label3 = Label(window, text = "More Hard", bg = "magenta", width = 20, height  = 5, anchor = SE)

label1.pack()
label2.pack()
label3.pack()

window.mainloop()
