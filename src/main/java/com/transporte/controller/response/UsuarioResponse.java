package com.transporte.controller.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioResponse {

    private String nombre;
    private String email;
    private int telefono;
    private  int contraseña;
    private String ubicacion_actual;
    private int contacto_confianza;

}
