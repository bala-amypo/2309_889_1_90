package com.example.domo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domo.model.DuplicateRule;
import com.example.domo.repository.DuplicateRuleRepository;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    @Autowired
    private DuplicateRuleRepository duplicateRuleRepository;

    @Override
    public DuplicateRule createRule(DuplicateRule rule) {
        rule.setCreatedAt(LocalDateTime.now());
        return duplicateRuleRepository.save(rule);
    }

    @Override
    public DuplicateRule updateRule(Long id, DuplicateRule rule) {
        DuplicateRule existingRule = duplicateRuleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DuplicateRule not found with id: " + id));

        existingRule.setRuleName(rule.getRuleName());
        existingRule.setKEYWORD(rule.getKEYWORD());
        existingRule.setSIMILARITY(rule.getSIMILARITY());
        existingRule.setEXACT_MATCH(rule.getEXACT_MATCH());
        existingRule.setThreshold(rule.getThreshold());

        return duplicateRuleRepository.save(existingRule);
    }

    @Override
    public void deleteRule(Long id) {
        duplicateRuleRepository.deleteById(id);
    }

    @Override
    public Optional<DuplicateRule> getRuleById(Long id) {
        return duplicateRuleRepository.findById(id);
    }

    @Override
    public List<DuplicateRule> getAllRules() {
        return duplicateRuleRepository.findAll();
    }
}
