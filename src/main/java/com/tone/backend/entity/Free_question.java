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
@Table(name = "FREE_QUESTION")
public class Free_question {

    @Id
    @GeneratedValue
    private int ID_FREE_QUESTION;
    private int ID_FLOOR;
    private int ASSOCIATION_KEY;
    private int QUESTION_INDEX;
    private Character QUESTION;
    private String ANSWER;
    private String INIT_ANSWER;
    private int IS_ANSWERED;
    private String ITEM_ON_DRAWINGS_JSON;
}
