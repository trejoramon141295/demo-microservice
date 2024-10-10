package com.demo_microservice.domain.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_microservice.domain.dto.ProductoRecord;
import com.demo_microservice.domain.dto.ProductoResult;
import com.demo_microservice.domain.dto.Response;
import com.demo_microservice.domain.dto.Result;
import com.demo_microservice.domain.dto.Version;
import com.demo_microservice.persistence.crud.ProductoCrudRepository;
import com.demo_microservice.persistence.entity.ProductoEntity;
import com.demo_microservice.web.enums.ProductoEnum;

@Service
public class ProductoServiceImplement implements ProductoService {

	@Autowired
	ProductoCrudRepository productoCrudRepository;

	/**
	 * Metodo para guardar un producto
	 */
	@Override
	public Response insertarProducto(ProductoRecord productoRecord) {

		Response response = new Response();
		Result result = new Result();
		Version version = new Version();
		ProductoEnum productoEnum = null;
		ProductoEntity productoEntity = new ProductoEntity();
		ProductoResult productoResult = new ProductoResult();
		Optional<ProductoRecord> getProductoRecord = this.obtenerProductoPorCodigo(productoRecord.getCodigo());

		if (getProductoRecord.get().getCodigo() == productoRecord.getCodigo()) {
			result.setCodigo(productoEnum.CODIGO_PRODUCTO_EXISTENTE.getDescription());
			result.setMensaje(productoEnum.MENSAJE_PRODUCTO_EXISTENTE.getDescription());

		} else {

			productoEntity.setId(productoRecord.getId());
			productoEntity.setCodigo(productoRecord.getCodigo());
			productoEntity.setNombre(productoRecord.getNombre());
			productoEntity.setDescripcion(productoRecord.getDescripcion());

			LocalDate hoy = LocalDate.now();
			LocalTime ahora = LocalTime.now();
			LocalDateTime fechaActual = LocalDateTime.of(hoy, ahora);

			productoEntity.setFechaRegistro(fechaActual);

			result.setRespuesta(productoCrudRepository.save(productoEntity));
			result.setCodigo(productoEnum.CODIGO_EXITOSO.getDescription());
			result.setMensaje(productoEnum.MENSAJE_EXITOSO.getDescription());

		}

		version.setNombre(productoEnum.NOMBRE_API.getDescription());
		version.setVersion(productoEnum.VERSION.getDescription());
		version.setFecha(productoEnum.FECHA_API.getDescription());

		response.setResult(result);
		response.setVersion(version);

		return response;
	}

	@Override
	public Optional<ProductoRecord> obtenerProductoPorCodigo(String codigo) {

		Optional<ProductoRecord> productoRecord = productoCrudRepository.findByCodigo(codigo);

		return productoRecord;
	}

}
