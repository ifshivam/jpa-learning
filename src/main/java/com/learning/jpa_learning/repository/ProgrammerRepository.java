package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammerRepository extends JpaRepository<Programmer,Integer> {
}
