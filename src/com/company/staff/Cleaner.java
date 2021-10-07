package com.company.staff;

/**
 * Represents Cleaner staff member
 */
public class Cleaner extends Staff{
    /**
     * Performs the Cleaner required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Cleaner. I will come every 7-10 days. Or not\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
