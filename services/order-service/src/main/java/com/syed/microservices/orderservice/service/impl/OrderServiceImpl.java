package com.syed.microservices.orderservice.service.impl;

import com.syed.microservices.orderservice.dto.OrderRequest;
import com.syed.microservices.orderservice.dto.OrderResponse;
import com.syed.microservices.orderservice.entity.Order;
import com.syed.microservices.orderservice.repository.OrderRepository;
import com.syed.microservices.orderservice.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        Order order = new Order();
        order.setUsername(request.getUsername());
        order.setItem(request.getItem());
        order.setQuantity(request.getQuantity());

        Order saved = orderRepository.save(order);

        OrderResponse response = new OrderResponse();
        response.setId(saved.getId());
        response.setUsername(saved.getUsername());
        response.setItem(saved.getItem());
        response.setQuantity(saved.getQuantity());
        response.setCreatedAt(saved.getCreatedAt());
        return response;
    }
}

