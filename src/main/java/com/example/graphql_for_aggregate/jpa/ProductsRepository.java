package com.example.graphql_for_aggregate.jpa;

import com.example.graphql_for_aggregate.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<ProductEntity, Long> {
}
