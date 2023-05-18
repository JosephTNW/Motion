/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package motion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author josep
 */
public class AboutInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AboutInternalFrame
     */
    public AboutInternalFrame() {
        initComponents();
        setImage();
    }
    
    private void setImage() {
        ImageIcon icon = new ImageIcon("assets\\devImg.png");
        imgDev.setIcon(scaleImg(icon, 85, 85));
        ImageIcon git = new ImageIcon("assets\\githubIcon.png");
        imgGit.setIcon(scaleImg(git, 35, 35));
        ImageIcon IG = new ImageIcon("assets\\instagramIcon.png");
        imgIg.setIcon(scaleImg(IG, 35, 35));
    }
    
    public ImageIcon scaleImg(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(width,height, Image.SCALE_SMOOTH);
        ImageIcon scaledImg = new ImageIcon(imgScale);
        return scaledImg;
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
        tvTitle = new javax.swing.JLabel();
        tvDesc = new javax.swing.JLabel();
        imgDev = new javax.swing.JLabel();
        tvDesc1 = new javax.swing.JLabel();
        imgGit = new javax.swing.JLabel();
        tvDesc4 = new javax.swing.JLabel();
        tvDesc5 = new javax.swing.JLabel();
        imgIg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAbout = new javax.swing.JTextArea();
        btnDone = new javax.swing.JButton();

        pnRoot.setBackground(new java.awt.Color(248, 248, 248));
        pnRoot.setMinimumSize(new java.awt.Dimension(200, 200));

        tvTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tvTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvTitle.setText("ABOUT");

        tvDesc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tvDesc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tvDesc.setText("Motion was Developed By:");

        imgDev.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        imgDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tvDesc1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tvDesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvDesc1.setText("Joseph Tedja Nugraha Wibawa");

        imgGit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        imgGit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        tvDesc4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tvDesc4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tvDesc4.setText("https://github.com/JosephTNW");

        tvDesc5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tvDesc5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tvDesc5.setText("@josephtnw");

        imgIg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        imgIg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        taAbout.setEditable(false);
        taAbout.setBackground(new java.awt.Color(248, 248, 248));
        taAbout.setColumns(20);
        taAbout.setRows(5);
        taAbout.setText("Motion is a Project Management App Inspired by Notion and Trello. \nAlthough it may lack in a certain way, I hope this project may be useful \nin the future either for further research or for its utility.\n\nHAPPY CODING!");
        taAbout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 248, 248), 1, true));
        taAbout.setCaretColor(new java.awt.Color(248, 248, 248));
        taAbout.setMinimumSize(new java.awt.Dimension(379, 30));
        taAbout.setSelectionColor(new java.awt.Color(248, 248, 248));
        jScrollPane1.setViewportView(taAbout);

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRootLayout.createSequentialGroup()
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addComponent(imgGit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(imgDev, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tvDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tvDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(tvDesc4))))
            .addComponent(jScrollPane1)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(imgIg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tvDesc5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnDone)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tvTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgDev, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addComponent(tvDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tvDesc1)))
                .addGap(7, 7, 7)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tvDesc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgGit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgIg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tvDesc5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnDone)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel imgDev;
    private javax.swing.JLabel imgGit;
    private javax.swing.JLabel imgIg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JTextArea taAbout;
    private javax.swing.JLabel tvDesc;
    private javax.swing.JLabel tvDesc1;
    private javax.swing.JLabel tvDesc4;
    private javax.swing.JLabel tvDesc5;
    private javax.swing.JLabel tvTitle;
    // End of variables declaration//GEN-END:variables
}
