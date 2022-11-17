package com.tone.backend.controller;

import com.tone.backend.entity.FREE_QUESTION;
import com.tone.backend.service.FREE_QUESTIONService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FREE_QUESTIONController {

    @Autowired
    private FREE_QUESTIONService service;

    @PostMapping("/addFree_question")
    public FREE_QUESTION addFree_question(@RequestBody FREE_QUESTION free_question){
        return service.saveFree_question(free_question);
    }

    @PostMapping("/addFree_questions")
    public List<FREE_QUESTION> addFree_questions(@RequestBody List<FREE_QUESTION> FREEQUESTIONS){
        return service.saveFree_questions(FREEQUESTIONS);
    }

    @GetMapping("/free_questions")
    public List<FREE_QUESTION> Free_question(){
        return service.getFree_questions();
    }

    @GetMapping("/free_questionById/{id}")
    public FREE_QUESTION findFree_questionById(@PathVariable int id){
        return service.getFree_questionById(id);
    }

    @DeleteMapping("/deleteFree_question/{id}")
    public String deleteFree_question(@PathVariable int id){
        return service.deleteFree_question(id);
    }

}
