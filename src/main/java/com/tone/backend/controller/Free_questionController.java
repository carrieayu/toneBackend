package com.tone.backend.controller;

import com.tone.backend.entity.Free_question;
import com.tone.backend.service.Free_questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Free_questionController {

    @Autowired
    private Free_questionService service;

    @PostMapping("/addFree_question")
    public Free_question addFree_question(@RequestBody Free_question free_question){
        return service.saveFree_question(free_question);
    }

    @PostMapping("/addFree_questions")
    public List<Free_question> addFree_questions(@RequestBody List<Free_question> free_questions){
        return service.saveFree_questions(free_questions);
    }

    @GetMapping("/free_questions")
    public List<Free_question> Free_question(){
        return service.getFree_questions();
    }

    @GetMapping("/free_questionById/{id}")
    public Free_question findFree_questionById(@PathVariable int id){
        return service.getFree_questionById(id);
    }

    @DeleteMapping("/deleteFree_question/{id}")
    public String deleteFree_question(@PathVariable int id){
        return service.deleteFree_question(id);
    }

}
