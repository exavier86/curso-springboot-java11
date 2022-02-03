package com.eriton.curso.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eriton.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
