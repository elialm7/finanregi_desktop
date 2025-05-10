/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.view.FormMainMenu;

/**
 *
 * @author Elias
 */
public class MainMenuController {
    
    private SystemController system_controller; 
    private FormMainMenu mainmenu_form;

    public MainMenuController(SystemController system_controller, FormMainMenu mainmenu_form) {
        this.system_controller = system_controller;
        this.mainmenu_form = mainmenu_form;
    }
    
    
    public void initialize(){
        
        this.mainmenu_form.setVisible(true);
    }
    
}
