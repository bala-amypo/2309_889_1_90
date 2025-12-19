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
}