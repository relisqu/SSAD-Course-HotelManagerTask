package com.company.staff;

import com.company.Human;

/**
 * Represents Carpenter staff member
 */
public class Carpenter extends Staff{
    public Carpenter(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
     * Performs the Carpenter required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Carpenter. I will open bathroom door if you got stuck in it\n");
        System.out.println("Currently fixing " + message+" in room №"+ roomNumber);
        setAvailable(true);
    }
}
