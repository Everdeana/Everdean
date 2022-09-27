from tkinter import *
from tkinter.filedialog import *

# 이미지를 불러오는(열기) 함수 선언
def func_open():
    filename = askopenfilename(parent=window, filetypes=(("GIF파일", "*gif"), ("모든파일", "*.*")))
    photo = PhotoImage(file=filename)
    pLabel.config(image=photo)
    pLabel.image = photo

def func_exit():
    window.quit()
    window.destroy()



# 윈도우 생성
window = Tk()
window.geometry("500x500")
window.title("Picture Output")
photo = PhotoImage()
pLabel = Label(window, image=photo)
pLabel.pack(expand=1, anchor=CENTER)

mainMenu = Menu(window)  #메뉴
window.config(menu=mainMenu)
fileMenu = Menu(mainMenu)
mainMenu.add_cascade(label = "파일", menu=fileMenu) # 상위 메뉴
fileMenu.add_command(label = "파일열기", command=func_open) #함수(파일 열기), 하위 메뉴
fileMenu.add_separator()
fileMenu.add_command(label="프로그램종료", command=func_exit) #함수(프로그램 종료)

window.mainloop()
