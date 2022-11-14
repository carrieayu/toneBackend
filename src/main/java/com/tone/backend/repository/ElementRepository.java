package com.tone.backend.repository;

import com.tone.backend.entity.Element;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository<Element, Integer> {
}
