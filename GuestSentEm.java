/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;




/**
 *
 * @author user
 */
public class GuestSentEm extends javax.swing.JFrame {
    
   

      Connection con;
      PreparedStatement pst;
     
    /**
     * Creates new form LoginPage
     */
      
      
       
    public GuestSentEm() {
        initComponents();
        showDate();
        showTime();
        

    }

     
      
    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        txtdate.setText(s.format(d));

    }

    void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                txttime.setText(s.format(d));
            }
        }).start();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttime = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SentEm = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        txtem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("POLIce");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_police_badge_40px_1.png"))); // NOI18N

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_shutdown_24px.png"))); // NOI18N
        Exit.setText("Έξοδος");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_sent_30px.png"))); // NOI18N
        jLabel9.setText("Αναφορά Περιστατικού");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_user_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(Exit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(81, 81, 81)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(Exit)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, -1, 530));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("POLIce");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 149, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_copyright_10px_1.png"))); // NOI18N
        jLabel13.setText("POLIce Development Team");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 494, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_versions_10px_1.png"))); // NOI18N
        jLabel12.setText("v1.0");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 494, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_police_badge_60px.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        txttime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttime.setForeground(new java.awt.Color(255, 255, 255));
        txttime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_watch_20px.png"))); // NOI18N
        txttime.setText("Ώρα");
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 130, -1));

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdate.setForeground(new java.awt.Color(255, 255, 255));
        txtdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_calendar_20px.png"))); // NOI18N
        txtdate.setText("Ημερομηνία");
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_marker_20px.png"))); // NOI18N
        jLabel7.setText("Πάτρα,Ελλάδα");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Επείγον Περιστατικό");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Διεύθυνση Περιστατικού");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        SentEm.setBackground(new java.awt.Color(0, 51, 255));
        SentEm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        SentEm.setForeground(new java.awt.Color(255, 255, 255));
        SentEm.setText("Αποστολή");
        SentEm.setBorder(null);
        SentEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SentEmActionPerformed(evt);
            }
        });
        jPanel1.add(SentEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 120, 40));

        Clean.setBackground(new java.awt.Color(0, 51, 255));
        Clean.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Clean.setForeground(new java.awt.Color(255, 255, 255));
        Clean.setText("Καθαρισμός");
        Clean.setBorder(null);
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        jPanel1.add(Clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 140, 40));

        Cancel.setBackground(new java.awt.Color(0, 51, 255));
        Cancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Ακύρωση");
        Cancel.setBorder(null);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 120, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Σύνδεση ως Επισκέπτης");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        txtadd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 270, 40));

        txtem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eπιλέξτε ένα Περιστατικό:", "Διαπλικτισμός", "Δολοφονία", "Ληστεία", "Παράνομες Συναλλαγές", "Τρομοκρατική Ενέργεια", "Τροχαίο", "Υλική Ζημιά" }));
        txtem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
        int a = JOptionPane.showConfirmDialog(this, "Επιθυμείτε να κλείσετε την εφαρμογή POLIce ;", "Έξοδος", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }

    }//GEN-LAST:event_ExitMousePressed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
         Guest a = new Guest();
         a.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void SentEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SentEmActionPerformed
      
      String emergency = (String) txtem.getSelectedItem();
      String address = txtadd.getText();
      String cdate= txtdate.getText();
      String ctime=txttime.getText();
      
      
      
      if(emergency.equals("Eπιλέξτε ένα Περιστατικό:") || address.equals(""))
       {
          JOptionPane.showMessageDialog(this,"Το επείγον περιστατικό ή η διεύθυνση είναι κενά","Αποτυχία Αποστολής Περιστατικού",JOptionPane.ERROR_MESSAGE); 
       }
       else
       {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          con = DriverManager.getConnection("jdbc:mysql://localhost/police?useUnicode=yes?&characterEncoding=UTF-8","root","");
          pst = con.prepareStatement("insert into guest (emergency,address_em,date,time) values (?,?,?,?)");
          pst.setString(1, emergency);
          pst.setString(2, address);
          pst.setString(3, cdate);
          pst.setString(4,ctime);
          
          
          pst.executeUpdate();
         
          
          
          JOptionPane.showMessageDialog(this,"Επιτυχής Αποστολή Περιστατικού");
         
         txtem.getSelectedItem().equals("Επιλέξτε ένα Περιστατικό:");
         txtadd.setText("");
         txtem.requestFocus();
         
         
         HomePage a = new HomePage();
         a.setVisible(true);
         this.dispose();
      
      
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(LoginPageAdmin.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(LoginPageAdmin.class.getName()).log(Level.SEVERE, null, ex);
      }
    } 
      
      
      
      
    }//GEN-LAST:event_SentEmActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        txtem.getSelectedItem().equals("Επιλέξτε ένα Περιστατικό:");
         txtadd.setText("");
    }//GEN-LAST:event_CleanActionPerformed

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
            java.util.logging.Logger.getLogger(GuestSentEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestSentEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestSentEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestSentEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestSentEm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Clean;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton SentEm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtadd;
    private javax.swing.JLabel txtdate;
    private javax.swing.JComboBox<String> txtem;
    private javax.swing.JLabel txttime;
    // End of variables declaration//GEN-END:variables
}
