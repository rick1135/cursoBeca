package com.beca.cursoBeca.repository;

import com.beca.cursoBeca.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
