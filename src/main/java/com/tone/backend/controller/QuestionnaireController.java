package com.tone.backend.controller;

import com.tone.backend.entity.Questionnaire;
import com.tone.backend.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionnaireController {

    @Autowired
    private QuestionnaireService service;

    @PostMapping("/addQuestionnaire")
    public Questionnaire addQuestionnaire(@RequestBody Questionnaire questionnaire){
        return service.saveQuestionnaire(questionnaire);
    }

    @PostMapping("/addQuestionnaires")
    public List<Questionnaire> addQuestionnaires(@RequestBody List<Questionnaire> questionnaires){
        return service.saveQuestionnaires(questionnaires);
    }

    @GetMapping("/questionnaire")
    public List<Questionnaire> findAllQuestionnaire(){
        return service.getQuestionnaire();
    }

    @GetMapping("/questionnaireById/{id}")
    public Questionnaire findQuestionnaireById(@PathVariable int id){
        return service.getQuestionnaireById(id);
    }

    @DeleteMapping("/deleteQuestionnaire/{id}")
    public String deleteQuestionnaire(@PathVariable int id){
        return service.deleteQuestionnaire(id);
    }
}
