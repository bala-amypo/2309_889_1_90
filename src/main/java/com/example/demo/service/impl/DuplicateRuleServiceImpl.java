package com.example.demo.service.impl;

import com.example.demo.model.DuplicateRule;
import com.example.demo.repository.DuplicateRuleRepository;
import com.example.demo.service.DuplicateRuleService;
import com.example.demo.exception.NotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    private final DuplicateRuleRepository ruleRepository;

    public DuplicateRuleServiceImpl(
            DuplicateRuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    @Override
    public DuplicateRule createRule(DuplicateRule rule) {

        if (ruleRepository.findByRuleName(rule.getRuleName()).isPresent()) {
            throw new RuntimeException("Rule already exists");
        }

        if (rule.getThreshold() == null) {
            rule.setThreshold(1.0);
        }

        if (rule.getMatchType() == null) {
            rule.setMatchType("EXACT_MATCH");
        }

        return ruleRepository.save(rule);
    }

    @Override
    public DuplicateRule getRule(Long id) {
        return ruleRepository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException("Rule not found"));
    }

    @Override
    public List<DuplicateRule> getAllRules() {
        return ruleRepository.findAll();
    }
}