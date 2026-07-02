package com.mickey.ecommercebackend.entity;

import com.mickey.ecommercebackend.entity.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL) //When you persist, update, or delete a User entity, perform the same operation on the associated Cart entity.
    private Cart cart;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

}
