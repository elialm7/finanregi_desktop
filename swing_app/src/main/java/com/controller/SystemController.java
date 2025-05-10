/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.session.UserSession;
import com.view.FormLogin;
import com.view.FormMainMenu;

/**
 *
 * @author Elias
 */
public class SystemController {
    private String[] args;
    public SystemController(String... args){
        this.args  = args;
    }
    public void initialize(){
        start_SessionManager();
        start_login();
    }
    
    private void start_SessionManager(){
        UserSession.getInstance();
    }
    
    
    private void start_login(){   
        FormLogin login_view = new FormLogin();
        LoginController login_controller = new LoginController(login_view, this);
        login_controller.start(); 
    }

    void showMainMenu() {
        FormMainMenu mainForm = new FormMainMenu();
        MainMenuController controller = new MainMenuController(this, mainForm);
        controller.initialize();
    }
    
    
}
