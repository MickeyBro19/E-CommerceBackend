package com.mickey.ecommercebackend.repository;

import com.mickey.ecommercebackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
