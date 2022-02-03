package com.eriton.curso.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eriton.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
