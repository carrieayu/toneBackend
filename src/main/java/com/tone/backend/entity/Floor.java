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
@Table(name = "floor")
public class Floor {

    @Id
    @GeneratedValue
    private int id_floor;
    private int id_questionnaire;
    private String floor_name;
    private int floor_index;
}
