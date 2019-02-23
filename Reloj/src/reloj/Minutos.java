/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Rubén Guerra
 */
public class Minutos extends Thread{
    private int hora;
    private int minuto;
    private int segundo;
    private int velocidad;
    private int noReloj;
    
    public Minutos(int noReloj) {
        this.noReloj = noReloj;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    @Override
    public void run() {
        for (segundo = 0; segundo <= 60; segundo++) {
            this.esperarXsegundos(velocidad);
            if(segundo==60){
                minuto++;
                segundo=0;
                if(minuto==60){
                    hora++;
                    minuto=0;
                    if(hora==24){
                        hora=0;
                    }
                }
            } 
            System.out.println("Hora" + noReloj + ": " + hora + ":" + minuto + ":" + segundo + "\n");
        }
        
    }

    private void esperarXsegundos(int velocidad) {
        try {
            Thread.sleep(velocidad);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
