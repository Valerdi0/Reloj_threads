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
    private int velocidad;
    private int noReloj;
    
    public Minutos(int hora, int minuto, int velocidad, int noReloj) {
        this.hora = hora;
        this.minuto = minuto;
        this.velocidad = velocidad;
        this.noReloj = noReloj;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= 60; i++) {
            this.esperarXsegundos(velocidad);
            if(i==60){
                minuto++;
                i=0;
                if(minuto==60){
                    hora++;
                    minuto=0;
                    if(hora==24){
                        hora=0;
                    }
                }
            } 
            System.out.println("Hora" + noReloj + ": " + hora + ":" + minuto + ":" + i + "\n");
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
