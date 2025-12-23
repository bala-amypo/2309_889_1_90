package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "duplicate_detection_logs")
public class DuplicateDetectionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ticket being checked
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    // Ticket that matched
    @ManyToOne
    @JoinColumn(name = "matched_ticket_id")
    private Ticket matchedTicket;

    // Rule used for detection
    @ManyToOne
    @JoinColumn(name = "rule_id")
    private DuplicateRule rule;

    @Column(name = "match_score")
    private double matchScore;

    @Column(name = "detected_at")
    private LocalDateTime detectedAt;

    public DuplicateDetectionLog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    // ✅ REQUIRED
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getMatchedTicket() {
        return matchedTicket;
    }

    // ✅ REQUIRED
    public void setMatchedTicket(Ticket matchedTicket) {
        this.matchedTicket = matchedTicket;
    }

    public DuplicateRule getRule() {
        return rule;
    }

    public void setRule(DuplicateRule rule) {
        this.rule = rule;
    }

    public double getMatchScore() {
        return matchScore;
    }

    // ✅ REQUIRED
    public void setMatchScore(double matchScore) {
        this.matchScore = matchScore;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }

    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }
}
