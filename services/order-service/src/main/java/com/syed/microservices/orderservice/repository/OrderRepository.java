package com.syed.microservices.orderservice.repository;

import com.syed.microservices.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

