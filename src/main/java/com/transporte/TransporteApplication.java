package com.transporte;

import com.transporte.entitys.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransporteApplication.class, args);
		Usuario usuario  = new Usuario();
		usuario.getId();

	}

}
