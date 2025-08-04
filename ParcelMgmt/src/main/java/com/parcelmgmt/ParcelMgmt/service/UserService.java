package com.parcelmgmt.ParcelMgmt.service;

import com.parcelmgmt.ParcelMgmt.model.User;
import com.parcelmgmt.ParcelMgmt.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Create or Register User
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Get User By ID
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

    // Delete User By ID
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    // Find User By Email (for login/auth)
    public Optional<User> getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }
}

