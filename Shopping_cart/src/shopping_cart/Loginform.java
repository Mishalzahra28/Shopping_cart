/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping_cart;

//import RMS.frmdashboard;
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
//import org.xml.sax.Attributes;


/**
 *
 * @author saman
 */
public class Loginform extends javax.swing.JFrame {


    /**
     * Creates new form Loginform
     */
    public Loginform() {
        initComponents();
        Usernametxt.setBackground(null);
        passwordtxt.setBackground(null);
        this.setLocationRelativeTo(null);

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
        loginlbl = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        passwordchk = new javax.swing.JCheckBox();
        loginbtn = new javax.swing.JButton();
        Usernametxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        Resetbtn = new javax.swing.JButton();
        passwordtxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("loginform");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,205));

        loginlbl.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        loginlbl.setForeground(new java.awt.Color(255, 255, 255));
        loginlbl.setText("Login");

        usernamelbl.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        usernamelbl.setText("USERNAME");

        passwordchk.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        passwordchk.setForeground(new java.awt.Color(255, 255, 255));
        passwordchk.setText("Show Password");
        passwordchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordchkActionPerformed(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(165, 99, 0));
        loginbtn.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        Usernametxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usernametxt.setForeground(new java.awt.Color(255, 255, 255));

        passwordlbl.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("PASSWORD");

        Resetbtn.setBackground(new java.awt.Color(165, 99, 0));
        Resetbtn.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("RESET");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        passwordtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(loginlbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(passwordchk))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(loginbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Resetbtn)))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(loginlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(passwordchk)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 350, 340));

        ImageIcon icon =new ImageIcon("./images/metro.png");
        Image img=icon.getImage();
        Image imageScale=img.getScaledInstance(870,700,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon =new ImageIcon(imageScale);
        jLabel1.setIcon(scaledIcon);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        String userText;
        String pwdText;
        userText = Usernametxt.getText();
        pwdText = passwordtxt.getText();
        if (userText.equalsIgnoreCase("Grp13") && pwdText.equalsIgnoreCase("Grp13")) {
            this.setVisible(false);
            categories_page obj3 = new categories_page();
            obj3.setVisible(true);
            obj3.setResizable(false);

        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            Usernametxt.setText("");
            passwordtxt.setText("");
            passwordchk.setSelected(false);
            passwordtxt.setEchoChar('*');
            Usernametxt.requestFocus();
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void passwordchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordchkActionPerformed
        // TODO add your handling code here:
        if (passwordchk.isSelected()) {
            passwordtxt.setEchoChar((char) 0);
        } else {
            passwordtxt.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordchkActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        // TODO add your handling code here:
        Usernametxt.setText("");
        passwordtxt.setText("");
        passwordchk.setSelected(false);
        passwordtxt.setEchoChar('*');
        Usernametxt.requestFocus();
    }//GEN-LAST:event_ResetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Loginform obj1 = new Loginform();
            obj1.setVisible(true);
            obj1.setResizable(false);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resetbtn;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JCheckBox passwordchk;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables

    private void isResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
