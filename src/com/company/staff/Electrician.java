package com.company.staff;

/**
 * Represents Electrician staff member
 */
public class Electrician extends Staff{
    /**
     * Performs the Electrician required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Electrician. I heard you have no electricity, so I brought you candle\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
