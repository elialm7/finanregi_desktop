/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.session;

import com.elias.core.dto.UsuarioValidadoDTO;

/**
 *
 * @author Elias
 */
public class UserSession {
    
    
    private UsuarioValidadoDTO usuario; 
    private static UserSession session;
    
    private UserSession(){
        
    }
    
    
    public static synchronized UserSession getInstance(){
        if(session == null){
            session = new UserSession();
        }
        return session;
    }
    
    
    public void createSession(UsuarioValidadoDTO usuario){
        this.usuario = usuario;
    }
    
    public void resetSession(){
        this.usuario = null;
    }
    
    public boolean isValidSession(){
        return session !=null;
    }
    
    public UsuarioValidadoDTO getSession(){
        if(usuario == null){
            throw new NullPointerException("Session is null");
        }
        
        return this.usuario;
    }
}
