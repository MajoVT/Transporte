package com.transporte.controller.response;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class TipoResponse {

        private long id;
        private String tipo_buses;
        private String taxi;
        private String metro;
    }

