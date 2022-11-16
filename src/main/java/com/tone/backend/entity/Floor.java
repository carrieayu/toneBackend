package com.tone.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FLOOR")
public class Floor {

    @Id
    @GeneratedValue
    private int ID_FLOOR;
    private int ID_QUESTIONNAIRE;
    private String FLOOR_NAME;
    private int FLOOR_INDEX;
}
