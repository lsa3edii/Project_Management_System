package view;

import controller.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private String response;
    UsersRepo type = new UsersMethods();

    public Login() {
        initComponents();
        setDisableButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        pmButton = new javax.swing.JRadioButton();
        tlButton = new javax.swing.JRadioButton();
        employeeButton = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(61, 142, 242));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(61, 142, 242));
        jLabel3.setText("\"Login Page\" ");

        password.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        password.setForeground(new java.awt.Color(61, 142, 242));

        text1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(61, 142, 242));
        text1.setText("User ID");

        text2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text2.setForeground(new java.awt.Color(61, 142, 242));
        text2.setText("Password");

        jPanel2.setBackground(new java.awt.Color(61, 142, 242));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\"Project Management System\" ");

        exit.setBackground(new java.awt.Color(255, 255, 254));
        exit.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(61, 142, 242));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        text3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-100 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(text3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        login.setBackground(new java.awt.Color(255, 255, 254));
        login.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        login.setForeground(new java.awt.Color(61, 142, 242));
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 254));
        clear.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(61, 142, 242));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        id.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        id.setForeground(new java.awt.Color(61, 142, 242));

        pmButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(pmButton);
        pmButton.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        pmButton.setForeground(new java.awt.Color(61, 142, 242));
        pmButton.setText("Project Manager");
        pmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pmButtonMouseClicked(evt);
            }
        });

        tlButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(tlButton);
        tlButton.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        tlButton.setForeground(new java.awt.Color(61, 142, 242));
        tlButton.setText("Team Leader");
        tlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlButtonActionPerformed(evt);
            }
        });

        employeeButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(employeeButton);
        employeeButton.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        employeeButton.setForeground(new java.awt.Color(61, 142, 242));
        employeeButton.setText("Employee");
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(61, 142, 242));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        admin.setBackground(new java.awt.Color(61, 142, 242));
        admin.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin →");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text2)
                            .addComponent(text1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pmButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(employeeButton))
                                    .addComponent(tlButton))))
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tlButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
    
    void setDisableButton() {
        id.setEnabled(false); password.setEnabled(false);
        login.setEnabled(false); clear.setEnabled(false);
        text1.setEnabled(false); text2.setEnabled(false);
    }
    
    void setEnabledButton() {
        id.setEnabled(true); password.setEnabled(true);
        login.setEnabled(true); clear.setEnabled(true);
        text1.setEnabled(true); text2.setEnabled(true);
    }
    
    boolean checkData() {
        if(!id.getText().isEmpty() && !password.getText().isEmpty())
            return true;
        
        return false;
    }
    
    //handle by try - catch
    void setData() {
        type.users.setID(Integer.valueOf(id.getText()));
        type.users.setPassword(password.getText());
    }

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed
        if(employeeButton.isSelected())
            setEnabledButton();
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void tlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlButtonActionPerformed
        if(tlButton.isSelected())
            setEnabledButton();
    }//GEN-LAST:event_tlButtonActionPerformed

    private void pmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmButtonMouseClicked
        if(pmButton.isSelected())
            setEnabledButton();
    }//GEN-LAST:event_pmButtonMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        id.setText("");
        password.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if(checkData()) {
            setData();
            
            if(pmButton.isSelected())
                if(type.login("project_manager")) {
                    JOptionPane.showMessageDialog(null, "Successfuly Login!");
                    new view_PM.Home().setVisible(true);
                    this.dispose();
                } else
                    JOptionPane.showMessageDialog(this, "Wrong ID or Password!!\nPlease Check your data again!");
              

            if(tlButton.isSelected())
                if(type.login("team_leader")) {
                    JOptionPane.showMessageDialog(null, "Successfuly Login!");
                    new view_TL.Home().setVisible(true);
                    this.dispose();
                } else
                JOptionPane.showMessageDialog(this, "Wrong ID or Password!!\nPlease Check your data again!");
              

            if(employeeButton.isSelected())
                if(type.login("employee")) {
                    JOptionPane.showMessageDialog(null, "Successfuly Login!");
                    new view_employee.Home().setVisible(true);
                    this.dispose();
                } else
                    JOptionPane.showMessageDialog(this, "Wrong ID or Password!!\nPlease Check your data again!");
              
        
        } else 
            JOptionPane.showMessageDialog(this, "Incomplete Information!");
    }//GEN-LAST:event_loginMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        response = JOptionPane.showInputDialog(this, "Enter Password?", "Sign Up", JOptionPane.QUESTION_MESSAGE);
        try {
            if(response.equals("0000")) {
                new view_admin.LoginAdmin().setVisible(true);
                this.dispose();
            } 
            else
                JOptionPane.showMessageDialog(null, "Wrong Password!");
        } catch(Exception ex) {
            //
        }
    }//GEN-LAST:event_adminMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton employeeButton;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton pmButton;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JRadioButton tlButton;
    // End of variables declaration//GEN-END:variables
}
