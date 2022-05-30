package com.example.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUser(String userId);
    UserEntity findByEmail(String username);
}
