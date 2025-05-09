/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.view.FormLogin;

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
        start_login();
    }
    
    
    private void start_login(){   
        FormLogin login_view = new FormLogin();
        LoginController login_controller = new LoginController(login_view, this);
        login_controller.start(); 
    }
    
    
}
