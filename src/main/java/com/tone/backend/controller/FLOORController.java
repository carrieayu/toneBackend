package com.tone.backend.controller;

import com.tone.backend.entity.FLOOR;
import com.tone.backend.service.FLOORService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FLOORController {

    @Autowired
    private FLOORService service;

    @PostMapping("/addFloor")
    public FLOOR addFloor(@RequestBody FLOOR floor){
        return service.saveFloor(floor);
    }

    @PostMapping("/addFloors")
    public List<FLOOR> addFloors(@RequestBody List<FLOOR> FLOORS){
        return service.saveFloors(FLOORS);
    }

    @GetMapping("/floors")
    public List<FLOOR> findAllFloors(){
        return service.getFloors();
    }

    @GetMapping("/floorById/{id}")
    public FLOOR findFloorById(@PathVariable int id){
        return service.getFloorById(id);
    }

    @DeleteMapping("/deleteFloor/{id}")
    public String deleteFloor(@PathVariable int id){
        return service.deleteFloor(id);
    }
}
