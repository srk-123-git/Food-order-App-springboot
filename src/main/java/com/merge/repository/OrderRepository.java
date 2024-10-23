package com.merge.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.merge.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
