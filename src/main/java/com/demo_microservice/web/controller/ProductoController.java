package com.demo_microservice.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.domain.dto.ProductoResult;
import com.demo_microservice.domain.service.ProductoServiceImplement;

@RestController
@RequestMapping("/product")
public class ProductoController {

	@Autowired
	ProductoServiceImplement productoServiceImplement;

	@PostMapping("/save")
	ResponseEntity<ProductoResult> saveProduct(@RequestBody ProductoRecord productoRecord) {

		return new ResponseEntity<>(productoServiceImplement.insertarProducto(productoRecord), HttpStatus.OK);
	}

}
