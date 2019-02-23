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
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Minutos reloj1 = new Minutos(1);
        Minutos reloj2 = new Minutos(2);
        Minutos reloj3 = new Minutos(3);
        Minutos reloj4 = new Minutos(4);
        
        reloj1.setHora(0);
        reloj1.setMinuto(0);
        reloj1.setVelocidad(1000);
        
        reloj2.setHora(1);
        reloj2.setMinuto(0);
        reloj2.setVelocidad(1000);
        
        reloj3.setHora(2);
        reloj3.setMinuto(0);
        reloj3.setVelocidad(1000);
        
        reloj4.setHora(3);
        reloj4.setMinuto(0);
        reloj4.setVelocidad(1000);
        
        
        reloj1.start();
        reloj2.start();
        reloj3.start();
        reloj4.start();
    }
}
