package com.demo_microservice.domain.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoRecord {

	private Integer id;
	@NotNull
	@Size(min = 2, max = 25)
	private String codigo;
	@NotNull
	@Size(min = 2, max = 50)
	private String nombre;
	@Size(min = 2, max = 80)
	private String descripcion;

}
