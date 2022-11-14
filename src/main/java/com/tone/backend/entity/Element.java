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
@Table (name = "element")
public class Element {

    @Id
    @GeneratedValue
    private int id_element;
    private int id_floor;
    private int association_key;
    private int zone;
    private int room_index;
    private String room_name;
    private int area_index;
    private String area_name;
    private String serial_code;
    private String init_serial_code;
    private String element_name;
    private String init_element_name;
    private String saler;
    private String init_saler;
    private int status;
    private int is_answered;
    private String object_on_drawings_json;


}
