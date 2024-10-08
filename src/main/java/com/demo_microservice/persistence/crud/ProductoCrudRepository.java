package com.demo_microservice.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.demo_microservice.persistence.entity.ProductoEntity;

public interface ProductoCrudRepository extends CrudRepository<ProductoEntity, Integer> {

}
