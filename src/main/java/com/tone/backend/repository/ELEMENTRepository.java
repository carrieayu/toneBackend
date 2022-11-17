package com.tone.backend.repository;

import com.tone.backend.entity.ELEMENT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ELEMENTRepository extends JpaRepository<ELEMENT, Integer> {
    ELEMENT findBySerialCode(String serialCode);
}
