package com.demo_microservice.domain.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.domain.dto.ProductoResult;
import com.demo_microservice.persistence.crud.ProductoCrudRepository;
import com.demo_microservice.persistence.entity.ProductoEntity;

@Service
public class ProductoServiceImplement implements ProductoService {

	@Autowired
	ProductoCrudRepository productoCrudRepository;
/**
 * Metodo para guardar un producto
 */
	@Override
	public ProductoResult insertarProducto(ProductoRecord productoRecord) {
		
		ProductoEntity productoEntity = new ProductoEntity();
		productoEntity.setId(productoRecord.getId());
		productoEntity.setCodigo(productoRecord.getCodigo());
		productoEntity.setNombre(productoRecord.getNombre());
		productoEntity.setDescripcion(productoRecord.getDescripcion());
		
		LocalDate hoy = LocalDate.now();
		LocalTime ahora = LocalTime.now();
		LocalDateTime fechaActual = LocalDateTime.of(hoy, ahora);

		productoEntity.setFechaRegistro(fechaActual);

		productoCrudRepository.save(productoEntity);

		ProductoResult productoResult = new ProductoResult();
		productoResult.setCodigo(200);
		productoResult.setMensaje("Registro Exitoso");
		productoResult.setEstatus("Ok");
		return productoResult;
	}

}
