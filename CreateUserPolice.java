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
public class CreateUserPolice extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;

    /**
     * Creates new form LoginPage
     */
    public CreateUserPolice() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txttime = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfull = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CreateUserPolice = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtteam = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_create_30px.png"))); // NOI18N
        jLabel10.setText("Εγγραφή ως Αστυνομικός");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Exit)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(Exit)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 550));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("POLIce");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 149, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_copyright_10px_1.png"))); // NOI18N
        jLabel13.setText("POLIce Development Team");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_versions_10px_1.png"))); // NOI18N
        jLabel12.setText("v1.0");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_police_badge_60px.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 60, -1));

        txttime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttime.setForeground(new java.awt.Color(255, 255, 255));
        txttime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_watch_20px.png"))); // NOI18N
        txttime.setText("Ώρα");
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 130, -1));

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdate.setForeground(new java.awt.Color(255, 255, 255));
        txtdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_calendar_20px.png"))); // NOI18N
        txtdate.setText("Ημερομηνία");
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_marker_20px.png"))); // NOI18N
        jLabel7.setText("Πάτρα,Ελλάδα");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        txtfull.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txtfull, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 270, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ονοματεπώνυμο");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Τηλέφωνο");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 80, 20));

        CreateUserPolice.setBackground(new java.awt.Color(0, 51, 255));
        CreateUserPolice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CreateUserPolice.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserPolice.setText("Δημιουργία");
        CreateUserPolice.setBorder(null);
        CreateUserPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserPoliceActionPerformed(evt);
            }
        });
        jPanel1.add(CreateUserPolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 160, 40));

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
        jPanel1.add(Clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 140, 40));

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
        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 150, 40));

        txtid.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 270, 30));

        txtuser.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 270, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Κωδικός");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Όνομα Χρήστη");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        txtpass.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 270, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Διεύθυνση");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Αριθμός Ταυτότητας ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 140, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ομάδα");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 50, 20));

        txtadd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 270, 30));

        txttel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jPanel1.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 270, 30));

        txtteam.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtteam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επιλέξτε Αστυνομική Ομάδα:", "Άμεσως Δράση\t", "Ασφάλεια\t", "ΔΙΑΣ", "ΜΑΤ", "ΟΠΚΕ", "Τροχαία" }));
        txtteam.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 270, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Αστυνομίας");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 80, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Αστυνομική");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
         CreateUser a = new  CreateUser();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void CreateUserPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserPoliceActionPerformed
       
       String policeteam = (String) txtteam.getSelectedItem();
       String fullname = txtfull.getText();
       String username = txtuser.getText();
       String password = txtpass.getText();
       String address = txtadd.getText();
       String telephone = txttel.getText();
       String idcard = txtid.getText();
    
       
        
        if (policeteam.equals("Επιλέξτε Αστυνομική Ομάδα:")|| fullname.equals("")|| username.equals("") || password.equals("") || address.equals("") || telephone.equals("") || idcard.equals("") )
        {
            JOptionPane.showMessageDialog(null,"Ένα ή περισσότερα στοιχεία είναι κενά!","Αποτυχία δημιουργίας Λογαριασμού",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        
        
        
        
        
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/POLIce?useUnicode=yes?&characterEncoding=UTF-8","root","");
            pst=con.prepareStatement("insert into police(policeteam,fullname,username,password,address,tel,policeidcard) values(?,?,?,?,?,?,?)");
            pst.setString(1, policeteam);
            pst.setString(2, fullname);
             pst.setString(3, username);
              pst.setString(4, password);
               pst.setString(5, address);
                pst.setString(6, telephone);
                 pst.setString(7, idcard);
                 
                 pst.executeUpdate();
                 
                 txtteam.requestFocus();
                 
                 JOptionPane.showMessageDialog(this,"Επιτυχής Εγγραφή");
                 HomePage a = new HomePage();
                 a.setVisible(true);
                 this.dispose();
                 
            
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateUserCitizen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(CreateUserCitizen.class.getName()).log(Level.SEVERE, null, ex);
       }
     }                                      
    }//GEN-LAST:event_CreateUserPoliceActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
       txtteam.getSelectedItem().equals("Επιλέξτε Αστυνομική Ομάδα:");
       txtfull.setText("");
       txtuser.setText("");
       txtpass.setText("");
       txtadd.setText("");
       txttel.setText("");
       txtid.setText("");
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
            java.util.logging.Logger.getLogger(CreateUserPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CreateUserPolice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Clean;
    private javax.swing.JButton CreateUserPolice;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtadd;
    private javax.swing.JLabel txtdate;
    private javax.swing.JTextField txtfull;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JComboBox<String> txtteam;
    private javax.swing.JTextField txttel;
    private javax.swing.JLabel txttime;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
