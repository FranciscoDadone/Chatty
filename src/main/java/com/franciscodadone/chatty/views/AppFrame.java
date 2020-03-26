/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chatty.views;

import com.franciscodadone.chatty.main.WindowManager;
import java.awt.Color;

/**
 *
 * @author Francisco Dadone
 */
public class AppFrame extends javax.swing.JFrame {

    /**
     * Creates new form AppFrame
     */
    
    public AppFrame() {
        
        this.setBackground(Color.gray);
        this.setVisible(true);
       
    }
    
    public void init(){
        initComponents();
        LoginForm.setVisible(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterForm = new javax.swing.JPanel();
        txtUsername1 = new javax.swing.JLabel();
        fieldUsername1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtEmail1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        fieldPassword1 = new javax.swing.JPasswordField();
        fieldEmail1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtAlreadyAcc1 = new javax.swing.JLabel();
        SignUpBtn1 = new javax.swing.JButton();
        txtPassword2 = new javax.swing.JLabel();
        SignInBtn1 = new javax.swing.JButton();
        LoginForm = new javax.swing.JPanel();
        txtUsername2 = new javax.swing.JLabel();
        fieldUsernameLOGIN = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        fieldPasswordLOGIN = new javax.swing.JPasswordField();
        txtAlreadyAcc2 = new javax.swing.JLabel();
        LogInBtn = new javax.swing.JButton();
        txtPassword3 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chatty");
        setBackground(new java.awt.Color(51, 51, 51));

        RegisterForm.setBackground(new java.awt.Color(30, 33, 35));
        RegisterForm.setAlignmentX(0.0F);
        RegisterForm.setAlignmentY(0.0F);

        txtUsername1.setBackground(new java.awt.Color(57, 113, 117));
        txtUsername1.setForeground(new java.awt.Color(57, 113, 117));
        txtUsername1.setText("Username");

        fieldUsername1.setBackground(new java.awt.Color(32, 33, 35));
        fieldUsername1.setForeground(new java.awt.Color(255, 255, 255));
        fieldUsername1.setBorder(null);
        fieldUsername1.setCaretColor(new java.awt.Color(255, 255, 255));

        txtEmail1.setBackground(new java.awt.Color(57, 113, 117));
        txtEmail1.setForeground(new java.awt.Color(57, 113, 117));
        txtEmail1.setText("Email");

        fieldPassword1.setBackground(new java.awt.Color(32, 33, 35));
        fieldPassword1.setForeground(new java.awt.Color(255, 255, 255));
        fieldPassword1.setBorder(null);
        fieldPassword1.setCaretColor(new java.awt.Color(255, 255, 255));

        fieldEmail1.setBackground(new java.awt.Color(32, 33, 35));
        fieldEmail1.setForeground(new java.awt.Color(255, 255, 255));
        fieldEmail1.setBorder(null);
        fieldEmail1.setCaretColor(new java.awt.Color(255, 255, 255));

        txtAlreadyAcc1.setBackground(new java.awt.Color(57, 113, 117));
        txtAlreadyAcc1.setForeground(new java.awt.Color(57, 113, 117));
        txtAlreadyAcc1.setText("Already have an account?");

        SignUpBtn1.setBackground(new java.awt.Color(126, 87, 194));
        SignUpBtn1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SignUpBtn1.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn1.setText("Sign Up");
        SignUpBtn1.setBorderPainted(false);
        SignUpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtn1ActionPerformed(evt);
            }
        });

        txtPassword2.setBackground(new java.awt.Color(57, 113, 117));
        txtPassword2.setForeground(new java.awt.Color(57, 113, 117));
        txtPassword2.setText("Password");

        SignInBtn1.setBackground(new java.awt.Color(126, 87, 194));
        SignInBtn1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SignInBtn1.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtn1.setText("Log In");
        SignInBtn1.setBorder(null);
        SignInBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterFormLayout = new javax.swing.GroupLayout(RegisterForm);
        RegisterForm.setLayout(RegisterFormLayout);
        RegisterFormLayout.setHorizontalGroup(
            RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterFormLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword2)
                    .addGroup(RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail1)
                        .addComponent(txtUsername1)
                        .addComponent(jSeparator4)
                        .addComponent(fieldUsername1)
                        .addGroup(RegisterFormLayout.createSequentialGroup()
                            .addComponent(txtAlreadyAcc1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SignInBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator6)
                        .addComponent(jSeparator5)
                        .addComponent(SignUpBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        RegisterFormLayout.setVerticalGroup(
            RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterFormLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(txtUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtPassword2)
                .addGap(18, 18, 18)
                .addComponent(fieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(SignUpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlreadyAcc1)
                    .addComponent(SignInBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        LoginForm.setBackground(new java.awt.Color(30, 33, 35));
        LoginForm.setAlignmentX(0.0F);
        LoginForm.setAlignmentY(0.0F);
        LoginForm.setEnabled(false);

        txtUsername2.setBackground(new java.awt.Color(57, 113, 117));
        txtUsername2.setForeground(new java.awt.Color(57, 113, 117));
        txtUsername2.setText("Username / Email");

        fieldUsernameLOGIN.setBackground(new java.awt.Color(32, 33, 35));
        fieldUsernameLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        fieldUsernameLOGIN.setBorder(null);
        fieldUsernameLOGIN.setCaretColor(new java.awt.Color(255, 255, 255));

        fieldPasswordLOGIN.setBackground(new java.awt.Color(32, 33, 35));
        fieldPasswordLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        fieldPasswordLOGIN.setBorder(null);
        fieldPasswordLOGIN.setCaretColor(new java.awt.Color(255, 255, 255));

        txtAlreadyAcc2.setBackground(new java.awt.Color(57, 113, 117));
        txtAlreadyAcc2.setForeground(new java.awt.Color(57, 113, 117));
        txtAlreadyAcc2.setText("You don't have an account?");

        LogInBtn.setBackground(new java.awt.Color(126, 87, 194));
        LogInBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LogInBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogInBtn.setText("Log In");
        LogInBtn.setBorderPainted(false);
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });

        txtPassword3.setBackground(new java.awt.Color(57, 113, 117));
        txtPassword3.setForeground(new java.awt.Color(57, 113, 117));
        txtPassword3.setText("Password");

        SignUpBtn.setBackground(new java.awt.Color(126, 87, 194));
        SignUpBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.setBorder(null);
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginFormLayout = new javax.swing.GroupLayout(LoginForm);
        LoginForm.setLayout(LoginFormLayout);
        LoginFormLayout.setHorizontalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword3)
                    .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldPasswordLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsername2)
                        .addComponent(jSeparator7)
                        .addComponent(fieldUsernameLOGIN)
                        .addGroup(LoginFormLayout.createSequentialGroup()
                            .addComponent(txtAlreadyAcc2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator8)
                        .addComponent(LogInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        LoginFormLayout.setVerticalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(txtUsername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldUsernameLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword3)
                .addGap(18, 18, 18)
                .addComponent(fieldPasswordLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlreadyAcc2)
                    .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        Logo.setBackground(new java.awt.Color(51, 51, 51));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/appicon_512.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(582, Short.MAX_VALUE)
                .addComponent(RegisterForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 583, Short.MAX_VALUE)
                    .addComponent(LoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LoginForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtn1ActionPerformed
        WindowManager.change("login");
    }//GEN-LAST:event_SignInBtn1ActionPerformed

    private void SignUpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpBtn1ActionPerformed

    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInBtnActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        WindowManager.change("register");
    }//GEN-LAST:event_SignUpBtnActionPerformed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInBtn;
    public static javax.swing.JPanel LoginForm;
    public static javax.swing.JLabel Logo;
    public static javax.swing.JPanel RegisterForm;
    private javax.swing.JButton SignInBtn1;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JButton SignUpBtn1;
    private javax.swing.JTextField fieldEmail1;
    private javax.swing.JPasswordField fieldPassword1;
    private javax.swing.JPasswordField fieldPasswordLOGIN;
    private javax.swing.JTextField fieldUsername1;
    private javax.swing.JTextField fieldUsernameLOGIN;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel txtAlreadyAcc1;
    private javax.swing.JLabel txtAlreadyAcc2;
    private javax.swing.JLabel txtEmail1;
    private javax.swing.JLabel txtPassword2;
    private javax.swing.JLabel txtPassword3;
    private javax.swing.JLabel txtUsername1;
    private javax.swing.JLabel txtUsername2;
    // End of variables declaration//GEN-END:variables
}
