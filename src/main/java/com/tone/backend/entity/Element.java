package com.tone.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
<<<<<<< Updated upstream
@Table (name = "element")
public class Element implements Serializable {

    @Id
    @GeneratedValue
    private int id_element;
    @ManyToOne
    @JoinColumn(name = "id_floor", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Floor id_floor;
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
=======
@Table (name = "ELEMENT")
public class Element {

    @Id
    @GeneratedValue
    private int ID_ELEMENT;
    private int ID_FLOOR;
    private int ASSOCIATION_KEY;
    private int ZONE;
    private int ROOM_INDEX;
    private String ROOM_NAME;
    private int AREA_INDEX;
    private String AREA_NAME;
    private String SERIAL_CODE;
    private String INIT_SERIAL_CODE;
    private String ELEMENT_NAME;
    private String INIT_ELEMENT_NAME;
    private String SALER;
    private String INIT_SALER;
    private int STATUS;
    private int IS_ANSWERED;
    private String OBJECTS_ON_DRAWINGS_JSON;
>>>>>>> Stashed changes


}
