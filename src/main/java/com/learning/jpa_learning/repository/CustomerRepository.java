package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}