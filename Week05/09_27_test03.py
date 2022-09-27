from cProfile import label
from cgitb import text
from tkinter import *
from tkinter.filedialog import *

window = Tk() # 윈도우 생성
window.geometry("400x100") # 윈도우 크기(너비와 높이: width, height)

label1 = Label(window, text = "선택된 파일 저장 경로")
label1.pack()

filename = askopenfilename(parent = window, filetypes = (("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
label1.config(text = str(filename))

window.mainloop()