package com.transporte.entitys.repository;

import com.transporte.entitys.Tipo;
import com.transporte.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoRepository extends JpaRepository<Usuario,Long> {

    @Query(value = "SELECT * FROM tipo",nativeQuery = true)
    List<Tipo> listTipo();

    @Query(value = "SELECT * FROM tipos WHERE id =:id",nativeQuery = true)
    Tipo searchTipo(@Param(value = "id") Long id);

}
