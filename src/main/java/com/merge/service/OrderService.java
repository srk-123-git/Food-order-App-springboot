package com.merge.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merge.entity.Order;
import com.merge.entity.User;
import com.merge.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrdersForUser(User user) {
        return orderRepository.findAll();  // Add logic for filtering orders by user if needed
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
