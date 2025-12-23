package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "duplicate_detection_logs")
public class DuplicateDetectionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rule_id")
    private DuplicateRule rule;

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

    public DuplicateRule getRule() {
        return rule;
    }

    public void setRule(DuplicateRule rule) {
        this.rule = rule;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }

    // 🔴 REQUIRED FIX
    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }
}
