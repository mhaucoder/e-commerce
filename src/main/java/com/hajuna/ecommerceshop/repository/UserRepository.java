package com.hajuna.ecommerceshop.repository;

import com.hajuna.ecommerceshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
