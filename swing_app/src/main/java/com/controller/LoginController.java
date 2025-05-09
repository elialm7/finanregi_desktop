/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;
import com.view.FormLogin;
import javax.swing.*;
/**
 *
 * @author Elias
 */
public class LoginController {
    
    private FormLogin loginFrame; 
    private SystemController systemControler;
   
    
    public LoginController(FormLogin loginFrame, SystemController systemController){
        this.loginFrame = loginFrame; 
        this.systemControler = systemController;
    }
    private void setup_defaults(){
        this.loginFrame.setVisible(true);
        this.loginFrame.setTitle("FinanRegi-Swing-v1.0.0");
        this.loginFrame.setLocationRelativeTo(null);
        this.loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.loginFrame.setResizable(false);
    }
    
    public void start() {
       setup_defaults();
        
    }
    
    
    
    
}
