package com.transporte.services.service;


import com.transporte.entitys.Usuario;
import com.transporte.controller.request.UsuarioRequest;
import com.transporte.controller.response.UsuarioResponse;

import java.util.List;

public interface UsuarioService {

    List<Usuario>getListUsuario();
    void deleteUsuario(Long id);
    UsuarioResponse searchUsuario(Long id);
    void saveUsuario(UsuarioRequest personaRequest);
    void updateUsuario(UsuarioRequest personaRequest);
}

