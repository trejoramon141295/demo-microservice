package com.demo_microservice.domain.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

	private String codigo;
	private String mensaje;
	private LocalDateTime fechaEjecucion;
	private Object respuesta;

}
