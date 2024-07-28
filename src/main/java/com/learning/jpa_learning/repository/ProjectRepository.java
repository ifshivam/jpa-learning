package com.learning.jpa_learning.repository;

import com.learning.jpa_learning.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
