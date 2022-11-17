package com.tone.backend.service;

import com.tone.backend.entity.ELEMENT;
import com.tone.backend.repository.ELEMENTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ELEMENTService {
    @Autowired
    private ELEMENTRepository repository;

    public ELEMENT saveElement(ELEMENT element) {
        return repository.save(element);
    }

    public List<ELEMENT> saveElements(List<ELEMENT> ELEMENTS){
        return repository.saveAll(ELEMENTS);
    }

    public List<ELEMENT> getElements(){
        return repository.findAll();
    }

    public ELEMENT getElementById(int id){
        return repository.findById(id).orElse(null);
    }

    public ELEMENT getElementBySerialCode(String serialCode){
        return repository.findBySerialCode(serialCode);
    }

    public String deleteElement(int id){
        repository.deleteById(id);
        return "Deleted Successfully " + id;
    }

    public ELEMENT updateElementBySerial(ELEMENT element){
        ELEMENT existingElement = repository.findBySerialCode(element.getSerialCode());
        existingElement.setElementName(element.getElementName());
        existingElement.setInitSaler(element.getInitSaler());
        existingElement.setSaler(element.getSaler());
        existingElement.setStatus(element.getStatus());
        existingElement.setAssociationKey(element.getAssociationKey());
        existingElement.setSerialCode(element.getSerialCode());
        existingElement.setInitSerialCode(element.getInitSerialCode());

        return repository.save(existingElement);
    }

    public ELEMENT updateElement(ELEMENT element){
        ELEMENT existingElement = repository.findById(element.getID_ELEMENT()).orElse(null);
        existingElement.setElementName(element.getElementName());
        existingElement.setInitElementName(element.getInitElementName());
        existingElement.setAreaIndex(element.getAreaIndex());
        existingElement.setAreaName(element.getAreaName());
        existingElement.setID_FLOOR(element.getID_FLOOR());
        existingElement.setInitSaler(element.getInitSaler());
        existingElement.setIsAnswered(element.getIsAnswered());
        existingElement.setZone(element.getZone());
        existingElement.setSaler(element.getSaler());
        existingElement.setStatus(element.getStatus());
        existingElement.setAssociationKey(element.getAssociationKey());
        existingElement.setRoomName(element.getRoomName());
        existingElement.setRoomIndex(element.getRoomIndex());
        existingElement.setSerialCode(element.getSerialCode());
        existingElement.setInitSerialCode(element.getInitSerialCode());
        existingElement.setObjectsOnDrawingsJson(element.getObjectsOnDrawingsJson());

        return repository.save(existingElement);
    }

}
