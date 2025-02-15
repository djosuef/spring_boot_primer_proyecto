package com.aulamatriz.product.repository;

import com.aulamatriz.product.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    boolean existsByName(String name);
}
