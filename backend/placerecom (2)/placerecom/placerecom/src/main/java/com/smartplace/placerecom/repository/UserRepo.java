package com.smartplace.placerecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartplace.placerecom.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
