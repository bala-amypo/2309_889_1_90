package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.DuplicateDetectionLog;
public interface DeliveryEvaluationRepository extends JpaRepository<DeliveryEvaluation,Long>{
    
}