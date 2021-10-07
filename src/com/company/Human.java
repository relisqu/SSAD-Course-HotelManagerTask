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
     * @param id      unique ID
     * @param surname person last name
     * @param name    person first name
     */
    // TODO: remove id from constructor, it should be created **inside** constructor
    // https://www.baeldung.com/java-uuid
    public Human(UUID id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    /**
     * Get person first name
     * @return first name
     */
    public String getName() {
        return name;
    }

    /**
     * Get person second name
     * @return second name
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Get person unique id
     * @return UUID
     */
    public UUID getId() {
        return id;
    }
}
