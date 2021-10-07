package com.company.staff;

import com.company.Human;

/**
 * Represents Plumber staff member
 */
public class Plumber extends Staff{
    public Plumber(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
     * Performs the Plumber required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Plumber. I came to clean your pipes\n");
        System.out.println("Currently fixing " + message+" in room №"+ roomNumber);
        setAvailable(true);
    }
}
