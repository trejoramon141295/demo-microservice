package com.demo_microservice.domain.service;

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

	@Override
	public ProductoResult insertarProducto(ProductoRecord productoRecord) {
		ProductoEntity productoEntity = new ProductoEntity();
		productoEntity.setCodigo(productoRecord.getCodigo());
		productoEntity.setNombre(productoRecord.getCodigo());
		productoEntity.setDescripcion(productoRecord.getDescripcion());
		productoEntity.setFechaRegistro(productoRecord.getFechaRegistro());

		productoCrudRepository.save(productoEntity);

		ProductoResult productoResult = new ProductoResult();
		productoResult.setCodigo(200);
		productoResult.setMensaje("Registro Exitoso");
		productoResult.setEstatus("Ok");
		return productoResult;
	}

}
