package com.fastandfuriousrent.repository;

import com.fastandfuriousrent.entity.User;
import com.fastandfuriousrent.enumeraciones.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);
    User findByUserRole(UserRole userRole);
}
