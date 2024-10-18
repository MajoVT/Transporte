package com.transporte.services;

import com.transporte.controller.request.TipoRequest;
import com.transporte.controller.response.TipoResponse;
import com.transporte.entitys.Tipo;
import com.transporte.entitys.repository.TipoRepository;
import com.transporte.services.service.TipoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoServiceImplement implements TipoService {

    private final TipoRepository tipoRepository;

    @Override
    public List<Tipo> getListTipo() {
        return tipoRepository.listTipo();
    }

    @Override
    public void deleteTipo(Long id) {

    }

    @Override
    public TipoResponse searchTipo(Long id) {
        return null;
    }

    @Override
    public void saveTipo(TipoRequest tipoRequest) {

    }

    @Override
    public void updateTipo(TipoRequest tipoRequest) {

    }
}

