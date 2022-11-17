package com.tone.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FREE_QUESTION")
public class FREE_QUESTION {

    @Id
    @GeneratedValue
    private int ID_FREE_QUESTION;
    @ManyToOne
    @JoinColumn(name = "ID_FLOOR")
    @Fetch(FetchMode.JOIN)
    private FLOOR ID_FLOOR;
    private int ASSOCIATION_KEY;
    private int QUESTION_INDEX;
    private Character QUESTION;
    private String ANSWER;
    private String INIT_ANSWER;
    private int IS_ANSWERED;
    private String ITEM_ON_DRAWINGS_JSON;
}
