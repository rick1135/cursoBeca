package com.beca.cursoBeca.repository;

import com.beca.cursoBeca.entity.OrderItem;
import com.beca.cursoBeca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
