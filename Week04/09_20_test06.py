from tkinter import *

window = Tk() # Object Variables provided by tkinter
print(type(window))
window.title("Window")
window.geometry("400x100")
'''
(variable) geometry: Overload[(newGeometry: None = ...)
    -> str, (newGeometry: str) -> None]
Set geometry to NEWGEOMETRY of the form =widthxheight+x+y. 
Return current value if None is given.
'''
window.resizable(width = False, height = False) # Window size can't be changed
window.mainloop()
