
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import java.text.SimpleDateFormat;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garvit
 */
public class YourBookings extends javax.swing.JFrame {
      String username = "";
      String name;
      String ref;
      //int row=-1;
      int noofppl;
      int noofrooms;
      String bookref;
    //  String location;
    /**
     * Creates new form YourBookings
     */
    public YourBookings(String u,String n) {
        username=u;
        name =n;
        this.setLocationRelativeTo(null);
        initComponents();
        
        showTable();
    }
     public YourBookings() {
       
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
    }

    public void showTable()
    {
        
         String url="jdbc:mysql://localhost:3306/sys";
            String mysqluname="root";
            String mysqlpass="mysql";
            String query ="select * from bookinglist";

        try{

      Class.forName("com.mysql.jdbc.Driver");
          
            Connection c = DriverManager.getConnection(url,mysqluname,mysqlpass);
            Statement s=c.createStatement();
            ResultSet rs = s.executeQuery(query);
            
        while(rs.next())
        {
            String user = rs.getString(1);
            if(user.equals(username))
            {        
             bookref = rs.getString(2);
            String loc = rs.getString(3);
            String hotel =rs.getString(4);
            String room = rs.getString(5);
            String checkin = rs.getString(6);
            //int(i=0);i<
            String checkout = rs.getString(7);
            String noofguests=rs.getString(8);
             String noofrooms=rs.getString(9);
             
             
            
           // System.out.println(bookref+"LOL");
            
            Object[] content = {bookref, loc, hotel, room,noofguests,noofrooms, checkin, checkout};
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(content);
            }
        }
        }catch(Exception e){}
        
        
        JTableHeader Theader = jTable1.getTableHeader();
        
       // Theader.setBackground(Color.WHITE); // change the Background color
        Theader.setForeground(Color.BLACK); // change the Foreground
        
        Theader.setFont(new Font("Tahoma", Font.BOLD, 18)); // font name style size
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableColumnModel colModel=jTable1.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(200); 
        colModel.getColumn(1).setPreferredWidth(85); 
        colModel.getColumn(2).setPreferredWidth(130);
        colModel.getColumn(3).setPreferredWidth(90); 
          
       // ((DefaultTableCellRenderer)Theader.getDefaultRenderer())
         //       .setHorizontalAlignment(JLabel.CENTER); // center header text
        
       // table.setFont(new Font("Tahoma", Font.BOLD, 15));
        //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1.getViewport().setBackground(Color.BLUE);
        //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setMinimumSize(new java.awt.Dimension(1240, 572));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1240, 572));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Bookings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1000, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 80));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Modify Booking");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(0, 0, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking Reference No.", "Location", "Hotel Name", "Room Type", "No. of guests", "No. of rooms", "Check-In", "Check-Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 255));
        jTable1.setRowHeight(21);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 0));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Cancel Booking");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Sign Out");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jButton2)
                .addGap(55, 55, 55)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton4)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1240, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        int index = jTable1.getSelectedRow();
        if(index==-1)
        {
            JOptionPane.showMessageDialog (null, "Please select a booking to modify","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        TableModel model1 = jTable1.getModel();
        
        ref = model1.getValueAt(index, 0).toString();
        String loc=model1.getValueAt(index,1).toString();
         String hotelname=model1.getValueAt(index,2).toString();
          String roomtype=model1.getValueAt(index,3).toString();
           String checkin=model1.getValueAt(index,6).toString();
            String checkout=model1.getValueAt(index,7).toString();
            int noOfPpl=Integer.parseInt( model1.getValueAt(index,4).toString());
            int noOfRooms=Integer.parseInt( model1.getValueAt(index,5).toString());
            java.util.Date checkIn = new java.util.Date();
            java.util.Date checkOut = new java.util.Date();
            java.util.Date currentDate = new java.util.Date();
            try{
                checkOut=new SimpleDateFormat("yyyy-MM-dd").parse(checkout);
                checkIn= new SimpleDateFormat("yyyy-MM-dd").parse(checkin);}
             catch(Exception e){}
            double diff = checkIn.getTime() - currentDate.getTime();
              diff = diff / 1000 / 60 / 60 / 24;
              System.out.println(""+diff);
        if(diff <=3)
        {
             JOptionPane.showMessageDialog (null, "You can only modify the booking before 3 days of Check-In Date","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        ModifyBooking mb = new ModifyBooking(ref,loc,hotelname,roomtype,checkin,checkout,noOfPpl,noOfRooms,name,username);
               // JOptionPane.showMessageDialog(null, "Login Successful!!!");
                mb.setVisible(true);
                mb.pack();
        mb.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
        }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //row = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
         int index = jTable1.getSelectedRow();
         if(index==-1)
        {
            JOptionPane.showMessageDialog (null, "Please select a booking to cancel","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        TableModel model1 = jTable1.getModel();
        ref = model1.getValueAt(index, 0).toString();
        String checkin=model1.getValueAt(index,6).toString();
            String checkout=model1.getValueAt(index,7).toString();
            String hotelname=model1.getValueAt(index,2).toString();
            String loc=model1.getValueAt(index,1).toString();
          String roomtype=model1.getValueAt(index,3).toString();
            int noOfRooms=Integer.parseInt( model1.getValueAt(index,5).toString());
        CancelBooking cb = new CancelBooking(ref,checkin,checkout,noOfRooms,hotelname,roomtype,name,username,loc);
                cb.setVisible(true);
                cb.pack();
        cb.setLocationRelativeTo(null);
       this.dispose();}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        
        
         Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
         Details l = new Details(name,username);
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(YourBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YourBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YourBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YourBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YourBookings().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
