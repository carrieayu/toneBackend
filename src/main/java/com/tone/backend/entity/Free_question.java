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
@Table(name = "free_question")
public class Free_question {

    @Id
    @GeneratedValue
    private int id_free_question;
    private int id_floor;
    private int associate_key;
    private Character question;
    private String answer;
    private String init_answer;
    private int is_answered;
    private String item_on_drawings_json;
}
