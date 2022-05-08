package com.gabrieldenobrega.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldenobrega.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
