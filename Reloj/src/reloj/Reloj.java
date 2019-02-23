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
	Minutos reloj1 = new Minutos(0,0,1000,1);
        Minutos reloj2 = new Minutos(12,0,100,2);
        Minutos reloj3 = new Minutos(6,0,10,3);
        Minutos reloj4 = new Minutos(18,0,1,4);
        
        reloj1.start();
        reloj2.start();
        reloj3.start();
        reloj4.start();
    }
}
