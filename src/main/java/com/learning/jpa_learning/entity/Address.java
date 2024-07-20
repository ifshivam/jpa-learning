package com.learning.jpa_learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
    @Column(name = "streetaddress")
    private String streetAddress;
    private String state;
    private String zipcode;
    private String country;
}
