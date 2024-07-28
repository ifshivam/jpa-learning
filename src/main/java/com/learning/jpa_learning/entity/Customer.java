package com.learning.jpa_learning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<PhoneNumber> phoneNumbers;

    public void addPhoneNumber(PhoneNumber number){
        if(number!=null){
            if(phoneNumbers==null){
                phoneNumbers = new HashSet<>();
            }
            number.setCustomer(this);
            phoneNumbers.add(number);
        }
    }

}
