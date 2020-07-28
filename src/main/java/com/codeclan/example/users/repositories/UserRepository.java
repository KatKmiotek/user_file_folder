package com.codeclan.example.users.repositories;

import com.codeclan.example.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
