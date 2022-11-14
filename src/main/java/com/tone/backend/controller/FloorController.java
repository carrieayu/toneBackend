package com.tone.backend.controller;

import com.tone.backend.entity.Floor;
import com.tone.backend.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FloorController {

    @Autowired
    private FloorService service;

    @PostMapping("/addFloor")
    public Floor addFloor(@RequestBody Floor floor){
        return service.saveFloor(floor);
    }

    @PostMapping("/addFloors")
    public List<Floor> addFloors(@RequestBody List<Floor> floors){
        return service.saveFloors(floors);
    }

    @GetMapping("/floors")
    public List<Floor> findAllFloors(){
        return service.getFloors();
    }

    @GetMapping("/floorById/{id}")
    public Floor findFloorById(@PathVariable int id){
        return service.getFloorById(id);
    }

    @DeleteMapping("/deleteFloor/{id}")
    public String deleteFloor(@PathVariable int id){
        return service.deleteFloor(id);
    }
}
