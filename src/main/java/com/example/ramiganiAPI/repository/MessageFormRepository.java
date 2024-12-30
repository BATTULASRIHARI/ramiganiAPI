package com.example.ramiganiAPI.repository;

import com.example.ramiganiAPI.entity.MessageForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageFormRepository extends JpaRepository<MessageForm, Long> {
}