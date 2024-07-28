package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseRepository extends JpaRepository<License,Long> {
}
