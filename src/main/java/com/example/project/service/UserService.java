package com.example.project.service;

import com.example.project.entities.User;
import com.example.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) throws Exception {
        Optional<User> user = repository.findById(id);

        if (user.isPresent()) {
            return user.get();
        }
        throw new Exception("User not found!");
    }
}
