package com.tone.backend.controller;

import com.tone.backend.entity.Element;
import com.tone.backend.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElementController {

    @Autowired
    private ElementService service;

    @PostMapping("/addElement")
    public Element addElement(@RequestBody Element element){
        return service.saveElement(element);
    }

    @PostMapping("/addElements")
    public List<Element> addElements(@RequestBody List<Element> elements){
        return service.saveElements(elements);
    }

    @GetMapping("/elements")
    public List<Element> findAllElements(){
        return service.getElements();
    }

    @GetMapping("/elementById/{id}")
    public Element findElementById(@PathVariable int id){
        return service.getElementById(id);
    }

    @DeleteMapping("/deleteElement/{id}")
    public String deleteElement(@PathVariable int id){
        return service.deleteElement(id);
    }
}
