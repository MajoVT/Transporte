package com.Transporte.request;

import com.Transporte.entitys.Usuario;
import com.Transporte.services.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

  /*  @DeleteMapping(name = "/delete/", params = id)
    public ResponseEntity Usuario eliminarUsuario(){
        //hacer consulta a bd por el id que te llega
        Usuario usuarioEliminar = usuarioService.getUsuario(id);
        if(usuarioEliminar!=null){
            //borrarlo

        }
        else{
            //si esta vacio , mostrar msj.
        }
    }

    //Crear
    @PostMapping(name = "", params = "irian los parametros")
    public ResponseEntity Usuario crearUsuario(){

    }

    //Update
    @PutMapping()   */


}
