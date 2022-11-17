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
public class ELEMENT implements Serializable {

    @Id
    @GeneratedValue
    private int ID_ELEMENT;
//    @ManyToOne
//    @JoinColumn(name = "ID_FLOOR")
//    @Fetch(FetchMode.JOIN)
//    @Column(name = "ID_FLOOR", nullable = false)
    @ManyToOne
    @JoinColumn(name = "ID_FLOOR")
    private FLOOR ID_FLOOR;

    @Column(name = "ASSOCIATION_KEY", nullable = false)
    private int associationKey;

    @Column(name = "ZONE", nullable = false)
    private int zone;

    @Column(name = "ROOM_INDEX", nullable = false)
    private int roomIndex;

    @Column(name = "ROOM_NAME", nullable = false)
    private String roomName;

    @Column(name = "AREA_INDEX", nullable = false)
    private int areaIndex;

    @Column(name = "AREA_NAME", nullable = false)
    private String areaName;

    @Column(name = "SERIAL_CODE", nullable = false)
    private String serialCode;

    @Column(name = "INIT_SERIAL_CODE", nullable = false)
    private String initSerialCode;

    @Column(name = "ELEMENT_NAME", nullable = false)
    private String elementName;

    @Column(name = "INIT_ELEMENT_NAME", nullable = false)
    private String initElementName;

    @Column(name = "SALER", nullable = false)
    private String saler;

    @Column(name = "INIT_SALER", nullable = false)
    private String initSaler;

    @Column(name = "STATUS", nullable = false)
    private int status;

    @Column(name = "IS_ANSWERED", nullable = false)
    private int isAnswered;

    @Column(name = "OBJECTS_ON_DRAWINGS_JSON", nullable = false)
    private String objectsOnDrawingsJson;


}
