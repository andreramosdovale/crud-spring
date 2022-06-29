package com.example.project.service;

import com.example.project.entities.Order;
import com.example.project.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) throws Exception {
        Optional<Order> order = repository.findById(id);

        if (order.isPresent()) {
            return order.get();
        }
        throw new Exception("Order not found!");
    }
}
