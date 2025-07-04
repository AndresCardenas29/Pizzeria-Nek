package com.nekdress.pizza.persitence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Column(name = "id_customer", nullable = false, length = 15)
    private Integer idCustomer;

    @Column( nullable = false, length = 60)
    private String name;

    @Column(length = 100)
    private String address;

    // Email
    @Column(nullable = false, length = 100, unique = true)
    private String email;

    // Phone number
    @Column(nullable = false, length = 20)
    private String phone;
}
