package com.learning.jpa_learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Product {
    @Id
    private Integer id;
    private String name;
    private String description;
    private Double price;
}
