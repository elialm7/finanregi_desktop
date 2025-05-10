/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;
import com.elias.core.Exceptions.UsuarioNoValidoException;
import com.elias.core.dto.UsuarioValidadoDTO;
import com.elias.core.dto.UsuarioValidarDTO;
import com.elias.core.service.UsuarioService;
import com.session.UserSession;
import com.view.FormLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
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
    
    
    
    private void setup_events(){
        this.loginFrame.getLogin_btn().addActionListener(this::handleLoginButton);
    }
    
    public void start() {
       setup_defaults();
       setup_events();
    }
    
    
    // handling events for buttons
    
    
    
    private void handleLoginButton(ActionEvent e){
        
        try{
            UsuarioValidarDTO newUser = getUsuarioValidar();
            UsuarioService UserService = new UsuarioService();
           UsuarioValidadoDTO validUser = UserService.validarUsuario(newUser);
            UserSession.getInstance().createSession(validUser);
            JOptionPane.showMessageDialog(loginFrame, "Bienvenido!!!");
            this.loginFrame.dispose();
            systemControler.showMainMenu();
        }catch(UsuarioNoValidoException ex){
            JOptionPane.showMessageDialog(loginFrame, "CredencialesIncorrectas");
        }   
    }
    
    private UsuarioValidarDTO getUsuarioValidar(){
        
        String username = this.loginFrame.getUsername_txt().getText();
        String password = this.loginFrame.getPassword_txt().getText();
        
        return new UsuarioValidarDTO(username, password);
    }
    
}
