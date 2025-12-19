package com.example.domo.model;

public class DuplicateRule{
    @Id
    private Long id;
    private String ruleName;
    private String KEYWORD;
    private String SIMILARITY;
    private String EXACT_MATCH;
    private Double threshold;
    private LocalDateTime createdAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRuleName() {
        return ruleName;
    }
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    public String getKEYWORD() {
        return KEYWORD;
    }
    public void setKEYWORD(String kEYWORD) {
        KEYWORD = kEYWORD;
    }
    public String getSIMILARITY() {
        return SIMILARITY;
    }
    public void setSIMILARITY(String sIMILARITY) {
        SIMILARITY = sIMILARITY;
    }
    public String getEXACT_MATCH() {
        return EXACT_MATCH;
    }
    public void setEXACT_MATCH(String eXACT_MATCH) {
        EXACT_MATCH = eXACT_MATCH;
    }
    public Double getThreshold() {
        return threshold;
    }
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public DuplicateRule(Long id, String ruleName, String kEYWORD, String sIMILARITY, String eXACT_MATCH,
            Double threshold, LocalDateTime createdAt) {
        this.id = id;
        this.ruleName = ruleName;
        KEYWORD = kEYWORD;
        SIMILARITY = sIMILARITY;
        EXACT_MATCH = eXACT_MATCH;
        this.threshold = threshold;
        this.createdAt = createdAt;
    }
    public DuplicateRule() {
    }
    
}