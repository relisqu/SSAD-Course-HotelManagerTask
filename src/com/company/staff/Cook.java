package com.company.staff;

import com.company.Human;

/**
 * Represents Cook staff member
 */
public class Cook extends Staff {
    public Cook(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
     * Performs the Cook required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Cook. I like cooking cockroaches");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
