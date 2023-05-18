/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package motion;

import Models.Project;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class CheckBoxInternalFrame extends javax.swing.JInternalFrame {

    private CheckBoxAction checkBoxMap = new CheckBoxAction();
    private String selectedStatus;
    private boolean containsAllTrue = true;
    private Project project;
    private HomePage homepage;
    private double prediction;
    private int checkBoxCount;
    private int doneBoxCount = 0;
    private HashMap<String, Boolean> newCheckBoxMap = new HashMap();

    /**
     * Creates new form CheckBoxInternalFrame
     */
    public CheckBoxInternalFrame() {
        initComponents();
    }

    //Frame initiation used when there is no status selected at the tree.
    public CheckBoxInternalFrame(HomePage homepage, Project project) {
        initComponents();

        //Pass values get from parameter to the global variables
        this.project = project;
        tvProgress.setText("Progress of " + project.getTitle());
        this.homepage = homepage;

        //Get checkboxes within this project
        checkBoxMap.setProjectId(project.getId());
        checkBoxMap.getCheckBoxes();

        //Check whether the acquired list of checkboxes exist
        if (!checkBoxMap.getCheckBoxMap().isEmpty()) {
            //Iterate through the list of checkboxes
            for (Map.Entry<String, Boolean> entry : checkBoxMap.getCheckBoxMap().entrySet()) {
                //Retrieve the name and status of the checkbox in the form of key-values
                String key = entry.getKey();
                Boolean value = entry.getValue();

                //Display the name and status pair found
                displayCheckBox(key, value);

                //Count the number of boxes that is checked
                if (value) {
                    doneBoxCount++;
                }
            }

            //Put the list of checkboxes into another hashmap for later comparisons
            newCheckBoxMap = checkBoxMap.getCheckBoxMap();
        }
        //Put the number of existing checkboxes into a variable 
        checkBoxCount = newCheckBoxMap.size();

        //Update the button 'check all' and 'uncheck all' 
        checkCheckBoxesState();

        //Configure the progress bar
        pbProgress.setStringPainted(true);
        pbProgress.setMinimum(0);
        pbProgress.setMaximum(checkBoxCount);
        pbProgress.setValue(doneBoxCount);

        //Change the prediction text according to the current state
        updatePrediction();
    }

    //Frame initiation used when there is a status selected in the tree view
    public CheckBoxInternalFrame(HomePage homepage, Project project, String selectedStatus) {
        initComponents();

        //Pass values get from parameter to the global variables
        this.project = project;
        tvProgress.setText("Progress of " + project.getTitle());
        this.homepage = homepage;
        this.selectedStatus = selectedStatus;
        checkBoxMap.setProjectId(project.getId());
        checkBoxMap.getCheckBoxes();

        if (!checkBoxMap.getCheckBoxMap().isEmpty()) {

            for (Map.Entry<String, Boolean> entry : checkBoxMap.getCheckBoxMap().entrySet()) {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                if (entry.getValue()) {
                    doneBoxCount++;
                }
                displayCheckBox(key, value);
            }
            newCheckBoxMap = checkBoxMap.getCheckBoxMap();
        }
        checkBoxCount = newCheckBoxMap.size();
        checkCheckBoxesState();
        pbProgress.setStringPainted(true);
        pbProgress.setMinimum(0);
        pbProgress.setMaximum(checkBoxCount);
        pbProgress.setValue(doneBoxCount);
        updatePrediction();
    }

    private void updatePrediction() {
        prediction = ((doneBoxCount + 1.0) / checkBoxCount) * 100;
        if (prediction <= 100.0) {
            setPrediction();
        } else {
            setCongrats();
        }

    }

    private void updatePrediction(boolean status) {
        if (status) {
            prediction += (1.0 / checkBoxCount) * 100;

        } else {
            prediction -= (1.0 / checkBoxCount) * 100;

        }
        if (prediction <= 100.0) {
            setPrediction();
        } else {
            setCongrats();
        }
    }

    private void setPrediction() {
        tvPercentage.setVisible(true);
        tvProgress2.setVisible(true);
        tvProgress1.setText("Do one more job to be ");
        DecimalFormat df = new DecimalFormat("#.##");
        tvPercentage.setText(df.format(prediction) + "%");
    }

    private void setCongrats() {
        tvPercentage.setVisible(false);
        tvProgress2.setVisible(false);
        tvProgress1.setText("Congratulations! You have finished this project");
    }

    private void displayCheckBox(String name, boolean status) {
        JCheckBox checkBox = new JCheckBox(name);
        if (status) {
            checkBox.setSelected(true);
        }
        checkBox.setForeground(Color.WHITE);
        checkBoxMap.addCheckBox(name, status); // Set default state to unchecked
        checkBox.addActionListener((ActionEvent e) -> {
            JCheckBox source = (JCheckBox) e.getSource();
            updateCheckboxValue(source.getText(), source.isSelected());
            checkCheckBoxesState();
            if (source.isSelected()) {
                pbProgress.setValue(pbProgress.getValue() + 1);
            } else {
                pbProgress.setValue(pbProgress.getValue() - 1);
            }
            updatePrediction(source.isSelected());
        });
        pnChecklists.add(checkBox);
        pnChecklists.revalidate();
        pnChecklists.repaint();
    }

    private void checkCheckBoxesState() {
        for (Boolean value : newCheckBoxMap.values()) {
            if (!value) {
                containsAllTrue = false;
                break;
            }
            containsAllTrue = true;
        }

        if (containsAllTrue) {
            btnCheckAll.setText("Uncheck All");
        } else {
            btnCheckAll.setText("Check All");
        }
    }

    private void displayCheckBox(String name) {
        JCheckBox checkBox = new JCheckBox(name);
        checkBox.setForeground(Color.WHITE);
        newCheckBoxMap.put(name, false); // Set default state to unchecked
        checkBox.addActionListener((ActionEvent e) -> {
            JCheckBox source = (JCheckBox) e.getSource();
            updateCheckboxValue(source.getText(), source.isSelected());
            checkCheckBoxesState();
            if (source.isSelected()) {
                pbProgress.setValue(pbProgress.getValue() + 1);
            } else {
                pbProgress.setValue(pbProgress.getValue() - 1);
            }
            updatePrediction(source.isSelected());
        });
        pnChecklists.add(checkBox);
        pnChecklists.revalidate();
        pnChecklists.repaint();
    }

    private void updateCheckboxValue(String name, boolean value) {
        newCheckBoxMap.put(name, value);
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
        jLabel1 = new javax.swing.JLabel();
        pnChecklists = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnCheckAll = new javax.swing.JButton();
        tvProgress = new javax.swing.JLabel();
        pbProgress = new javax.swing.JProgressBar();
        btnFinish = new javax.swing.JButton();
        tvProgress1 = new javax.swing.JLabel();
        tvPercentage = new javax.swing.JLabel();
        tvProgress2 = new javax.swing.JLabel();

        pnRoot.setBackground(new java.awt.Color(27, 24, 55));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tasks");

        pnChecklists.setBackground(new java.awt.Color(27, 24, 55));
        pnChecklists.setPreferredSize(new java.awt.Dimension(316, 20));
        pnChecklists.setLayout(new java.awt.GridLayout(1, 0));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCheckAll.setText("Check All");
        btnCheckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAllActionPerformed(evt);
            }
        });

        tvProgress.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        tvProgress.setForeground(new java.awt.Color(255, 255, 255));
        tvProgress.setText("Progress of ...");

        pbProgress.setBackground(new java.awt.Color(255, 255, 255));
        pbProgress.setForeground(new java.awt.Color(27, 24, 55));

        btnFinish.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        tvProgress1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tvProgress1.setForeground(new java.awt.Color(255, 255, 255));
        tvProgress1.setText("Do one more job to be ");

        tvPercentage.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tvPercentage.setForeground(new java.awt.Color(61, 252, 244));
        tvPercentage.setText("xx%");

        tvProgress2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tvProgress2.setForeground(new java.awt.Color(255, 255, 255));
        tvProgress2.setText(" Finished");

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRootLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCheckAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tvProgress)
                            .addComponent(pnChecklists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnRootLayout.createSequentialGroup()
                                .addComponent(tvProgress1)
                                .addGap(2, 2, 2)
                                .addComponent(tvPercentage)
                                .addGap(2, 2, 2)
                                .addComponent(tvProgress2))
                            .addComponent(jLabel1))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tvProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvProgress1)
                    .addComponent(tvPercentage)
                    .addComponent(tvProgress2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnChecklists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinish)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        checkBoxMap.getCheckBoxes();
        checkBoxMap.compareCheckBoxes(newCheckBoxMap);
        for (Boolean value : newCheckBoxMap.values()) {
            if (!value) {
                containsAllTrue = false;
                break;
            }
            containsAllTrue = true;
        }

        if ((containsAllTrue) && ("Ongoing".equals(project.getStatus()))) {
            ProjectAction.updateStatus(project.getId(), "Completed");
        } else if ((!containsAllTrue) && ("Completed".equals(project.getStatus()))) {
            ProjectAction.updateStatus(project.getId(), "Ongoing");
        }

        if (selectedStatus == null) {
            homepage.updateProjects();
        } else {
            homepage.updateProjects(selectedStatus);
        }
        this.dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = JOptionPane.showInputDialog(this, "Enter checkbox label:");
        if (name != null && !name.isEmpty()) {
            boolean exists = false;
            if (checkBoxMap.getCheckBoxMap().containsKey(name)) {
                JOptionPane.showMessageDialog(this, "Checkbox with the same label already exists!");
                return;
            }
            if (!exists) {
                displayCheckBox(name);
                checkBoxCount++;
                updatePrediction();
                btnCheckAll.setText("Uncheck All");
                pbProgress.setMaximum(checkBoxCount);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCheckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAllActionPerformed
        Component[] components = pnChecklists.getComponents();
        if ("Check All".equals(btnCheckAll.getText())) {
            pbProgress.setValue(checkBoxCount);

            for (String key : newCheckBoxMap.keySet()) {
                newCheckBoxMap.put(key, true);
            }

            for (Component component : components) {
                if (component instanceof JCheckBox jCheckBox) {
                    jCheckBox.setSelected(true);
                }
            }

            setCongrats();
            
            prediction = (1.0 + (1.0) / checkBoxCount) * 100;

            btnCheckAll.setText("Uncheck All");
        } else {
            prediction = ((1.0) / checkBoxCount) * 100;
            pbProgress.setValue(0);

            for (String key : newCheckBoxMap.keySet()) {
                newCheckBoxMap.put(key, false);
            }

            for (Component component : components) {
                if (component instanceof JCheckBox jCheckBox) {
                    jCheckBox.setSelected(false);
                }
            }

            tvPercentage.setVisible(true);
            tvProgress2.setVisible(true);
            tvProgress1.setText("Do one more job to be ");
            DecimalFormat df = new DecimalFormat("#.##");
            tvPercentage.setText(df.format(prediction) + "%");

            btnCheckAll.setText("Check All");
        }
    }//GEN-LAST:event_btnCheckAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCheckAll;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pbProgress;
    private javax.swing.JPanel pnChecklists;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JLabel tvPercentage;
    private javax.swing.JLabel tvProgress;
    private javax.swing.JLabel tvProgress1;
    private javax.swing.JLabel tvProgress2;
    // End of variables declaration//GEN-END:variables
}
