package com.tone.backend.service;

import com.tone.backend.entity.QUESTIONNAIRE;
import com.tone.backend.repository.QUESTIONNAIRERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QUESTIONNAIREService {

    @Autowired
    private QUESTIONNAIRERepository repository;

    public QUESTIONNAIRE saveQuestionnaire(QUESTIONNAIRE questionnaire){
        return repository.save(questionnaire);
    }

    public List<QUESTIONNAIRE> saveQuestionnaires(List<QUESTIONNAIRE> QUESTIONNAIRES){
        return repository.saveAll(QUESTIONNAIRES);
    }

    public List<QUESTIONNAIRE> getQuestionnaire(){
        return repository.findAll();
    }

    public QUESTIONNAIRE getQuestionnaireById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteQuestionnaire(int id){
        repository.deleteById(id);
        return "Deleted Successfully";
    }
}
