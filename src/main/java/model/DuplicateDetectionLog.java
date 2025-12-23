package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "duplicate_detection_logs")
public class DuplicateDetectionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Base ticket being checked
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ticket_id", nullable = false)
    @JsonIgnore
    private Ticket ticket;

    // Matched ticket found as duplicate
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "matched_ticket_id", nullable = false)
    @JsonIgnore
    private Ticket matchedTicket;

    @Column(nullable = false)
    private Double matchScore;

    @Column(nullable = false, updatable = false)
    private LocalDateTime detectedAt;

    // Default constructor
    public DuplicateDetectionLog() {
    }

    // Parameterized constructor
    public DuplicateDetectionLog(Ticket ticket, Ticket matchedTicket, Double matchScore) {
        this.ticket = ticket;
        this.matchedTicket = matchedTicket;
        this.matchScore = matchScore;
    }

    // Auto-set detection timestamp
    @PrePersist
    protected void onDetect() {
        this.detectedAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getMatchedTicket() {
        return matchedTicket;
    }

    public void setMatchedTicket(Ticket matchedTicket) {
        this.matchedTicket = matchedTicket;
    }

    public Double getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(Double matchScore) {
        this.matchScore = matchScore;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }
}
