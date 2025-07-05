package com.nekdress.pizza.persitence.repository;

import com.nekdress.pizza.persitence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {

}
