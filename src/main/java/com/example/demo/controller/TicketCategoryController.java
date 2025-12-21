package com.example.demo.controller;

import com.example.demo.model.TicketCategory;
import com.example.demo.service.TicketCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket-categories")
public class TicketCategoryController {

    private final TicketCategoryService ticketCategoryService;

    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    @PostMapping
    public TicketCategory create(@RequestBody TicketCategory category) {
        return ticketCategoryService.createCategory(category);
    }

    @GetMapping
    public List<TicketCategory> getAll() {
        return ticketCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public TicketCategory get(@PathVariable Long id) {
        return ticketCategoryService.getCategory(id);
    }
}
