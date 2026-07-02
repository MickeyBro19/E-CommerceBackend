package com.mickey.ecommercebackend.repository;

import com.mickey.ecommercebackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
