package com.transporte.services.service;

import com.transporte.controller.request.TipoRequest;
import com.transporte.controller.request.UsuarioRequest;
import com.transporte.controller.response.TipoResponse;
import com.transporte.controller.response.UsuarioResponse;
import com.transporte.entitys.Tipo;
import com.transporte.entitys.Usuario;

import java.util.List;

public interface TipoService {

    List<Tipo> getListTipo();
    void deleteTipo(Long id);
    TipoResponse searchTipo(Long id);
    void saveTipo(TipoRequest tipoRequest);
    void updateTipo(TipoRequest tipoRequest);
}
