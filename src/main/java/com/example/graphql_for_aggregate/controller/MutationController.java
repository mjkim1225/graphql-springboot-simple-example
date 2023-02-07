package com.example.graphql_for_aggregate.controller;

import com.example.graphql_for_aggregate.entity.ProductEntity;
import com.example.graphql_for_aggregate.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MutationController {

    private final ProductService productService;

    // insert
    @MutationMapping
    public ProductEntity insertNewProduct(@Argument String no, @Argument String name) {
        return productService.insertNewProduct(no, name);
    }

    // update
    @MutationMapping
    public ProductEntity updateProductName(@Argument Long id, @Argument String name) {
        return productService.updateProductName(id, name);
    }

    // delete
    @MutationMapping
    public String deleteProduct(@Argument Long id) {
        return productService.deleteProduct(id);
    }
}
