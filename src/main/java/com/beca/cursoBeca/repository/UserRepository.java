package com.beca.cursoBeca.repository;

import com.beca.cursoBeca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
