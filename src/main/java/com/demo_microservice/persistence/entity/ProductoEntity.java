package com.demo_microservice.persistence.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class ProductoEntity {

	private Integer id;
	private String codigo;
	private String nombre;
	private String descripcion;
	@Column(name = "fecha_registro")
	private LocalDateTime fechaRegistro;

}
