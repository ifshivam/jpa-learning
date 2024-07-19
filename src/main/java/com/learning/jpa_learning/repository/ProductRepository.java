package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
