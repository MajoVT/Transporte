package com.transporte.controller.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoRequest {

    private long id;
    private String tipo_buses;
    private String taxi;
    private String metro;
}
