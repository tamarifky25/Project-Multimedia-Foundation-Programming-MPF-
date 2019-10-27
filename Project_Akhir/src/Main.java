
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Image burger,chicken,taco,nachos,pizza,nugget,bucket,panah;
    String burgerID="FD01";
    String chickenID="FD02";
    String tacoID="FD03";
    String nachosID="FD04";
    String pizzaID="FD05";
    String nuggetID="FD06";
    
    Vector<String>ID = new Vector<String>();
    Vector<String> order = new Vector<String>();
    Vector<Integer>Qty = new Vector<Integer>();
    
    String UserName, Password;
    
    
    public Main() {
        initComponents();
        setBounds(400, 100, 1500, 800);
        burger = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\hamburger.jpg").getImage();
        chicken = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\fried-chicken.jpg").getImage();
        taco = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\taco.jpg").getImage();
        nachos = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\nachos-beef.jpg").getImage();
        pizza = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\pizza-pepperoni.jpg").getImage();
        nugget = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\nugget.jpeg").getImage();
        bucket = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\bucket.png").getImage();
       
    }
     public Main(String Username, String password) {
        initComponents();
        setBounds(400, 100, 1500, 800);
        burger = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\hamburger.jpg").getImage();
        chicken = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\fried-chicken.jpg").getImage();
        taco = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\taco.jpg").getImage();
        nachos = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\nachos-beef.jpg").getImage();
        pizza = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\pizza-pepperoni.jpg").getImage();
        nugget = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\nugget.jpeg").getImage();
        bucket = new ImageIcon("D:\\Project Akhir_MPF\\Assets\\food\\bucket.png").getImage();
       

        this.UserName = Username;
        this.Password = password;
    }
       int burgerPos=0;
    int chickenPos=0;
    int tacoPos=0;
    int nachosPos=0;
    int pizzaPos=0;
    int nuggetPos=0;
    int panahpos=0;
  
    int total=0;
    int [] totalInserted = new int [6];
    
    int BurgerPosX=40;
    int BurgerPosY=90;
    
    int BurgerWidth = 250;
    int BurgerHeight=150;

    int BurgerMoveX=100;
    int BurgerMoveY=100;
    
    boolean burgerDragged = false;
    
    
    int TacoPosX=40;
    int TacoPosY=340;
    
    int TacoWidth = 250;
    int TacoHeight=150;   

    int TacoMoveX=100;
    int TacoMoveY=100;
    
    boolean tacoDragged=false;
    
    
    int ChickenPosX=390;
    int ChickenPosY=90;
    
    int ChickenWidth = 250;
    int ChickenHeight=150;
    
    int ChickenMoveX=100;
    int ChickenMoveY=100;
    
    boolean chickenDragged=false;
    
    
    int NuggetPosX=40;
    int NuggetPosY=590;
    
    int NuggetWidth = 250;
    int NuggetHeight=150;   

    int NuggetMoveX=100;
    int NuggetMoveY=100;
    
    boolean nuggetDragged=false; 
    
    
    int PizzaPosX=390;
    int PizzaPosY=590;
    
    int PizzaWidth = 250;
    int PizzaHeight=150;
    

    int PizzamoveX=100;
    int PizzamoveY=100;
    
    boolean pizzaDragged=false; 
    
    
    int NachosPosX=390;
    int NachosPosY=340;
    
    int NachosWidth = 250;
    int NachosHeight=150;    

    int NachosMoveX=100;
    int NachosMoveY=100;
    
    boolean nachosDragged=false;
    
      
    int InstructPosX=750;
    int InstructPosY=390;
    
    int InstructWidth = 500;
    int InstructHeight=200;
    
    int BucketPosX=825;
    int BucketPosY=440;
    
    int BucketWidth =300;
    int BucketHeight=300;
    
    String instruction = new String("Throw food into the bucket to order!");
     @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        g2d.drawImage(burger, BurgerPosX, BurgerPosY, BurgerWidth, BurgerHeight, null);
        g2d.drawImage(chicken, ChickenPosX, ChickenPosY, ChickenWidth, ChickenHeight, null);
        g2d.drawImage(taco, TacoPosX, TacoPosY, TacoWidth, TacoHeight, null);
        g2d.drawImage(nachos, NachosPosX, NachosPosY, NachosWidth, NachosHeight, null);
        g2d.drawImage(pizza, PizzaPosX, PizzaPosY, PizzaWidth, PizzaHeight, null);
        g2d.drawImage(nugget, NuggetPosX, NuggetPosY, NuggetWidth, NuggetHeight, null);
        g2d.drawImage(bucket, BucketPosX, BucketPosY, BucketWidth, BucketHeight, null);
        
        if (burgerDragged){
            g2d.drawImage(burger, BurgerMoveX, BurgerMoveY, BurgerWidth/2, BurgerHeight/2, null);
        }
        
        else if (chickenDragged){
            g2d.drawImage(chicken, ChickenMoveX, ChickenMoveY, ChickenWidth/2, ChickenHeight/2, null);
        }
 
        else if (tacoDragged){
            g2d.drawImage(taco, TacoMoveX, TacoMoveY, TacoWidth/2, TacoHeight/2, null);
        }
        
        else if (nachosDragged){
            g2d.drawImage(nachos, NachosMoveX, NachosMoveY, NachosWidth/2, NachosHeight/2, null);
        }
        
        else if (nuggetDragged){
            g2d.drawImage(nugget, NuggetMoveX, NuggetMoveY, NuggetWidth/2, NuggetHeight/2, null);
        }
        
        else if (pizzaDragged){
            g2d.drawImage(pizza, PizzamoveX, PizzamoveY, PizzaWidth/2, PizzaHeight/2, null);
        }
        
        
        
        Font font = new Font(instruction, Font.BOLD, 30);
        g2d.setColor(Color.yellow);
        g2d.setFont(font);
        g2d.drawString(instruction, InstructPosX, InstructPosY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel3.setBackground(new java.awt.Color(147, 22, 33));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel3);

        jMenuBar1.setBackground(new java.awt.Color(228, 231, 231));

        jMenu1.setText("Transaction");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Cart");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Profile");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
         new Video().setVisible(false);
        this.setVisible(false);
        
  

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
                
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        for (int i = 0; i < total; i++){
            if(totalInserted[i] == 1){
                ID.add(burgerID);
                Qty.add(i, burgerPos);
            }
            
            else if(totalInserted[i] == 2){
                ID.add(chickenID);
                Qty.add(i,chickenPos);
            }
            else if(totalInserted[i] == 3){
                ID.add(tacoID);
                Qty.add(i,tacoPos);
            }
            else if(totalInserted[i] == 4){
                ID.add(nachosID);
                Qty.add(i, nachosPos);
            }
            else if(totalInserted[i] == 5){
                ID.add(pizzaID);
                Qty.add(i,pizzaPos);
            }
            else if(totalInserted[i] == 6){
                ID.add(nuggetID);
                Qty.add(i,nuggetPos);
                
            }
        }
        
        
        Cart c = new Cart(ID,Qty,total);
        c.show();
        this.setVisible(false);
           }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        // TODO add your handling code here:
        if(evt.getX()>=BurgerPosX && evt.getX()<=BurgerPosX+BurgerWidth
            &&evt.getY()>=BurgerPosY && evt.getY()<=BurgerPosY+BurgerHeight){
            burgerDragged=true;   
        }
        
        
            if(evt.getX()>=ChickenPosX && evt.getX()<=ChickenPosX+ChickenWidth
            &&evt.getY()>=ChickenPosY && evt.getY()<=ChickenPosY+ChickenHeight){
            chickenDragged=true;   
        }
        
       
            if(evt.getX()>=TacoPosX && evt.getX()<=TacoPosX+TacoWidth
            &&evt.getY()>=TacoPosY && evt.getY()<=TacoPosY+TacoHeight){
            tacoDragged=true;   
        }
         
        
            if(evt.getX()>=NachosPosX && evt.getX()<=NachosPosX+NachosWidth
            &&evt.getY()>=NachosPosY && evt.getY()<=NachosPosY+NachosHeight){
            nachosDragged=true;   
        }    
            
          
            if(evt.getX()>=NuggetPosX && evt.getX()<=NuggetPosX+NuggetWidth
            &&evt.getY()>=NuggetPosY && evt.getY()<=NuggetPosY+NuggetHeight){
            nuggetDragged=true;   
        }    
        
         
            if(evt.getX()>=PizzaPosX && evt.getX()<=PizzaPosX+PizzaWidth
            &&evt.getY()>=PizzaPosY && evt.getY()<=PizzaPosY+PizzaHeight){
            pizzaDragged=true;   
        }
    }//GEN-LAST:event_jPanel3MouseMoved

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
         if(burgerDragged){
            BurgerMoveX=evt.getX()-(BurgerWidth/8)-10;
            BurgerMoveY=evt.getY()-(BurgerHeight/8)+40;
            repaint();
        }
        
        
        else if(chickenDragged){
            ChickenMoveX=evt.getX()-(ChickenWidth/8)-10;
            ChickenMoveY=evt.getY()-(ChickenHeight/8)+40;
            repaint();
        }
        
       
        else if(tacoDragged){
            TacoMoveX=evt.getX()-(TacoWidth/8)-10;
            TacoMoveY=evt.getY()-(TacoHeight/8)+40;
            repaint();
        }
        
        
        else if(nachosDragged){
            NachosMoveX=evt.getX()-(NachosWidth/8)-10;
            NachosMoveY=evt.getY()-(NachosHeight/8)+40;
            repaint();
        }    
        
        
        else if(nuggetDragged){
            NuggetMoveX=evt.getX()-(NuggetWidth/8)-10;
            NuggetMoveY=evt.getY()-(NuggetHeight/8)+40;
            repaint();
        }
                     
        
        else if(pizzaDragged){
            PizzamoveX=evt.getX()-(PizzaWidth/8)-10;
            PizzamoveY=evt.getY()-(PizzaHeight/8)+40;
            repaint();
        }
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
         if(evt.getX()>=BucketPosX&&evt.getX()<=BucketPosX+250&&evt.getY()>=BucketPosY&&evt.getY()<=BucketPosY+350){
            if(burgerDragged==true){
            
                if(burgerPos==0){
                    totalInserted[total]=1;
                    total++;   
                }
                burgerDragged=false;
                BurgerMoveX=BurgerPosX;
                BurgerMoveY=BurgerPosY;
                repaint();
                burgerPos++;
                JOptionPane.showMessageDialog(rootPane, "FD01 Successfully Added!");
            }
            
            else if(chickenDragged==true){
            
                if(chickenPos==0){
                    totalInserted[total]=2;
                    total++;   
                }
                chickenDragged=false;
                ChickenMoveX=ChickenPosX;
                ChickenMoveY=ChickenPosY;
                repaint();
                chickenPos++;
                
                JOptionPane.showMessageDialog(rootPane, "FD02 Successfully Added!");
            }
            
            else if(tacoDragged==true){
            
                if(tacoPos==0){
                    totalInserted[total]=3;
                    total++;   
                }
                tacoDragged=false;
                TacoMoveX=TacoPosX;
                TacoMoveY=TacoPosY;
                repaint();
                tacoPos++;
                
                JOptionPane.showMessageDialog(rootPane, "FD03 Successfully Added!");
            }
            
            else if(nachosDragged==true){
            
                if(nachosPos==0){
                    totalInserted[total]=4;
                    total++;   
                }
                nachosDragged=false;
                NachosMoveX=NachosPosX;
                NachosMoveY=NachosPosY;
                repaint();
                nachosPos++;
                
                JOptionPane.showMessageDialog(rootPane, "FD04 Successfully Added!");
            }
            
            else if(nuggetDragged==true){
            
                if(nuggetPos==0){
                    totalInserted[total]=6;
                    total++;   
                }
                nuggetDragged=false;
                NuggetMoveX=NuggetPosX;
                NuggetMoveY=NuggetPosY;
                repaint();
                nuggetPos++;
                
                JOptionPane.showMessageDialog(rootPane, "FD06 Successfully Added!");
            }
            
            else if(pizzaDragged==true){
            
                if(pizzaPos==0){
                    totalInserted[total]=5;
                    total++;   
                }
                pizzaDragged=false;
                PizzamoveX=PizzaPosX;
                PizzamoveY=PizzaPosY;
                repaint();
                pizzaPos++;
                
                JOptionPane.showMessageDialog(rootPane, "FD05 Successfully Added!");
            }
        }else{
             
               if (burgerDragged){
                burgerDragged=false;
                BurgerMoveX=BurgerPosX;
                BurgerMoveY=BurgerPosY;
                repaint();
               }

        
               else if(chickenDragged){
                chickenDragged=false;
                ChickenMoveX=ChickenPosX;
                ChickenMoveY=ChickenPosY;
                repaint();
                }
        
               else if(tacoDragged){
                tacoDragged=false;
                TacoMoveX=TacoPosX;
                TacoMoveY=TacoPosY;
                repaint();
                }

        
               else if (nachosDragged){
                nachosDragged=false;
                NachosMoveX=NachosPosX;
                NachosMoveY=NachosPosY;
                repaint();
               }

        
               else if (nuggetDragged){
                nuggetDragged=false;
                NuggetMoveX=NuggetPosX;
                NuggetMoveY=NuggetPosY;
                repaint();
               }

      
               else if (pizzaDragged){
                pizzaDragged=false;
                PizzamoveX=PizzaPosX;
                PizzamoveY=PizzaPosY;
                repaint();
               }
        }
        burgerDragged=chickenDragged=tacoDragged=nachosDragged=pizzaDragged=nuggetDragged=false;
    }//GEN-LAST:event_jPanel3MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
