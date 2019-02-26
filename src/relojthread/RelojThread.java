/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojthread;

/**
 *
 * @author Daniel
 */
public class RelojThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindow v = new MainWindow();
        RelojHilo rj = new RelojHilo(v.LabelReloj1, v.LabelReloj2, v.LabelReloj3, v.LabelReloj4);
        v.relojHilo = rj;
        v.setVisible(true);
    }
    
}
