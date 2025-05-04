package com.barchen.app.repository;

import com.barchen.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//JpaRepository<User, Long> for basic CRUD ops.
public interface UserRepository extends JpaRepository<User, Long> {
    // Useful for login or validation workflows.
    Optional<User> findByEmail(String email);

    // Helps with signup validation or checks before creating users.
    boolean existsByEmail(String email);
}
