package com.syed.microservices.orderservice.service;

import com.syed.microservices.orderservice.dto.OrderRequest;
import com.syed.microservices.orderservice.dto.OrderResponse;

public interface OrderService {
    OrderResponse createOrder(OrderRequest request);
}

