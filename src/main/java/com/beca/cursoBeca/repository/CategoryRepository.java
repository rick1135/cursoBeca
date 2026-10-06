package com.beca.cursoBeca.repository;

import com.beca.cursoBeca.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
