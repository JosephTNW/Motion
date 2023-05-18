/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package motion;

import Models.Project;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class ProjectListPane extends javax.swing.JPanel {

    private Project project;
    private ProjectAction projAction = new ProjectAction();
    private HomePage homepage;
    private String status;

    /**
     * Creates new form ProjectListPane
     */
    public ProjectListPane() {
        initComponents();
    }

    public ProjectListPane(Project project, HomePage homepage) {
        initComponents();
        this.project = project;
        projAction.setProjId(project.getId());
        tvPriority.setText(Integer.toString(project.getPriority()));
        String newStatus = checkOverdue(project.getDeadline(), project.getStatus());
        tvStatus.setText(newStatus);
        statusConfig(project.getStatus());
        tvTitle.setText(project.getTitle());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDeadline = project.getDeadline().format(formatter);
        String formattedMadeOn = project.getMadeOn().format(formatter);
        tvDeadline.setText(formattedDeadline);
        tvMadeOn.setText(formattedMadeOn);
        tvType.setText(project.getType());

        this.homepage = homepage;
    }

    public ProjectListPane(Project project, HomePage homepage, String status) {
        initComponents();
        this.project = project;
        projAction.setProjId(project.getId());
        tvPriority.setText(Integer.toString(project.getPriority()));
        String newStatus = checkOverdue(project.getDeadline(), project.getStatus());
        tvStatus.setText(newStatus);
        statusConfig(project.getStatus());
        tvTitle.setText(project.getTitle());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDeadline = project.getDeadline().format(formatter);
        String formattedMadeOn = project.getMadeOn().format(formatter);
        tvDeadline.setText(formattedDeadline);
        tvMadeOn.setText(formattedMadeOn);
        tvType.setText(project.getType());

        this.homepage = homepage;
    }

    private void statusConfig(String status) {
        switch (status) {
            case "Completed" -> {
                pnStatus.setBackground(Color.green);
                btnEdit.setVisible(false);
                break;
            }
            case "Overdue" -> {
                pnStatus.setBackground(Color.red);
                btnEdit.setVisible(false);
                break;
            }
            default ->
                pnStatus.setBackground(Color.yellow);
        }
    }

    private String checkOverdue(LocalDateTime deadline, String status) {
        if ((deadline.compareTo(LocalDateTime.now()) < 0) && ("Ongoing".equals(status))) {
            ProjectAction.updateStatus(project.getId(), "Overdue");
            status = "Overdue";
        }
        return status;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tvPriority = new javax.swing.JLabel();
        tvTitle = new javax.swing.JLabel();
        pnStatus = new javax.swing.JPanel();
        tvStatus = new javax.swing.JLabel();
        tvTitle1 = new javax.swing.JLabel();
        tvTitle3 = new javax.swing.JLabel();
        tvTitle4 = new javax.swing.JLabel();
        tvDeadline = new javax.swing.JLabel();
        tvType = new javax.swing.JLabel();
        tvTitle5 = new javax.swing.JLabel();
        tvMadeOn = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 248, 248));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 48, 87)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tvPriority.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tvPriority.setForeground(new java.awt.Color(0, 208, 132));
        tvPriority.setText("1");
        add(tvPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 235, -1, -1));

        tvTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        tvTitle.setForeground(new java.awt.Color(27, 24, 55));
        tvTitle.setText("Title");
        add(tvTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 66, 359, -1));

        pnStatus.setBackground(new java.awt.Color(0, 208, 132));
        pnStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tvStatus.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 24)); // NOI18N
        tvStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvStatus.setText("Completed");

        javax.swing.GroupLayout pnStatusLayout = new javax.swing.GroupLayout(pnStatus);
        pnStatus.setLayout(pnStatusLayout);
        pnStatusLayout.setHorizontalGroup(
            pnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        pnStatusLayout.setVerticalGroup(
            pnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tvStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        add(pnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 379, -1));

        tvTitle1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvTitle1.setForeground(new java.awt.Color(27, 24, 55));
        tvTitle1.setText("Type");
        add(tvTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 113, 52, -1));

        tvTitle3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvTitle3.setForeground(new java.awt.Color(27, 24, 55));
        tvTitle3.setText("Priority Level");
        add(tvTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 248, -1, -1));

        tvTitle4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvTitle4.setForeground(new java.awt.Color(27, 24, 55));
        tvTitle4.setText("Deadline");
        add(tvTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 179, -1, -1));

        tvDeadline.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvDeadline.setForeground(new java.awt.Color(27, 24, 55));
        tvDeadline.setText("02/05/2023");
        add(tvDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 179, 238, -1));

        tvType.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvType.setForeground(new java.awt.Color(27, 24, 55));
        tvType.setText("Business");
        add(tvType, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 113, 238, -1));

        tvTitle5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvTitle5.setForeground(new java.awt.Color(27, 24, 55));
        tvTitle5.setText("Initiated");
        add(tvTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 146, -1, -1));

        tvMadeOn.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tvMadeOn.setForeground(new java.awt.Color(27, 24, 55));
        tvMadeOn.setText("02/05/2023");
        add(tvMadeOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 146, 238, -1));

        btnDelete.setBackground(new java.awt.Color(248, 248, 248));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 244, 65, 25));

        btnEdit.setBackground(new java.awt.Color(248, 248, 248));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(27, 24, 55));
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 24, 55), 1, true));
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 245, 65, 25));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        CheckBoxInternalFrame viewProgress = new CheckBoxInternalFrame(homepage, project, status);
        homepage.displayFrame(viewProgress);
    }//GEN-LAST:event_formMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the project \"" + project.getTitle() + "\"?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmDelete == JOptionPane.YES_OPTION) {
            projAction.deleteProj();
        } else {
            return;
        }
        homepage.updateProjects();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        InputProjectPage inputProject = new InputProjectPage(homepage, project);
        homepage.displayFrame(inputProject);
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JPanel pnStatus;
    private javax.swing.JLabel tvDeadline;
    private javax.swing.JLabel tvMadeOn;
    private javax.swing.JLabel tvPriority;
    private javax.swing.JLabel tvStatus;
    private javax.swing.JLabel tvTitle;
    private javax.swing.JLabel tvTitle1;
    private javax.swing.JLabel tvTitle3;
    private javax.swing.JLabel tvTitle4;
    private javax.swing.JLabel tvTitle5;
    private javax.swing.JLabel tvType;
    // End of variables declaration//GEN-END:variables
}
