package com.company.staff;

import com.company.Human;

/**
 * Represents Security Guard staff member
 */
public class SecurityGuard extends Staff{
    public SecurityGuard(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
     * Performs the Security Guard required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Security. Hey, where is your mask?!");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
