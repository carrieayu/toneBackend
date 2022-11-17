package com.tone.backend.service;

import com.tone.backend.entity.FLOOR;
import com.tone.backend.repository.FLOORRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FLOORService {

    @Autowired
    private FLOORRepository repository;

    public FLOOR saveFloor(FLOOR floor){
        return repository.save(floor);
    }

    public List<FLOOR> saveFloors(List<FLOOR> FLOORS){
        return repository.saveAll(FLOORS);
    }

    public List<FLOOR> getFloors(){
        return repository.findAll();
    }

    public FLOOR getFloorById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteFloor(int id){
        repository.deleteById(id);
        return "Deleted successfully";
    }
}
