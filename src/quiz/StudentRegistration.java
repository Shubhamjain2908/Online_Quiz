/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SHUBHAM
 */
public class StudentRegistration extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null;
        
    public StudentRegistration() {
        initComponents();
        this.setLocationRelativeTo(null);
        rmsg.setVisible(false);
        Smsg.setVisible(false);
        lgA.setVisible(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        reg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rphone = new javax.swing.JTextField();
        renrollment = new javax.swing.JTextField();
        rpassword = new javax.swing.JPasswordField();
        rname = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        rmsg = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        Smsg = new javax.swing.JLabel();
        lgA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        remail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(102, 255, 204));

        reg.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 0, 0));
        reg.setText("REGISTERATION");
        reg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                regPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Enrollment No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("E-mail Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Password");

        rphone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rphoneMouseClicked(evt);
            }
        });
        rphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rphoneActionPerformed(evt);
            }
        });

        renrollment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        renrollment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renrollmentMouseClicked(evt);
            }
        });

        rpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rpasswordMouseClicked(evt);
            }
        });

        rname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rnameMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");

        rmsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rmsg.setForeground(new java.awt.Color(255, 0, 51));
        rmsg.setText("User already Enrolled!");

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 0, 51));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Smsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Smsg.setForeground(new java.awt.Color(255, 0, 51));
        Smsg.setText("Registration Successfull..");

        lgA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lgA.setText("Click Here to login");
        lgA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lgA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgAMouseClicked(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        remail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remailMouseClicked(evt);
            }
        });
        remail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remailActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(reg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rphone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(renrollment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rpassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rmsg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(submit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Smsg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lgA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(remail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reg)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(25, 25, 25))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(renrollment)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(35, 35, 35)
                                        .addComponent(jRadioButton2))
                                    .addComponent(rphone)
                                    .addComponent(rname)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(remail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submit)
                                    .addComponent(rmsg))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Smsg)
                                    .addComponent(lgA))))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(reg))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(45, 45, 45)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(renrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(remail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rmsg)
                    .addComponent(Smsg))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(lgA))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void remailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remailActionPerformed

    private void remailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_remailMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lgAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgAMouseClicked
        StudentLogin sl = new StudentLogin();
        sl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lgAMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String name = rname.getText();
        String enroll = renrollment.getText();
        String phno = rphone.getText();
        String emal = remail.getText();
        String gen = "";
        //String eroll="";
        char pass[] = rpassword.getPassword();
        String rpass = new String(pass);

        if (jRadioButton1.isSelected()) {
            System.out.println("Male");
            gen = "Male";
        } else if(jRadioButton2.isSelected()) {
            System.out.println("Female");
            gen = "Female";
        }
        if(name!=null && rpass!=null && !name.trim().equals("") && !rpass.trim().equals("") && enroll!=null && !name.trim().equals("")&& enroll!=null && !emal.trim().equals("")&& emal!=null && gen!=null && !gen.trim().equals("")){
        try {
            String query1 = "INSERT INTO newuser VALUES ('" + name + "','" + gen + "','" + enroll + "','" + phno + "','" + emal + "','" + rpass + "')";
            System.out.println("Query1 :" + query1);

            int i = st.executeUpdate(query1);

            if (i > 0) {
                System.out.println("Record inserted :" + i);
                JOptionPane.showMessageDialog(null,"Registration Successfull...!");
                Smsg.setVisible(true);
                lgA.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"User already Enrolled!","Alert",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e1) 
        {
            System.out.println(e1);
            JOptionPane.showMessageDialog(null,"User already Enrolled!","Alert",JOptionPane.ERROR_MESSAGE);
        }
      }
        else
        {
            JOptionPane.showMessageDialog(null,"Fill the form correctly!!!","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void rnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rnameMouseClicked
        rname.setText("");
    }//GEN-LAST:event_rnameMouseClicked

    private void rpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rpasswordMouseClicked
        rpassword.setText("");
    }//GEN-LAST:event_rpasswordMouseClicked

    private void renrollmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renrollmentMouseClicked
        renrollment.setText("");
    }//GEN-LAST:event_renrollmentMouseClicked

    private void rphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rphoneActionPerformed
        rphone.setText("");
    }//GEN-LAST:event_rphoneActionPerformed

    private void rphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rphoneMouseClicked
        rphone.setText("");
    }//GEN-LAST:event_rphoneMouseClicked

    private void regPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_regPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_regPropertyChange


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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Smsg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lgA;
    private javax.swing.JLabel reg;
    private javax.swing.JTextField remail;
    private javax.swing.JTextField renrollment;
    private javax.swing.JLabel rmsg;
    private javax.swing.JTextField rname;
    private javax.swing.JPasswordField rpassword;
    private javax.swing.JTextField rphone;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
