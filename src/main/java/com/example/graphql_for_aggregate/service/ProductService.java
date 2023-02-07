package com.example.graphql_for_aggregate.service;

import com.example.graphql_for_aggregate.entity.ProductEntity;
import com.example.graphql_for_aggregate.entity.UserEntity;
import com.example.graphql_for_aggregate.jpa.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductsRepository repository;

    public List<ProductEntity> findAll () {
        return new ArrayList<>(repository.findAll());
    }

    public ProductEntity findById (Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public ProductEntity insertNewProduct(String no, String name) {
        return repository.saveAndFlush(ProductEntity.builder().no(no).name(name).build());
    }

    @Transactional
    public ProductEntity updateProductName(Long id, String name) {
        ProductEntity entity = repository.findById(id).get();
        entity.setName(name);
        return entity;
    }

    @Transactional
    public String deleteProduct(Long id) {
        ProductEntity entity = repository.findById(id).get();
        repository.delete(entity);
        return entity.getName() + " is delete.";
    }
}
