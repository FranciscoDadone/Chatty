/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chatty.util;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class ImageLoader {
    
    public ImageIcon load(String path) {
        try {
            return new ImageIcon(path);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
