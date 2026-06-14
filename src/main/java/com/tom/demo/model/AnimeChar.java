package com.tom.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anime_character")
public class AnimeChar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imagePath;

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}