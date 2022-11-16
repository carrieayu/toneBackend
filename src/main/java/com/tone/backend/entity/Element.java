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
@Table (name = "ELEMENT")
public class Element implements Serializable {

    @Id
    @GeneratedValue
    private int ID_ELEMENT;
    @ManyToOne
    @JoinColumn(name = "ID_FLOOR", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Floor ID_FLOOR;
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


}
