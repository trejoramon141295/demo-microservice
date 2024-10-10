package com.demo_microservice.persistence.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.persistence.entity.ProductoEntity;

@Repository
public interface ProductoCrudRepository extends CrudRepository<ProductoEntity, Integer> {
	
	Optional<ProductoRecord> findByCodigo(String codigo);

}
