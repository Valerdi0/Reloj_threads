import tkinter
import threading
from time import strftime

root = tkinter.Tk()
root.title('Digital clock')
myClock = tkinter.Label(root)
myClock['text'] = '21:28:00'
myClock.pack()
myClock['font'] = 'Tahoma 100 bold'

myClock1 = tkinter.Label(root)
myClock1['text'] = '21:28:00'
myClock1.pack()
myClock1['font'] = 'Tahoma 100 bold'

myClock2 = tkinter.Label(root)
myClock2['text'] = '21:28:00'
myClock2.pack()
myClock2['font'] = 'Tahoma 100 bold'


def tic(myClock):
	myClock['text'] = strftime('%H:%M:%S')


def tac(myClock):
	tic(myClock)
	myClock.after(1000, tac, myClock)

t1 = threading.Thread(target=tac, args=(myClock,))
t1.start()

t2 = threading.Thread(target=tac, args=(myClock1,))
t2.start()

t3 = threading.Thread(target=tac, args=(myClock2,))
t3.start()


myClock['fg'] = 'black'
myClock['bg'] = '#af25f0'

myClock1['bg'] = '#aff5f0'

myClock2['bg'] = '#af2000'

root.mainloop()
