/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chatty.views;

import com.franciscodadone.chatty.main.WindowManager;
import com.franciscodadone.chatty.util.Fonts;
import com.franciscodadone.chatty.util.ImageLoader;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Francisco Dadone
 */
public class AppFrame extends javax.swing.JFrame {

    /**
     * Creates new form AppFrame
     */
    public AppFrame() {
        initComponents();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpacidadLogo = new javax.swing.JPanel();
        RegisterForm = new javax.swing.JPanel();
        txtUsername = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        fieldPassword = new javax.swing.JPasswordField();
        fieldEmail = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtAlreadyAcc = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        txtPassword1 = new javax.swing.JLabel();
        SignInBtn = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chatty");
        setBackground(new java.awt.Color(33, 35, 37));

        OpacidadLogo.setBackground(new java.awt.Color(0, 0, 0, 200));
        OpacidadLogo.setAlignmentX(0.0F);
        OpacidadLogo.setAlignmentY(0.0F);

        javax.swing.GroupLayout OpacidadLogoLayout = new javax.swing.GroupLayout(OpacidadLogo);
        OpacidadLogo.setLayout(OpacidadLogoLayout);
        OpacidadLogoLayout.setHorizontalGroup(
            OpacidadLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        OpacidadLogoLayout.setVerticalGroup(
            OpacidadLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        RegisterForm.setBackground(new java.awt.Color(30, 33, 35));
        RegisterForm.setAlignmentX(0.0F);
        RegisterForm.setAlignmentY(0.0F);

        txtUsername.setBackground(new java.awt.Color(57, 113, 117));
        txtUsername.setForeground(new java.awt.Color(57, 113, 117));
        txtUsername.setText("Username");

        fieldUsername.setBackground(new java.awt.Color(32, 33, 35));
        fieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        fieldUsername.setBorder(null);
        fieldUsername.setCaretColor(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(57, 113, 117));
        txtEmail.setForeground(new java.awt.Color(57, 113, 117));
        txtEmail.setText("Email");

        fieldPassword.setBackground(new java.awt.Color(32, 33, 35));
        fieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        fieldPassword.setBorder(null);
        fieldPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        fieldEmail.setBackground(new java.awt.Color(32, 33, 35));
        fieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        fieldEmail.setBorder(null);
        fieldEmail.setCaretColor(new java.awt.Color(255, 255, 255));

        txtAlreadyAcc.setBackground(new java.awt.Color(57, 113, 117));
        txtAlreadyAcc.setForeground(new java.awt.Color(57, 113, 117));
        txtAlreadyAcc.setText("Already have an account?");

        SignUpBtn.setBackground(new java.awt.Color(126, 87, 194));
        SignUpBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.setBorderPainted(false);
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        txtPassword1.setBackground(new java.awt.Color(57, 113, 117));
        txtPassword1.setForeground(new java.awt.Color(57, 113, 117));
        txtPassword1.setText("Password");

        SignInBtn.setBackground(new java.awt.Color(126, 87, 194));
        SignInBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SignInBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtn.setText("Sign In");
        SignInBtn.setBorder(null);
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterFormLayout = new javax.swing.GroupLayout(RegisterForm);
        RegisterForm.setLayout(RegisterFormLayout);
        RegisterFormLayout.setHorizontalGroup(
            RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterFormLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword1)
                    .addGroup(RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail)
                        .addComponent(txtUsername)
                        .addComponent(jSeparator1)
                        .addComponent(fieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                        .addGroup(RegisterFormLayout.createSequentialGroup()
                            .addComponent(txtAlreadyAcc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator2)
                        .addComponent(SignUpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        RegisterFormLayout.setVerticalGroup(
            RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterFormLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(txtUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtPassword1)
                .addGap(18, 18, 18)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlreadyAcc)
                    .addComponent(SignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Logo.setBackground(new java.awt.Color(33, 35, 37));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/appicon_512.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OpacidadLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(RegisterForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpacidadLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RegisterForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed

        WindowManager.change(new LoginPanel());
        
    }//GEN-LAST:event_SignInBtnActionPerformed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Logo;
    public static javax.swing.JPanel OpacidadLogo;
    public static javax.swing.JPanel RegisterForm;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtAlreadyAcc;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtPassword1;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}