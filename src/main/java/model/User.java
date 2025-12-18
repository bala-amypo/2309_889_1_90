package com.example.domo.model;


public class User{
    private Long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    private String password;
    private String ADMIN; 
    private String USER;
    private LocalDateTime createdAt;
}