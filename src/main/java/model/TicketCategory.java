package com.example.domo.model;

public class TicketCategory{
    @Id
    private Long id;
    private String categoryName;
    private String description;
    private LocalDateTime createdAt;
}