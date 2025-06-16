package com.lms.repository;

import com.lms.model.Role;
import com.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    long countByRole(Role role);

    List<User> findByRole(Role role);
}
