package com.demo_microservice.domain.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoRecord {

	private String codigo;
	private String nombre;
	private String descripcion;
	private LocalDateTime fechaRegistro;

}
