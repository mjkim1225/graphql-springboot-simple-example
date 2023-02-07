package com.example.graphql_for_aggregate.controller;

import com.example.graphql_for_aggregate.entity.OrderAggregatedEntity;
import com.example.graphql_for_aggregate.entity.OrderEntity;
import com.example.graphql_for_aggregate.entity.ProductEntity;
import com.example.graphql_for_aggregate.entity.UserEntity;
import com.example.graphql_for_aggregate.service.OrderAggregateService;
import com.example.graphql_for_aggregate.service.OrderService;
import com.example.graphql_for_aggregate.service.ProductService;
import com.example.graphql_for_aggregate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QueryController {
    private final UserService userService;
    private final OrderService orderService;
    private final ProductService productService;

    private final OrderAggregateService orderAggregateService;

    @QueryMapping
    public List<ProductEntity> findAllProducts() {
        return productService.findAll();
    }

    @QueryMapping
    public List<OrderEntity> findAllOrders() {
        return orderService.findAll();
    }

    @QueryMapping
    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }

    @QueryMapping
    public List<OrderAggregatedEntity> findAllAggregatedOrders() {
        return orderAggregateService.findAll();
    }
}
