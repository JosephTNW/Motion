/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public final class RegisterPage extends javax.swing.JFrame {

    private CurrUser user = new CurrUser();

    /**
     * Creates new form LoginPage
     */
    public RegisterPage() {
        initComponents();
        setIcon();
        getIcon();
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void getIcon() {
        ImageIcon icon = new ImageIcon("assets\\motion.jpg");
        Image img = icon.getImage();
        this.setIconImage(img);
    }

    public void setIcon() {
        ImageIcon icon = new ImageIcon("assets\\motion.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(tvIcon.getWidth(), tvIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledImg = new ImageIcon(imgScale);
        tvIcon.setIcon(scaledImg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnRoot = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        edtPass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        tvLogin = new javax.swing.JLabel();
        edtUser = new javax.swing.JTextField();
        tvRegister1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        edtEmail = new javax.swing.JTextField();
        tvPassword = new javax.swing.JLabel();
        tvUsername = new javax.swing.JLabel();
        tvEmail = new javax.swing.JLabel();
        tvIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setBackground(new java.awt.Color(248, 248, 248));
        pnRoot.setDoubleBuffered(false);
        pnRoot.setMaximumSize(new java.awt.Dimension(1920, 1080));
        pnRoot.setMinimumSize(new java.awt.Dimension(1920, 1080));
        pnRoot.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edtPass.setBackground(new java.awt.Color(248, 248, 248));
        edtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtPass.setForeground(new java.awt.Color(27, 24, 55));
        edtPass.setText("Password");
        edtPass.setBorder(null);
        edtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtPassFocusLost(evt);
            }
        });
        edtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPassActionPerformed(evt);
            }
        });
        jPanel3.add(edtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(27, 24, 55));
        jSeparator3.setForeground(new java.awt.Color(27, 24, 55));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 10));

        jSeparator4.setBackground(new java.awt.Color(27, 24, 55));
        jSeparator4.setForeground(new java.awt.Color(27, 24, 55));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 10));

        btnRegister.setBackground(new java.awt.Color(248, 248, 248));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(27, 24, 55));
        btnRegister.setText("REGISTER");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegisterMouseReleased(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, 30));

        tvLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvLogin.setForeground(new java.awt.Color(0, 153, 255));
        tvLogin.setText("Login");
        tvLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tvLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tvLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tvLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tvLoginMouseExited(evt);
            }
        });
        jPanel3.add(tvLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        edtUser.setBackground(new java.awt.Color(248, 248, 248));
        edtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtUser.setForeground(new java.awt.Color(27, 24, 55));
        edtUser.setText("Username");
        edtUser.setBorder(null);
        edtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtUserFocusLost(evt);
            }
        });
        edtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUserActionPerformed(evt);
            }
        });
        jPanel3.add(edtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 30));

        tvRegister1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tvRegister1.setForeground(new java.awt.Color(27, 24, 55));
        tvRegister1.setText("Already have an account?");
        jPanel3.add(tvRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(27, 24, 55));
        jSeparator5.setForeground(new java.awt.Color(27, 24, 55));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 190, 10));

        edtEmail.setBackground(new java.awt.Color(248, 248, 248));
        edtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtEmail.setForeground(new java.awt.Color(27, 24, 55));
        edtEmail.setText("Email");
        edtEmail.setBorder(null);
        edtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtEmailFocusLost(evt);
            }
        });
        edtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(edtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, 30));

        tvPassword.setText("Password");
        jPanel3.add(tvPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        tvUsername.setText("Username");
        jPanel3.add(tvUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        tvEmail.setText("Email");
        jPanel3.add(tvEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        tvIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvIcon.setMaximumSize(new java.awt.Dimension(1000, 1000));
        tvIcon.setMinimumSize(new java.awt.Dimension(500, 500));
        tvIcon.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(tvIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tvIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(360, 360, 360))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtUserActionPerformed

    private void edtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtUserFocusGained
        // TODO add your handling code here:
        if ("Username".equals(edtUser.getText())) {
            edtUser.setText("");
        }
    }//GEN-LAST:event_edtUserFocusGained

    private void edtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtUserFocusLost
        // TODO add your handling code here:
        if ("".equals(edtUser.getText())) {
            edtUser.setText("Username");
        }
    }//GEN-LAST:event_edtUserFocusLost

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void tvLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvLoginMouseEntered
        // TODO add your handling code here:
        tvLogin.setText("<html><u>Login</u></html>");
    }//GEN-LAST:event_tvLoginMouseEntered

    private void tvLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvLoginMouseExited
        tvLogin.setText("Login");
    }//GEN-LAST:event_tvLoginMouseExited

    private void tvLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvLoginMouseClicked
        // TODO add your handling code here:
        LoginPage lFrame = new LoginPage();
        lFrame.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_tvLoginMouseClicked

    private void edtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPassActionPerformed

    private void edtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPassFocusLost
        // TODO add your handling code here:
        if ("".equals(edtPass.getText())) {
            edtPass.setText("Password");
        }
    }//GEN-LAST:event_edtPassFocusLost

    private void edtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPassFocusGained
        // TODO add your handling code here:
        if (("Password".equals(edtPass.getText()) || ("".equals(edtPass.getText())))) {
            edtPass.setText("");
        }
    }//GEN-LAST:event_edtPassFocusGained

    private void edtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtEmailFocusGained
        // TODO add your handling code here:
        if (("Email".equals(edtEmail.getText()) || ("".equals(edtEmail.getText())))) {
            edtEmail.setText("");
        }
    }//GEN-LAST:event_edtEmailFocusGained

    private void edtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtEmailFocusLost
        if ("".equals(edtEmail.getText())) {
            edtEmail.setText("Email");}    }//GEN-LAST:event_edtEmailFocusLost

    private void edtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEmailActionPerformed

    private void btnRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseReleased
        // TODO add your handling code here:
        if ("Email".equals(edtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Please Input Your Email");
        } else if ("Username".equals(edtUser.getText())) {
            JOptionPane.showMessageDialog(this, "Please Input Your Username");
        } else if ("Password".equals(edtPass.getText())) {
            JOptionPane.showMessageDialog(this, "Please Don't Make your password \"Password\"");
        } else {
            if (CurrUser.checkUserAvail(edtUser.getText()) > 0) {
                JOptionPane.showMessageDialog(this, "Username was already taken");
            } else if (CurrUser.checkEmailAvail(edtEmail.getText()) > 0) {
                JOptionPane.showMessageDialog(this, "Email was already taken");
            } else {
                user.createUser(edtUser.getText(), edtEmail.getText(), edtPass.getText());
                user.setUsername(edtUser.getText());
                user.setEmail(edtEmail.getText());
                user.saveUserInfo();
                HomePage hFrame = new HomePage();
                hFrame.setVisible(true);
                this.setVisible(false);
                this.dispose();
            }
        }

    }//GEN-LAST:event_btnRegisterMouseReleased

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JPasswordField edtPass;
    private javax.swing.JTextField edtUser;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JLabel tvEmail;
    private javax.swing.JLabel tvIcon;
    private javax.swing.JLabel tvLogin;
    private javax.swing.JLabel tvPassword;
    private javax.swing.JLabel tvRegister1;
    private javax.swing.JLabel tvUsername;
    // End of variables declaration//GEN-END:variables
}
