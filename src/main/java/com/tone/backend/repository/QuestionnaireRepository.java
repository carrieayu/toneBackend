package com.tone.backend.repository;

import com.tone.backend.entity.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire,Integer> {
}
