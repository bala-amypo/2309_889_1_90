package com.example.demo.controller;

import com.example.demo.model.DuplicateDetectionLog;
import com.example.demo.service.DuplicateDetectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duplicate-detection")
public class DuplicateDetectionController {

    private final DuplicateDetectionService duplicateDetectionService;

    public DuplicateDetectionController(DuplicateDetectionService duplicateDetectionService) {
        this.duplicateDetectionService = duplicateDetectionService;
    }

    @PostMapping("/{ticketId}")
    public List<DuplicateDetectionLog> detectDuplicates(@PathVariable Long ticketId) {
        return duplicateDetectionService.detectDuplicates(ticketId);
    }

    @GetMapping("/{ticketId}")
    public List<DuplicateDetectionLog> getLogs(@PathVariable Long ticketId) {
        return duplicateDetectionService.getLogsForTicket(ticketId);
    }
}
