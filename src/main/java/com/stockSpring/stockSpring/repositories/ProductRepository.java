package com.stockSpring.stockSpring.repositories;

import com.stockSpring.stockSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
