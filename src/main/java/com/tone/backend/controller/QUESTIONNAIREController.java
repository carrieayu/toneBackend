package com.tone.backend.controller;

import com.tone.backend.entity.QUESTIONNAIRE;
import com.tone.backend.service.QUESTIONNAIREService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QUESTIONNAIREController {

    @Autowired
    private QUESTIONNAIREService service;

    @PostMapping("/addQuestionnaire")
    public QUESTIONNAIRE addQuestionnaire(@RequestBody QUESTIONNAIRE questionnaire){
        return service.saveQuestionnaire(questionnaire);
    }

    @PostMapping("/addQuestionnaires")
    public List<QUESTIONNAIRE> addQuestionnaires(@RequestBody List<QUESTIONNAIRE> QUESTIONNAIRES){
        return service.saveQuestionnaires(QUESTIONNAIRES);
    }

    @GetMapping("/questionnaire")
    public List<QUESTIONNAIRE> findAllQuestionnaire(){
        return service.getQuestionnaire();
    }

    @GetMapping("/questionnaireById/{id}")
    public QUESTIONNAIRE findQuestionnaireById(@PathVariable int id){
        return service.getQuestionnaireById(id);
    }

    @DeleteMapping("/deleteQuestionnaire/{id}")
    public String deleteQuestionnaire(@PathVariable int id){
        return service.deleteQuestionnaire(id);
    }
}
