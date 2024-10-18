package com.transporte.controller;

import com.transporte.entitys.Usuario;
import com.transporte.controller.request.UsuarioRequest;
import com.transporte.controller.response.UsuarioResponse;
import com.transporte.services.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(name = "v1/usuario")

public class UsuarioController {

     private final UsuarioService usuarioService;
    @GetMapping(name = "/")
    public ResponseEntity <List<Usuario>> listUsuarioApi(){
        List<Usuario> usuarioList = usuarioService.getListUsuario();
        return new ResponseEntity<>(usuarioList, HttpStatus.ACCEPTED);

    }

    @GetMapping("/delete")
    public ResponseEntity<String>  deletePersonsApi(@RequestParam(name = "id") Long id){
        usuarioService.deleteUsuario(id);
        return ResponseEntity.accepted().body("La accion solicitada se realizo");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<UsuarioResponse>  searchUsuarioApi(@PathVariable Long id){
        UsuarioResponse usuarioResponse =  usuarioService.searchUsuario(id);
        return ResponseEntity.accepted().body(usuarioResponse);
    }

    @PostMapping("/save")
    public ResponseEntity<String> savePersonsApi(@RequestBody UsuarioRequest usuarioRequest){
        usuarioService.saveUsuario(usuarioRequest);
        return ResponseEntity.accepted().body("La accion solicitada se realizo");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updatePersonsApi(@RequestBody UsuarioRequest usuarioRequest){
        usuarioService.updateUsuario(usuarioRequest);
        return ResponseEntity.accepted().body("La accion solicitada se realizo");
    }

}