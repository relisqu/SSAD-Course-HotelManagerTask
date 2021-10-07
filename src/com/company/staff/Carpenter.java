package com.company.staff;

/**
 * Represents Carpenter staff member
 */
public class Carpenter extends Staff{
    /**
     * Performs the Carpenter required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Carpenter. I will open bathroom door if you got stuck in it\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
