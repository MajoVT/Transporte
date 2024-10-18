package com.transporte.controller.request;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioRequest {
    private long id;
    private String nombre;
    private String email;
    private int telefono;
    private  int contraseña;
    private String ubicacion_actual;
    private int contacto_confianza;

}
