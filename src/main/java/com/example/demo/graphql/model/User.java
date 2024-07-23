package com.example.demo.graphql.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    // Getters and Setters
    private int id;
    private String name;
    private String email;

    // Constructors
    public User() {}

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
