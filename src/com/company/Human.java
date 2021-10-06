package com.company;

public class Human {
    private int id;
    private String surname;
    private String name;

    public Human(int id, String surname, String name) {
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

    public int getId() {
        return id;
    }
}
