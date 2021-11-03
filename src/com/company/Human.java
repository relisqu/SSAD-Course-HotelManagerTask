package com.company;

import java.util.UUID;

/**
 * Class representing a human.
 * Either a client or staff member.
 */
public class Human {
    private UUID id;
    private String surname;
    private String name;

    /**
     * Parametrized constructor allowing to specify human personal data
     *
     * @param surname person last name
     * @param name    person first name
     */
    public Human(String surname, String name) {
        this.id = UUID.randomUUID();
        this.surname = surname;
        this.name = name;
    }

    /**
     * Get person first name
     *
     * @return first name
     */
    public String getName() {
        return name;
    }

    /**
     * Get person second name
     *
     * @return second name
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Get person unique id
     *
     * @return UUID
     */
    public UUID getId() {
        return id;
    }
}
