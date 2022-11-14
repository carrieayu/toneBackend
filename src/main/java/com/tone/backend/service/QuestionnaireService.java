package com.tone.backend.service;

import com.tone.backend.entity.Questionnaire;
import com.tone.backend.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireService {

    @Autowired
    private QuestionnaireRepository repository;

    public Questionnaire saveQuestionnaire(Questionnaire questionnaire){
        return repository.save(questionnaire);
    }

    public List<Questionnaire> saveQuestionnaires(List<Questionnaire> questionnaires){
        return repository.saveAll(questionnaires);
    }

    public List<Questionnaire> getQuestionnaire(){
        return repository.findAll();
    }

    public Questionnaire getQuestionnaireById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteQuestionnaire(int id){
        repository.deleteById(id);
        return "Deleted Successfully";
    }
}
