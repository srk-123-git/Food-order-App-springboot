package com.merge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.merge.entity.Order;
import com.merge.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/show")
    public List<Order> getOrdersForUser(@RequestParam Long userId) {
        // Fetch user from user service (omitted for simplicity)
        return orderService.getOrdersForUser(null);  // Pass actual user
    }

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}
