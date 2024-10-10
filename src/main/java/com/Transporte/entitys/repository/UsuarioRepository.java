package com.Transporte.entitys.repository;

import com.Transporte.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository <Usuario,Integer>{
    @Query(value = "SELECT * FROM usuario",nativeQuery = true)
    List<Usuario> listUsuario();

    @Override
    List<Usuario> findAll();
}
