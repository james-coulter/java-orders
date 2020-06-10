package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllOrders();
    Order findOrderById(long id);
}
