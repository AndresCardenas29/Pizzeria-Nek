package com.nekdress.pizza.persitence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pizza")
@Getter
@Setter
@NoArgsConstructor
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(name = "name", nullable = false, length = 30, unique = true)
    private String name;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "price", nullable = false, columnDefinition = "decimal(5,2)")
    private Double price;
    @Column(name = "vegetarian", columnDefinition = "TINYINT")
    private Boolean vegetarian;

    @Column(name = "vegan", columnDefinition = "TINYINT")
    private Boolean vegan;

    @Column(name = "available", columnDefinition = "TINYINT", nullable = false)
    private Boolean available;

}
