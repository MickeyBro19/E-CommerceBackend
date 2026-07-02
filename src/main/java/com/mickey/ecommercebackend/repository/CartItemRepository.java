package com.mickey.ecommercebackend.repository;

import com.mickey.ecommercebackend.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
}
