package com.example.graphql_for_aggregate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderAggregatedEntity {
    private Long orderId;
    private UserEntity user;
    private ProductEntity product;
}
