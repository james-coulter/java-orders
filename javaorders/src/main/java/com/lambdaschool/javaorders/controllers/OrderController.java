package com.lambdaschool.javaorders.controllers;



import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<?> findOrdersById(@PathVariable long id) {

       Order a = orderService.findOrdersById(id);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}
