package com.hajuna.ecommerceshop.repository;

import com.hajuna.ecommerceshop.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
