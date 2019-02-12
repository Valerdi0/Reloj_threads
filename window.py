from tkinter import *
import sys

class MainWindow(object):
    """docstring for Window"""
    def __init__(self):
        super(MainWindow, self).__init__()
        # Configuracion de la ventana
        self.root = Tk()
        self.root.title("Reloj - Practica1")
        self.root.resizable(True,True)
        #self.root.geometry('600x600')
        self.root.config(bg="blue")

        if sys.platform.startswith('win'):
        	self.root.iconbitmap("favicon.ico")

		# Configuracion del frame

        self.frame = Frame(self.root, width=600, height=600)
        self.frame.pack(expand=True, padx=30, pady=30)

        self.frame_btns = Frame(self.root)
        self.frame_btns.pack(expand=True, padx=30, pady=30)

        # Inicializacion de los relojes
        self.clocks = [Label(self.frame, text="12:00:00", font=("Arial Bold", 50), padx=40, pady=40)]
        self.clocks[0].grid(column=0, row=0)

        self.clocks.append(Label(self.frame, text="12:00:00", font=("Arial Bold", 50), padx=40, pady=40))
        self.clocks[1].grid(column=1, row=0)

        self.clocks.append(Label(self.frame, text="12:00:00", font=("Arial Bold", 50), padx=40, pady=40))
        self.clocks[2].grid(column=0, row=1)

        self.clocks.append(Label(self.frame, text="12:00:00", font=("Arial Bold", 50), padx=40, pady=40))
        self.clocks[3].grid(column=1, row=1)

        #Configuracion de Labels y entry
        self.labelHour = Label(self.frame_btns, text="Hora:")
        self.labelHour.grid(row=0, column=0, sticky='e')

        self.labelMinute = Label(self.frame_btns, text="Minutos:")
        self.labelMinute.grid(row=0, column=2, sticky='e')

        self.hour = Entry(self.frame_btns, width=3)
        self.hour.grid(row=0, column=1, padx=10, pady=10, sticky='w')

        self.minutes = Entry(self.frame_btns, width=3)
        self.minutes.grid(row=0, column=3, padx=10, pady=10, sticky='w')

        self.btn_clock1 = Button(self.frame_btns, text="Actualizar clock 1") # faltaria agregar el parametro command=funcion_que_actualice_reloj()
        self.btn_clock1.grid(row=1, column=0, pady=10, padx=10)

        self.btn_clock2 = Button(self.frame_btns, text="Actualizar clock 2") # faltaria agregar el parametro command=funcion_que_actualice_reloj()
        self.btn_clock2.grid(row=1, column=1, pady=10, padx=10)

        self.btn_clock3 = Button(self.frame_btns, text="Actualizar clock 3") # faltaria agregar el parametro command=funcion_que_actualice_reloj()
        self.btn_clock3.grid(row=1, column=2, pady=10, padx=10)

        self.btn_clock4 = Button(self.frame_btns, text="Actualizar clock 4") # faltaria agregar el parametro command=funcion_que_actualice_reloj()
        self.btn_clock4.grid(row=1, column=3, pady=10, padx=10)

        self.label_second = Label(self.frame_btns, text="Tiempo en ms para cambiar los segundos")
        self.label_second.grid(row=2, column=0)

        self.second = Entry(self.frame_btns, width=4)
        self.second.grid(row=2, column=1)

        self.btn_second = Button(self.frame_btns, text="Actualizar segundos")
        self.btn_second.grid(row=2, column=2)





if __name__ == '__main__':
	app = MainWindow()
	app.root.mainloop()
