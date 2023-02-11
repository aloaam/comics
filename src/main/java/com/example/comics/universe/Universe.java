package com.example.comics.universe;

import jakarta.persistence.*;

@Entity(name = "Universe")
@Table(name = "universe")
public class Universe {

    @Id
    private String universe_id;

    @Enumerated(EnumType.STRING)
    private UniverseName name;

    public Universe() {

    }

    public Universe(String universe_id, UniverseName name) {
        this.universe_id = universe_id;
        this.name = name;
    }
}
