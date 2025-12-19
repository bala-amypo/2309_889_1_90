package com.example.domo.model;

public class DuplicateDetectionLog{
    @Id
    private Long id;
    private Double matchScore;
    private LocalDateTime detectedAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }
    public DuplicateDetectionLog(Long id, Double matchScore, LocalDateTime detectedAt) {
        this.id = id;
        this.matchScore = matchScore;
        this.detectedAt = detectedAt;
    }
    public DuplicateDetectionLog() {
    }
    
}