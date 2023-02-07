package com.example.graphql_for_aggregate.service;

import com.example.graphql_for_aggregate.entity.OrderEntity;
import com.example.graphql_for_aggregate.entity.ProductEntity;
import com.example.graphql_for_aggregate.jpa.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrdersRepository repository;

    public List<OrderEntity> findAll () {
        return new ArrayList<>(repository.findAll());
    }

    public OrderEntity findById (Long id) {
        return repository.findById(id).get();
    }
}

