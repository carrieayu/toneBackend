package com.tone.backend.controller;

import com.tone.backend.entity.ELEMENT;
import com.tone.backend.service.ELEMENTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 86400)
@RestController
public class ELEMENTController {

    @Autowired
    private ELEMENTService service;

    @PostMapping("/addElement")
    public ELEMENT addElement(@RequestBody ELEMENT element){
        return service.saveElement(element);
    }

    @PostMapping("/addElements")
    public List<ELEMENT> addElements(@RequestBody List<ELEMENT> ELEMENTS){
        return service.saveElements(ELEMENTS);
    }

    @GetMapping("/elements")
    public List<ELEMENT> findAllElements(){
        return service.getElements();
    }

    @GetMapping("/elementById/{id}")
    public ELEMENT findElementById(@PathVariable int id){
        return service.getElementById(id);
    }

    @GetMapping("/elementBySerial/{serialCode}")
    public ELEMENT findElementBySerialCode(@PathVariable String serialCode){
        return service.getElementBySerialCode(serialCode);
    }

    @DeleteMapping("/deleteElement/{id}")
    public String deleteElement(@PathVariable int id){
        return service.deleteElement(id);
    }

    @PutMapping("/updateElement/")
    public ELEMENT updateElement(@RequestBody ELEMENT element){
        return service.updateElementBySerial(element);
    }
}
