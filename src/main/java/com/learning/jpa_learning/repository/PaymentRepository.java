package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
