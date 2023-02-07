package com.example.graphql_for_aggregate.jpa;

import com.example.graphql_for_aggregate.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserEntity, Long> {
}
