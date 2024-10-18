package com.transporte.controller;

import com.transporte.controller.request.TipoRequest;
import com.transporte.controller.response.TipoResponse;
import com.transporte.entitys.Tipo;
import com.transporte.services.service.TipoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping(name = "v1/tipo")
public class TipoController {

    private final TipoService tipoService;
    @GetMapping(name = "/")
    public ResponseEntity<List<Tipo>> listTipoApi(){
        List<Tipo> tipoList = tipoService.getListTipo();
        return new ResponseEntity<>(tipoList, HttpStatus.ACCEPTED);

    }

    @GetMapping("/delete")
    public ResponseEntity<String>  deletePersonsApi(@RequestParam(name = "id") Long id){
        tipoService.deleteTipo(id);
        return ResponseEntity.accepted().body("La accion solicitada se realizo");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<TipoResponse>  searchTipoApi(@PathVariable Long id){
        TipoResponse tipoResponse =  tipoService.searchTipo(id);
        return ResponseEntity.accepted().body(tipoResponse);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveTipoApi(@RequestBody TipoRequest tipoRequest){
        tipoService.saveTipo(tipoRequest);
        return ResponseEntity.accepted().body("La accion solicitada se realizo");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateTipoApi(@RequestBody TipoRequest tipoRequest){
        tipoService.updateTipo(tipoRequest);
        return ResponseEntity.accepted().body("La accion solicitada se realizo");
    }

}
