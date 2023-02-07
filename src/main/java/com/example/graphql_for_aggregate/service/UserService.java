package com.example.graphql_for_aggregate.service;

import com.example.graphql_for_aggregate.entity.UserEntity;
import com.example.graphql_for_aggregate.jpa.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepository repository;

    public List<UserEntity> findAll () {
        return new ArrayList<>(repository.findAll());
    }

    public UserEntity findById (Long id) {
        return repository.findById(id).get();
    }
}
