package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many tickets belong to one user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    // Many tickets belong to one category
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private TicketCategory category;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false, length = 2000)
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    // Logs where this ticket is the base ticket
    @OneToMany(mappedBy = "ticket", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<DuplicateDetectionLog> logsAsBase;

    // Logs where this ticket is the matched ticket
    @OneToMany(mappedBy = "matchedTicket", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<DuplicateDetectionLog> logsAsMatched;

    // Default constructor
    public Ticket() {
    }

    // Auto-set timestamp before insert
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.status = "OPEN";
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TicketCategory getCategory() {
        return category;
    }

    public void setCategory(TicketCategory category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<DuplicateDetectionLog> getLogsAsBase() {
        return logsAsBase;
    }

    public void setLogsAsBase(List<DuplicateDetectionLog> logsAsBase) {
        this.logsAsBase = logsAsBase;
    }

    public List<DuplicateDetectionLog> getLogsAsMatched() {
        return logsAsMatched;
    }

    public void setLogsAsMatched(List<DuplicateDetectionLog> logsAsMatched) {
        this.logsAsMatched = logsAsMatched;
    }
}
