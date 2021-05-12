package com.codergk.user.repository;

import com.codergk.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    User findUserById(Long id);
}
