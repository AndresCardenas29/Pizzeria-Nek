package com.nekdress.pizza.persitence.repository;

import com.nekdress.pizza.persitence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {

}
