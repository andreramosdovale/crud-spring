package com.example.CRUD.spring.repositories;

import com.example.CRUD.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
