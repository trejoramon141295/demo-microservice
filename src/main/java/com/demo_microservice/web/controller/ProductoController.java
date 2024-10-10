package com.demo_microservice.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.domain.dto.ProductoResult;
import com.demo_microservice.domain.dto.Response;
import com.demo_microservice.domain.service.ProductoServiceImplement;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
public class ProductoController {

	@Autowired
	ProductoServiceImplement productoServiceImplement;

	@ApiOperation(value = "Guardar Producto"
            ,notes = "El siguiente micro-servicio hace un registro de un producto nuevo a la BD")
	@PostMapping("/save")
	ResponseEntity<Response> saveProduct(@RequestBody @Valid ProductoRecord productoRecord) {

		return new ResponseEntity<>(productoServiceImplement.insertarProducto(productoRecord), HttpStatus.OK);
	}

}
