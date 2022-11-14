package com.tone.backend.service;

import com.tone.backend.entity.Free_question;
import com.tone.backend.repository.Free_questionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Free_questionService {

    @Autowired
    private Free_questionRepository repository;

    public Free_question saveFree_question(Free_question free_question){
        return repository.save(free_question);
    }

    public List<Free_question> saveFree_questions(List<Free_question> free_questions){
        return repository.saveAll(free_questions);
    }

    public List<Free_question> getFree_questions(){
        return repository.findAll();
    }

    public Free_question getFree_questionById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteFree_question(int id){
        repository.deleteById(id);
        return "Deleted Successfully";
    }
}
