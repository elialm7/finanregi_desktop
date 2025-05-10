package com.elias.core.service;

import com.elias.core.Exceptions.UsuarioNoValidoException;
import com.elias.core.dto.UsuarioValidadoDTO;
import com.elias.core.dto.UsuarioValidarDTO;

public class UsuarioService {


    public UsuarioValidadoDTO validarUsuario(UsuarioValidarDTO usuarioValidaDTO) throws UsuarioNoValidoException {

        //todo: check if the user is admin, if the user is admin then verify that it exists on the database, ifnot, create an admin user and accept the login

        //todo: if it is not adming, then check if the user exist and the credentials are correct, if not, then throw the exception of the signature of the method

        return null;
    }



}
