package com.beca.cursoBeca.repository;

import com.beca.cursoBeca.entity.Category;
import com.beca.cursoBeca.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
