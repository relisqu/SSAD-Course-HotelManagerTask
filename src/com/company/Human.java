package com.company;

import java.util.UUID;

public class Human {
    private UUID id;
    private String surname;
    private String name;

    public Human(UUID id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public UUID getId() {
        return id;
    }
}
