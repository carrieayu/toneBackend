package com.tone.backend.service;

import com.tone.backend.entity.Element;
import com.tone.backend.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementService {
    @Autowired
    private ElementRepository repository;

    public Element saveElement(Element element) {
        return repository.save(element);
    }

    public List<Element> saveElements(List<Element> elements){
        return repository.saveAll(elements);
    }

    public List<Element> getElements(){
        return repository.findAll();
    }

    public Element getElementById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteElement(int id){
        repository.deleteById(id);
        return "Deleted Successfully " + id;
    }

}
