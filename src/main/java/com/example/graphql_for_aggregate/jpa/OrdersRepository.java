package com.example.graphql_for_aggregate.jpa;

import com.example.graphql_for_aggregate.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<OrderEntity, Long> {
}
