

import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ForgotPassword extends javax.swing.JFrame {

    
    
    String ques,ans,username;
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    /*public ForgotPassword(String q,String a,String u) {
        ques=q;
        ans=a;
        username=u;
        initComponents();
         this.setLocationRelativeTo(null);
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setVisible(false);
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jCheckBox1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jTextField1.setVisible(false);
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(699, 576));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(699, 576));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 100));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(699, 576));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 123, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 166, 243, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter new Password:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 238, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Retype Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 287, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 197, -1));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 197, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Update Password");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 165, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 255));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show hidden characters");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Username:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 26, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 243, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Back to Login Page");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String ansIn=jTextField1.getText();
        String username = jTextField2.getText();
       
            
             if(ansIn.equals(ans))
                    {
                        JOptionPane.showMessageDialog(null, "Answers match!");
                        jLabel3.setVisible(true);
                        jLabel4.setVisible(true);
                        jPasswordField1.setVisible(true);
                        jPasswordField2.setVisible(true);
                        jButton1.setVisible(true); 
                        jCheckBox1.setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Answer doesn't match with database answer, Try again!", "Error", JOptionPane.ERROR_MESSAGE);
                        jTextField1.setText("");
                    }

        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String password=jPasswordField1.getText();
        String retyp=jPasswordField2.getText();
        username=jTextField2.getText();
        if(password.equals(retyp))
        {
            String url="jdbc:mysql://localhost:3306/sys";
            String mysqluname="root";
            String mysqlpass="mysql";
            String query=" UPDATE registrations SET pwd = \""+password+"\" WHERE username = \""+username+"\";";
            System.out.println(query);
            //String create="CREATE TABLE IF NOT EXISTS rLOL5( checkin DATE , checkout DATE);";
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            
           // s.execute(create);
            int cnt = s.executeUpdate(query);
           // s.execute(create);
          //  System.out.println("Details submitted successfully");
            s.close();
            c.close();
            
            }
            catch(Exception e){}
            
            JOptionPane.showMessageDialog(null, "Password has been changed successfully!");
            Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Password and retyped password don't match. Try again!", "Error", JOptionPane.ERROR_MESSAGE);
            jPasswordField1.setText("");
            jPasswordField2.setText("");
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
            jPasswordField2.setEchoChar((char)0);
        }
        else
        {
            jPasswordField1.setEchoChar('*');
            jPasswordField2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        System.out.println("LOL");
        username=jTextField2.getText();
        
        if(username.equals(""))
            JOptionPane.showMessageDialog(null, "Please enter a username!", "Error", JOptionPane.ERROR_MESSAGE);
        else{ 
        
        String url="jdbc:mysql://localhost:3306/sys";
            String mysqluname="root";
            String mysqlpass="mysql";
            boolean f =false;
            String query="select * from registrations";
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            ResultSet rs = s.executeQuery(query);
            //System.out.println("Details submitted successfully");
            int i=0;
            while (rs.next())
            {
               // System.out.println("while"+(i++));
                if(username.equals(rs.getString(5))&&!rs.getString(7).equals("---select---"))
                {
                                     //  System.out.println(rs.getString(7));
                                      // System.out.println(rs.getString(8));
                    ans=rs.getString(8);
                    ques=rs.getString(7);
                    jButton2.setVisible(true);
                    f=true;
                    break;} 
                
                
                if(username.equals(rs.getString(5))&&rs.getString(7).equals("---select---"))
                { 
                    JOptionPane.showMessageDialog(null, "Sorry! No security question was submitted during registration. Cannot change password.", "Error", JOptionPane.ERROR_MESSAGE);
                   Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
                    break;
                }
                
            }
           
            if(f==false)
                JOptionPane.showMessageDialog(null, "Sorry! This username doesn't exist in our system.");
            else
            {
                 jLabel2.setText(ques);
            jLabel2.setVisible(true);
        jTextField1.setVisible(true);
       // jButton1.setVisible(true);
            }
                
          
            s.close();
            c.close();
    }
            catch(Exception e){}
        
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
