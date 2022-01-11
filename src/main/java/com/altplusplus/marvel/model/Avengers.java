package com.altplusplus.marvel.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AVENGERS")
public class Avengers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String avengerName;
    private String code;
    private int age;

}
