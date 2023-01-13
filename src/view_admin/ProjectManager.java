package view_admin;

import controller.*;
import javax.swing.JOptionPane;

public class ProjectManager extends javax.swing.JFrame {

    private int currentRow;
    UsersRepo type = new UsersMethods();
    AdminRepo repo;
    ShowData show = new ShowData();

    public ProjectManager() {
        initComponents();
        setInformation();
        show.DataInTable("project_manager", PMTable, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PMTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        backHome = new javax.swing.JButton();
        exitApp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        admin_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(61, 142, 242));
        jLabel10.setText("ID");

        id.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        id.setForeground(new java.awt.Color(61, 142, 242));

        PMTable.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        PMTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PM_id", "Name", "Password", "position"
            }
        ));
        PMTable.setRowHeight(25);
        PMTable.setSelectionBackground(new java.awt.Color(61, 142, 242));
        PMTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PMTable);

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(61, 142, 242));
        jLabel13.setText("Name");

        name.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        name.setForeground(new java.awt.Color(61, 142, 242));

        jPanel3.setBackground(new java.awt.Color(61, 142, 242));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(61, 142, 242));
        jLabel14.setText("Password");

        insert.setBackground(new java.awt.Color(255, 255, 254));
        insert.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        insert.setForeground(new java.awt.Color(61, 142, 242));
        insert.setText("Insert");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });

        password.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(61, 142, 242));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(61, 142, 242));
        jLabel3.setText("\"Project Managers\" ");

        update.setBackground(new java.awt.Color(255, 255, 254));
        update.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        update.setForeground(new java.awt.Color(61, 142, 242));
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 254));
        delete.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(61, 142, 242));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(61, 142, 242));

        backHome.setBackground(new java.awt.Color(255, 255, 254));
        backHome.setFont(new java.awt.Font("Century Schoolbook", 3, 30)); // NOI18N
        backHome.setForeground(new java.awt.Color(61, 142, 242));
        backHome.setText("←");
        backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeMouseClicked(evt);
            }
        });

        exitApp.setBackground(new java.awt.Color(255, 255, 254));
        exitApp.setFont(new java.awt.Font("Century Schoolbook", 3, 27)); // NOI18N
        exitApp.setForeground(new java.awt.Color(61, 142, 242));
        exitApp.setText("X");
        exitApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitAppMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\"Manage Project Managers\" ");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("\"Project Management System\" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(200, 200, 200)
                .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backHome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        search.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        search.setForeground(new java.awt.Color(61, 142, 242));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(61, 142, 242));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(61, 142, 242));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-30 (2).png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(61, 142, 242));
        jLabel15.setText("Position : ");

        position.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        position.setForeground(new java.awt.Color(61, 142, 242));
        position.setText("Project Manager");

        admin_id.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        admin_id.setForeground(new java.awt.Color(61, 142, 242));
        admin_id.setText("' Admin_ID →    '");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(position, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(admin_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(299, 299, 299)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(admin_id)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(position))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    void setInformation() {
        type.users.setAdminID(repo.admin.getID());
        admin_id.setText("' Admin_ID → " + type.users.getAdminID() + " '");
    }
    
    boolean checkData() {
        if(!name.getText().isEmpty() && !id.getText().isEmpty() && !password.getText().isEmpty())
            return true;
        
        return false;
    }
    
    void setData() {
        type.users.setID(Integer.valueOf(id.getText()));
        type.users.setName(name.getText());
        type.users.setPassword(password.getText());
        type.users.setPosition(position.getText());
    }
    
    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        if(checkData()) {
            setData();
            type.insert("project_manager", 5);
            show.DataInTable("project_manager", PMTable, 1);
            //JOptionPane.showMessageDialog(this, "Successfuly Added!");

        } else
            JOptionPane.showMessageDialog(this, "Incomplete Information!");
    }//GEN-LAST:event_insertMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        if(checkData() && PMTable.getSelectedRowCount() == 1) {
            setData();
            type.update("project_manager", 5, PMTable);
            show.DataInTable("project_manager", PMTable, 1);
            JOptionPane.showMessageDialog(null, "Successfuly Edited.");

        } else 
            JOptionPane.showMessageDialog(null, "Incomplete Information!! \nPlease Complete Information and select only one row!!");
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        if(PMTable.getSelectedRowCount() == 1) {
            type.delete("project_manager", PMTable);
            show.DataInTable("project_manager", PMTable, 1);
            JOptionPane.showMessageDialog(null, "Successfuly Deleted.");
        }
        else
           JOptionPane.showMessageDialog(null, "Please Select only one Row from table!!");
    }//GEN-LAST:event_deleteMouseClicked

    private void backHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHomeMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backHomeMouseClicked

    private void exitAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitAppMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitAppMouseClicked

    private void PMTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMTableMouseClicked
        currentRow = PMTable.getSelectedRow();

        if (PMTable.getSelectedRowCount() == 1) {
            id.setText(PMTable.getValueAt(currentRow, 0) + "");
            name.setText(PMTable.getValueAt(currentRow, 1) + "");
            password.setText(PMTable.getValueAt(currentRow, 2) + "");
        }
    }//GEN-LAST:event_PMTableMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        show.DataInTableAfterSearch1("project_manager", search.getText(), PMTable);
    }//GEN-LAST:event_searchKeyReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PMTable;
    private javax.swing.JLabel admin_id;
    private javax.swing.JButton backHome;
    private javax.swing.JButton delete;
    private javax.swing.JButton exitApp;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JLabel position;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
