/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chatty.main;

import com.franciscodadone.chatty.views.AppFrame;
import javax.swing.JPanel;

/**
 *
 * @author Francisco Dadone
 */
public class WindowManager {
    
    public static void change(JPanel newPanel){
        AppFrame.Logo.setVisible(false);
        AppFrame.OpacidadLogo.setVisible(false);
        AppFrame.RegisterForm.setVisible(false);
        
        new AppFrame().add(newPanel);
        
    }
    
}
