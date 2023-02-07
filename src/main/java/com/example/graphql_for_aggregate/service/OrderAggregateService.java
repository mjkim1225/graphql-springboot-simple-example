package com.example.graphql_for_aggregate.service;

import com.example.graphql_for_aggregate.entity.OrderAggregatedEntity;
import com.example.graphql_for_aggregate.entity.OrderEntity;
import com.example.graphql_for_aggregate.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderAggregateService {

    private final OrderService orderService;
    private final ProductService productService;
    private final UserService userService;

    public List<OrderAggregatedEntity> findAll () {
        List<OrderEntity> orderList = orderService.findAll();
        List<OrderAggregatedEntity> aggregatedEntityList = new ArrayList<>();
        orderList.forEach(order -> {
            Long userId = order.getUserId();
            Long productId = order.getProductId();
            aggregatedEntityList.add(
                    OrderAggregatedEntity.builder()
                            .orderId(order.getId())
                            .user(userService.findById(userId))
                            .product(productService.findById(productId))
                            .build()
            );
        });
        return aggregatedEntityList;
    }

}
