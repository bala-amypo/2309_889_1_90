package com.example.demo.controller;

import com.example.demo.model.DuplicateRule;
import com.example.demo.service.DuplicateRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duplicate-rules")
public class DuplicateRuleController {

    private final DuplicateRuleService duplicateRuleService;

    public DuplicateRuleController(DuplicateRuleService duplicateRuleService) {
        this.duplicateRuleService = duplicateRuleService;
    }

    @PostMapping
    public DuplicateRule createRule(@RequestBody DuplicateRule rule) {
        return duplicateRuleService.createRule(rule);
    }

    @GetMapping
    public List<DuplicateRule> getAllRules() {
        return duplicateRuleService.getAllRules();
    }

    @GetMapping("/{id}")
    public DuplicateRule getRule(@PathVariable Long id) {
        return duplicateRuleService.getRule(id);
    }
}
