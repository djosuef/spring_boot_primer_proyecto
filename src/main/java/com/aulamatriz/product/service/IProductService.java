package com.aulamatriz.product.service;

import com.aulamatriz.product.entities.ProductEntity;
import org.apache.tomcat.util.digester.SetPropertiesRule;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductService {

    ResponseEntity<?> create(ProductEntity productEntity);
    ResponseEntity<List<ProductEntity>> listAllProducts();

    ResponseEntity<ProductEntity> findById(int id);

    ResponseEntity<?> update(int id, ProductEntity product);

    ResponseEntity<?> delete(int id);
}
