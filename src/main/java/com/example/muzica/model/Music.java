package com.example.muzica.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "musics")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "singer")
    private String singer;
}
