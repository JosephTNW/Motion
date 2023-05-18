/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public final class LoginPage extends javax.swing.JFrame {

    private CurrUser user = new CurrUser();

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        scaleImg();
        getIcon();
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void getIcon() {
        ImageIcon icon = new ImageIcon("assets\\motion.jpg");
        Image img = icon.getImage();
        this.setIconImage(img);
    }


    public void scaleImg() {
        ImageIcon icon = new ImageIcon("assets\\motion.png");
        ImageIcon barIcon = new ImageIcon("assets\\motion.jpg");
        Image img = icon.getImage();
        Image barImg = barIcon.getImage();
        Image imgScale = img.getScaledInstance(tvIcon.getWidth(), tvIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledImg = new ImageIcon(imgScale);
        tvIcon.setIcon(scaledImg);
        this.setIconImage(barImg);
    }

    public void checkForLoggedInUser() {
        if (user.loadUserInfo() != 0) {
            this.setVisible(false);
            this.dispose();
            HomePage hFrame = new HomePage();
            hFrame.setVisible(true);
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

        pnRoot = new javax.swing.JPanel();
        authPanel = new javax.swing.JPanel();
        edtPass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        tvRegister = new javax.swing.JLabel();
        edtUser = new javax.swing.JTextField();
        tvDesc = new javax.swing.JLabel();
        tvUsername = new javax.swing.JLabel();
        tvPassword = new javax.swing.JLabel();
        tvIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        pnRoot.setBackground(new java.awt.Color(248, 248, 248));
        pnRoot.setDoubleBuffered(false);
        pnRoot.setMaximumSize(new java.awt.Dimension(1920, 1080));
        pnRoot.setMinimumSize(new java.awt.Dimension(1920, 1080));
        pnRoot.setPreferredSize(new java.awt.Dimension(1920, 1080));

        authPanel.setBackground(new java.awt.Color(248, 248, 248));

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

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(27, 24, 55));

        jSeparator4.setBackground(new java.awt.Color(27, 24, 55));
        jSeparator4.setForeground(new java.awt.Color(27, 24, 55));

        btnLogin.setBackground(new java.awt.Color(248, 248, 248));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(27, 24, 55));
        btnLogin.setLabel("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoginMouseReleased(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        tvRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvRegister.setForeground(new java.awt.Color(0, 153, 255));
        tvRegister.setText("Register");
        tvRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tvRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tvRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tvRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tvRegisterMouseExited(evt);
            }
        });

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

        tvDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tvDesc.setForeground(new java.awt.Color(27, 24, 55));
        tvDesc.setText("Haven't had an account yet?");

        tvUsername.setText("Username");

        tvPassword.setText("Password");

        javax.swing.GroupLayout authPanelLayout = new javax.swing.GroupLayout(authPanel);
        authPanel.setLayout(authPanelLayout);
        authPanelLayout.setHorizontalGroup(
            authPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authPanelLayout.createSequentialGroup()
                .addGroup(authPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(authPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(tvDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tvRegister))
                    .addGroup(authPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(authPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(authPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tvUsername)
                            .addComponent(tvPassword))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        authPanelLayout.setVerticalGroup(
            authPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tvUsername)
                .addGap(0, 0, 0)
                .addComponent(edtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tvPassword)
                .addGap(2, 2, 2)
                .addComponent(edtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(authPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvRegister)
                    .addComponent(tvDesc)))
        );

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
                .addComponent(authPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(authPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(tvIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(353, 353, 353))
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

    private void edtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPassActionPerformed

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

    private void edtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPassFocusGained
        // TODO add your handling code here:
        if (("Password".equals(edtPass.getText()) || ("".equals(edtPass.getText())))) {
            edtPass.setText("");
        }
    }//GEN-LAST:event_edtPassFocusGained

    private void edtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPassFocusLost
        // TODO add your handling code here:
        if ("".equals(edtPass.getText())) {
            edtPass.setText("Password");
        }
    }//GEN-LAST:event_edtPassFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tvRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvRegisterMouseEntered
        // TODO add your handling code here:
        String s = "<html><u>Register</u></html>";
        tvRegister.setText(s);
    }//GEN-LAST:event_tvRegisterMouseEntered

    private void tvRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvRegisterMouseExited
        tvRegister.setText("Register");
    }//GEN-LAST:event_tvRegisterMouseExited

    private void tvRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tvRegisterMouseClicked
        // TODO add your handling code here:
        RegisterPage rFrame = new RegisterPage();
        rFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tvRegisterMouseClicked

    private void btnLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseReleased
        // TODO add your handling code here:
        user.setUsername(edtUser.getText());
        user.setPassword(edtPass.getText());
        user.login();
        if (user.loadUserInfo() == 0) {
            JOptionPane.showMessageDialog(this, "Either username or password is wrong.", "Login Failed", JOptionPane.WARNING_MESSAGE);
        } else {
            HomePage hFrame = new HomePage();
            hFrame.setUser(user);
            hFrame.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnLoginMouseReleased

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
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
                loginPage.checkForLoggedInUser();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel authPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField edtPass;
    private javax.swing.JTextField edtUser;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JLabel tvDesc;
    private javax.swing.JLabel tvIcon;
    private javax.swing.JLabel tvPassword;
    private javax.swing.JLabel tvRegister;
    private javax.swing.JLabel tvUsername;
    // End of variables declaration//GEN-END:variables
}
