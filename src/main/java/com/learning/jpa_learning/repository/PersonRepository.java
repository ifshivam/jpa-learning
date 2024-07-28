package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}