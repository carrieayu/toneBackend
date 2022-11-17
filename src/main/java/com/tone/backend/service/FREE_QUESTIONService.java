package com.tone.backend.service;

import com.tone.backend.entity.FREE_QUESTION;
import com.tone.backend.repository.FREE_QUESTIONRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FREE_QUESTIONService {

    @Autowired
    private FREE_QUESTIONRepository repository;

    public FREE_QUESTION saveFree_question(FREE_QUESTION free_question){
        return repository.save(free_question);
    }

    public List<FREE_QUESTION> saveFree_questions(List<FREE_QUESTION> FREEQUESTIONS){
        return repository.saveAll(FREEQUESTIONS);
    }

    public List<FREE_QUESTION> getFree_questions(){
        return repository.findAll();
    }

    public FREE_QUESTION getFree_questionById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteFree_question(int id){
        repository.deleteById(id);
        return "Deleted Successfully";
    }
}
