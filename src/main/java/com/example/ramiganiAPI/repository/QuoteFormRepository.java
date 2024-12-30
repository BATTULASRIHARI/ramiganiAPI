package com.example.ramiganiAPI.repository;

import com.example.ramiganiAPI.entity.QuoteForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteFormRepository extends JpaRepository<QuoteForm, Long> {
}