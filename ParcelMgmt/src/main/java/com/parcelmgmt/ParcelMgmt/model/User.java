package com.parcelmgmt.ParcelMgmt.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")  // Avoids conflict with SQL keyword "user"
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
