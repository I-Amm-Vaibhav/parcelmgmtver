package com.parcelmgmt.ParcelMgmt.repo;

import com.parcelmgmt.ParcelMgmt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);  // Useful for login later
}

