import java.util.*;
import javax.swing.JOptionPane;

public class Reloj extends javax.swing.JFrame implements Runnable {

       String hora[], min[], seg[];
       int hora1[],min1[],seg1[];
       String id[];
       Thread h1,h2,h3,h4; //Se crea un hilo por cada reloj
       
       
    public Reloj() {
        Calendar cal= new GregorianCalendar();
        Date fecha=new Date();
        cal.setTime(fecha);
        
        hora = new String[4];
        min = new String[4];
        seg = new String[4];
        
        hora1 = new int[4];
        min1 = new int[4];
        seg1 = new int[4];
        id = new String [4]; 
       
        
       //Hora aleatoria para 3 relojes
       hora1[1] = (int) (Math.random() * 24);
       min1[1] = (int) (Math.random() * 60);
       seg1[1] = (int) (Math.random() * 60);
       hora1[2] = (int) (Math.random() * 24);
       min1[2] = (int) (Math.random() * 60);
       seg1[2] = (int) (Math.random() * 60);
       hora1[3] = (int) (Math.random() * 24);
       min1[3] = (int) (Math.random() * 60);
       seg1[3] = (int) (Math.random() * 60);
        
        /*hora1[0]=Integer.parseInt(hora[0]);
        min1[0]=Integer.parseInt(min[0]);
        seg1[0]=Integer.parseInt(seg[0]);*/
        
        initComponents();
        
        
        h1=new Thread(this);
        h2=new Thread(this);
        h3=new Thread(this);
        h4=new Thread(this);
        
        //Se obtiene el nombre de cada hilo
        id[0]=h1.getName();
        id[1]=h2.getName();
        id[2]=h3.getName();
        id[3]=h4.getName();
        
        //Se lanzan los hilos
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {}
    

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {                                     
       //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=text1.getText();
        String M=text2.getText();
        
        //Se verifica que no esten vacias
       if(H.equals("")||M.equals("")){
           JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
           h1=new Thread(this);//Si no hay datos, que siga su marcha el reloj
           id[0]=h1.getName();
           h1.start();
        }
       else{
           //Se verifica que las horas no sean mayores de 24 y los minutos de 60
           	int x=Integer.parseInt(H);
           	int y=Integer.parseInt(M);
       		if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
		       hora1[0]=Integer.parseInt(H);
		       min1[0]=Integer.parseInt(M);
		       h1=new Thread(this);
		       id[0]=h1.getName();
		       h1.start();
		    }
       		else{
		       	JOptionPane.showMessageDialog(null, "Los valores no son validos");
		       	h1=new Thread(this);
		       	id[0]=h1.getName();
		       	h1.start();
       		}
       }
    }                                    
                                 

    private void guardar1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        String H=text3.getText();
        String M=text4.getText();
        
        
		if(H.equals("")||M.equals("")){
			JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
			h2=new Thread(this);
			id[1]=h2.getName();
			h2.start();
		}
		else{
			int x=Integer.parseInt(H);
			int y=Integer.parseInt(M);
			if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
				hora1[1]=Integer.parseInt(H);
				min1[1]=Integer.parseInt(M);
				h2=new Thread(this);
				id[1]=h2.getName();
				h2.start();
			}
			else{
				JOptionPane.showMessageDialog(null, "Los valores no son validos");
				h2=new Thread(this);
				id[1]=h2.getName();
				h2.start();
			}
		}
    }                                     
                                   

    private void guardar2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        String H=text5.getText();
        String M=text6.getText();
        
        
       if(H.equals("")||M.equals("")){
           JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
           h3=new Thread(this);
           id[2]=h3.getName();
           h3.start();
        }
       	else{
           	int x=Integer.parseInt(H);
           	int y=Integer.parseInt(M);
		    if((x>=0&&x<=24)&&(y>=0&&y<=59)){  
		       hora1[2]=Integer.parseInt(H);
		       min1[2]=Integer.parseInt(M);
		       h3=new Thread(this);
		       id[2]=h3.getName();
		       h3.start();
		   	}
		   	else{
		       JOptionPane.showMessageDialog(null, "Los valores no son validos");
		       h3=new Thread(this);
		       id[2]=h3.getName();
		       h3.start();
		   	}
       	}
    }                                     
                                  

    private void guardar3MouseClicked(java.awt.event.MouseEvent evt) {                                      
       	String cambioH=text7.getText();
        String cambioM=text8.getText();
        
        
       if(cambioH.equals("")||cambioM.equals("")){
           JOptionPane.showMessageDialog(null, "Tienes quw ingresar datos");
           h4=new Thread(this);
           id[3]=h4.getName();
           h4.start();
        }
       else{
           int x=Integer.parseInt(cambioH);
           int y=Integer.parseInt(cambioM);
        if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
       hora1[3]=Integer.parseInt(cambioH);
       min1[3]=Integer.parseInt(cambioM);
       h4=new Thread(this);
       id[3]=h4.getName();
       h4.start();
       }
       else{
           JOptionPane.showMessageDialog(null, "Los valores no son validos");
           h4=new Thread(this);
           id[3]=h4.getName();
           h4.start();
       }
       }
    }                                     

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void guardar3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton Cambiar;
    private javax.swing.JButton Cambiar1;
    private javax.swing.JButton Cambiar2;
    private javax.swing.JButton Cambiar3;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar2;
    private javax.swing.JButton guardar3;
    private javax.swing.JLabel reloj1;
    private javax.swing.JLabel reloj2;
    private javax.swing.JLabel reloj3;
    private javax.swing.JLabel reloj4;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text8;
    // End of variables declaration  

    public void run(){

    }

    public static void main(String[] args)
    {
        Reloj r = new Reloj();
        r.setVisible(true);

    }
    
} 
