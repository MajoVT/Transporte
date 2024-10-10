package com.Transporte.services;

import com.Transporte.entitys.Usuario;
import com.Transporte.entitys.repository.UsuarioRepository;
import com.Transporte.services.service.UsuarioService;
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

}
