package com.demo_microservice.domain.service;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.domain.dto.ProductoResult;

public interface ProductoService {

	ProductoResult insertarProducto(ProductoRecord productoRecord);

}
