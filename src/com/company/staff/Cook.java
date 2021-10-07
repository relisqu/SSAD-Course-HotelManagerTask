package com.company.staff;

/**
 * Represents Cook staff member
 */
public class Cook extends Staff {
    /**
     * Performs the Cook required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Cook. I like cooking cockroaches\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
