package com.zeel.commx.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeel.commx.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}