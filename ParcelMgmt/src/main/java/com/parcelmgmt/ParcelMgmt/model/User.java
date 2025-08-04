package com.parcelmgmt.ParcelMgmt.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")  // Avoids conflict with SQL keyword "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String role;
    private String name;
    private String email;
    private Long phNo;
    private String address;
    private String password;
    private String preference;

    public User(Long userId, String role, String name, String email, Long phNo, String address, String password, String preference) {
        this.userId = userId;
        this.role = role;
        this.name = name;
        this.email = email;
        this.phNo = phNo;
        this.address = address;
        this.password = password;
        this.preference = preference;
    }
    public User(){

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhNo() {
        return phNo;
    }

    public void setPhNo(Long phNo) {
        this.phNo = phNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
