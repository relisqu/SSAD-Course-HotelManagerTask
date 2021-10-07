package com.company.staff;

import com.company.Human;

/**
 * Represents Electrician staff member
 */
public class Electrician extends Staff{
    public Electrician(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
     * Performs the Electrician required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Electrician. I heard you have no electricity, so I brought you candle\n");
        System.out.println("Currently fixing " + message+" in room №"+ roomNumber);
        setAvailable(true);
    }
}
