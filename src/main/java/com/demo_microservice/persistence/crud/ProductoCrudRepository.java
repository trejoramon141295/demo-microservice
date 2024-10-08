package com.demo_microservice.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo_microservice.persistence.entity.ProductoEntity;

@Repository
public interface ProductoCrudRepository extends CrudRepository<ProductoEntity, Integer> {

}
