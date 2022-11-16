package com.tone.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QUESTIONNAIRE")
public class Questionnaire {

    @Id
    @GeneratedValue
    private int ID_QUESTIONNAIRE;
    private Character DISPLAY_ID;
    private String NOTE;
    private String INIT_NOTE;
    private String FILE_NAME;
    private String EMAIL_ADDRESS;
    private int IS_INIT;
    private LocalDateTime DUE_DATETIME;
    private LocalDateTime SUBMIT_DATETIME;
}
