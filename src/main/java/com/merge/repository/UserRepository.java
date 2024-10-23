package com.merge.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.merge.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
