package com.demo_microservice.domain.service;

import java.util.Optional;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.domain.dto.Response;
import com.demo_microservice.domain.dto.Result;

public interface ProductoService {

	Response insertarProducto(ProductoRecord productoRecord);

	Optional<ProductoRecord> obtenerProductoPorCodigo(String codigo);

}
