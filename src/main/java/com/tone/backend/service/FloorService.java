package com.tone.backend.service;

import com.tone.backend.entity.Floor;
import com.tone.backend.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorService {

    @Autowired
    private FloorRepository repository;

    public Floor saveFloor(Floor floor){
        return repository.save(floor);
    }

    public List<Floor> saveFloors(List<Floor> floors){
        return repository.saveAll(floors);
    }

    public List<Floor> getFloors(){
        return repository.findAll();
    }

    public Floor getFloorById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteFloor(int id){
        repository.deleteById(id);
        return "Deleted successfully";
    }
}
