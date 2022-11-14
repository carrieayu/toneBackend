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
@Table(name = "questionnaire")
public class Questionnaire {

    @Id
    @GeneratedValue
    private int id_questionnaire;
    private Character display;
    private String note;
    private String init_note;
    private String file_name;
    private String email_address;
    private int is_init;
    private LocalDateTime due_datetime;
    private LocalDateTime submit_datetime;
}
