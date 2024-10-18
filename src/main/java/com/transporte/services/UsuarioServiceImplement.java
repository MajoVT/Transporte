package com.transporte.services;

import com.transporte.entitys.Usuario;
import com.transporte.entitys.repository.UsuarioRepository;
import com.transporte.controller.request.UsuarioRequest;
import com.transporte.controller.response.UsuarioResponse;
import com.transporte.services.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImplement implements UsuarioService {


   private final UsuarioRepository usuarioRepository;



    @Override
    public List<Usuario> getListUsuario() {
        return usuarioRepository.listUsuario();
    }

    @Override
    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }


    @Override
    public UsuarioResponse searchUsuario(Long id) {
        return null;
    }

    @Override
    public void saveUsuario(UsuarioRequest personaRequest) {

    }

    @Override
    public void updateUsuario(UsuarioRequest personaRequest) {

    }


}
