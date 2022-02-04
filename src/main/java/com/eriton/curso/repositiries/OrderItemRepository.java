package com.eriton.curso.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eriton.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
