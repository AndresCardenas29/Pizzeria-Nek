package com.nekdress.pizza.service;

import com.nekdress.pizza.persitence.entity.OrderEntity;
import com.nekdress.pizza.persitence.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getAll() {
        List<OrderEntity> orders = this.orderRepository.findAll();
        orders.forEach( order -> System.out.println(order.getCustomer().getName()));
        return orders;
    }
}
