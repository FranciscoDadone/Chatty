/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chatty.util;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Usuario
 */
public class Fonts {
    
    private Font font;
    
    public final static String UNISANS = ".\\src\\main\\java\\com\\franciscodadone\\chatty\\utils\\Cube.ttf";
    
    public Font fuente(String fontName, int estilo, float tamagno) {
        try {
            InputStream myStream = new BufferedInputStream(new FileInputStream(fontName));
            font = Font.createFont(Font.TRUETYPE_FONT, myStream);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error loading the font (" + fontName + ")");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        
        Font tfont = font.deriveFont(estilo, tamagno);
        return tfont;
        
    }
    
}
