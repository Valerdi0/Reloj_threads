/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojthread;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MainWindow extends javax.swing.JFrame implements Runnable {
    
    
    String hora[], min[], seg[];
    int hora1[],min1[],seg1[];
    String id[];
    Thread h1,h2,h3,h4; //Se crea un hilo por cada reloj

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        Calendar cal = new GregorianCalendar();
        Date fecha = new Date();
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
        
        hora1[0]=Integer.parseInt("12");
        min1[0]=Integer.parseInt("00");
        seg1[0]=Integer.parseInt("00");
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelReloj1 = new javax.swing.JLabel();
        LabelReloj3 = new javax.swing.JLabel();
        LabelReloj2 = new javax.swing.JLabel();
        LabelReloj4 = new javax.swing.JLabel();
        TFMinuto = new javax.swing.JTextField();
        TFHora = new javax.swing.JTextField();
        LabelDosPuntos = new javax.swing.JLabel();
        BReloj1 = new javax.swing.JButton();
        BReloj2 = new javax.swing.JButton();
        BReloj3 = new javax.swing.JButton();
        BReloj4 = new javax.swing.JButton();
        TFSegundo = new javax.swing.JTextField();
        LabelHora = new javax.swing.JLabel();
        LabelSegundo = new javax.swing.JLabel();
        BSegReloj1 = new javax.swing.JButton();
        BSegReloj2 = new javax.swing.JButton();
        BSegReloj3 = new javax.swing.JButton();
        BSegReloj4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelReloj1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LabelReloj1.setText("12:00:00");

        LabelReloj3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LabelReloj3.setText("12:00:00");

        LabelReloj2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LabelReloj2.setText("12:00:00");

        LabelReloj4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LabelReloj4.setText("12:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelReloj1)
                    .addComponent(LabelReloj3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelReloj2)
                    .addComponent(LabelReloj4))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelReloj1)
                    .addComponent(LabelReloj2))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelReloj4)
                    .addComponent(LabelReloj3))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        LabelDosPuntos.setText(":");
        LabelDosPuntos.setMinimumSize(new java.awt.Dimension(4, 4));

        BReloj1.setText("Reloj 1");
        BReloj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj1ActionPerformed(evt);
            }
        });

        BReloj2.setText("Reloj 2");
        BReloj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj2ActionPerformed(evt);
            }
        });

        BReloj3.setText("Reloj 3");
        BReloj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj3ActionPerformed(evt);
            }
        });

        BReloj4.setText("Reloj 4");
        BReloj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj4ActionPerformed(evt);
            }
        });

        LabelHora.setText("Hora");

        LabelSegundo.setText("cambio del segundero");

        BSegReloj1.setText("Reloj 1");
        BSegReloj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj1ActionPerformed(evt);
            }
        });

        BSegReloj2.setText("Reloj 2");
        BSegReloj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj2ActionPerformed(evt);
            }
        });

        BSegReloj3.setText("Reloj 3");
        BSegReloj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj3ActionPerformed(evt);
            }
        });

        BSegReloj4.setText("Reloj 4");
        BSegReloj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BReloj1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BReloj2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelDosPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(TFSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BSegReloj3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BSegReloj4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BSegReloj1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BSegReloj2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BReloj3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BReloj4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelSegundo)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHora)
                    .addComponent(LabelSegundo))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDosPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BReloj1)
                    .addComponent(BReloj2)
                    .addComponent(BSegReloj1)
                    .addComponent(BSegReloj2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BReloj3)
                    .addComponent(BReloj4)
                    .addComponent(BSegReloj3)
                    .addComponent(BSegReloj4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BReloj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj1ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
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
        System.out.println("Boton reloj1: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj1ActionPerformed

    private void BReloj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj2ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
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
        System.out.println("Boton reloj2: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj2ActionPerformed

    private void BReloj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj3ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
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
        System.out.println("Boton reloj3: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj3ActionPerformed

    private void BReloj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj4ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
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
        System.out.println("Boton reloj4: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj4ActionPerformed

    private void BSegReloj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj1ActionPerformed
        System.out.println("Boton seg 1: " + this.TFSegundo.getText());
    }//GEN-LAST:event_BSegReloj1ActionPerformed

    private void BSegReloj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj2ActionPerformed
        System.out.println("Boton seg 2: " + this.TFSegundo.getText());
    }//GEN-LAST:event_BSegReloj2ActionPerformed

    private void BSegReloj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj3ActionPerformed
        System.out.println("Boton seg 3: " + this.TFSegundo.getText());
    }//GEN-LAST:event_BSegReloj3ActionPerformed

    private void BSegReloj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj4ActionPerformed
        System.out.println("Boton seg 4: " + this.TFSegundo.getText());
    }//GEN-LAST:event_BSegReloj4ActionPerformed

    public void run(){

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReloj1;
    private javax.swing.JButton BReloj2;
    private javax.swing.JButton BReloj3;
    private javax.swing.JButton BReloj4;
    private javax.swing.JButton BSegReloj1;
    private javax.swing.JButton BSegReloj2;
    private javax.swing.JButton BSegReloj3;
    private javax.swing.JButton BSegReloj4;
    private javax.swing.JLabel LabelDosPuntos;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelReloj1;
    private javax.swing.JLabel LabelReloj2;
    private javax.swing.JLabel LabelReloj3;
    private javax.swing.JLabel LabelReloj4;
    private javax.swing.JLabel LabelSegundo;
    private javax.swing.JTextField TFHora;
    private javax.swing.JTextField TFMinuto;
    private javax.swing.JTextField TFSegundo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
