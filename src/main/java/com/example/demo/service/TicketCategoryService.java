package com.example.domo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domo.model.TicketCategory;
import com.example.domo.repository.TicketCategoryRepository;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    @Override
    public TicketCategory createCategory(TicketCategory category) {
        category.setCreatedAt(LocalDateTime.now());
        return ticketCategoryRepository.save(category);
    }

    @Override
    public TicketCategory updateCategory(Long id, TicketCategory category) {
        TicketCategory existingCategory = ticketCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));

        existingCategory.setCategoryName(category.getCategoryName());
        existingCategory.setDescription(category.getDescription());

        return ticketCategoryRepository.save(existingCategory);
    }

    @Override
    public void deleteCategory(Long id) {
        ticketCategoryRepository.deleteById(id);
    }

    @Override
    public Optional<TicketCategory> getCategoryById(Long id) {
        return ticketCategoryRepository.findById(id);
    }

    @Override
    public List<TicketCategory> getAllCategories() {
        return ticketCategoryRepository.findAll();
    }
}
