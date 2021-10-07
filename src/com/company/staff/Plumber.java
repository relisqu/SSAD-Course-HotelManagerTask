package com.company.staff;

/**
 * Represents Plumber staff member
 */
public class Plumber extends Staff{
    /**
     * Performs the Plumber required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Plumber. I came to clean your pipes\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
