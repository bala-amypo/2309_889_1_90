package com.example.domo.model;

public class Ticket{
    @Id
     private Long id;
     private String subject;
     private String description;
     private String OPEN;
     private String IN_PROGRESS;
     private String RESOLVED;
     private String CLOSED;
     private LocalDateTime createdAt;
     

}