package com.transporte.entitys.repository;

import com.transporte.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository <Usuario,Long>{

    @Query(value = "SELECT * FROM usuario",nativeQuery = true)
    List<Usuario> listUsuario();

    @Query(value = "SELECT * FROM usuarios WHERE id =:id",nativeQuery = true)
    Usuario searchUsuario(@Param(value = "id") Long id);

}
