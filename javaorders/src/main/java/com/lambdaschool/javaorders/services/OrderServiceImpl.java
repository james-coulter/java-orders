package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository ordrepos;

    @Override
    public List<Order> findAllOrders() {
        List<Order> rtnList = new ArrayList<>();
        ordrepos.findAll().iterator().forEachRemaining(rtnList::add);
        return rtnList;
    }

    @Override
    public Order findOrderById(long id) {
        return ordrepos.findById(id).orElseThrow( () -> new EntityNotFoundException("Order " + id + " Not Found"));
    }


}