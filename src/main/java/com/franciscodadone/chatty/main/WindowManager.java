/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chatty.main;

import com.franciscodadone.chatty.views.AppFrame;

/**
 *
 * @author Francisco Dadone
 */
public class WindowManager {
    
    public static void change(String newPanel){
        
        if(newPanel.equals("login")) {
            System.out.println("Cambiendo al login...");
            appframe.RegisterForm.setVisible(false);
            appframe.LoginForm.setVisible(true);
        } else if(newPanel.equals("register")) {
            System.out.println("Cambiendo al registro...");
            appframe.LoginForm.setVisible(false);
            appframe.RegisterForm.setVisible(true);
        }
        
    }
    
    public static void initApp() {
        
        appframe.init();
        
    }
    
    
    private static AppFrame appframe = new AppFrame();
}
