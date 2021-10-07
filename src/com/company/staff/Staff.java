package com.company.staff;

import com.company.Human;

/**
 * Represents staff member
 */
public class Staff {
    private StaffType type;
    private Human personalInformation;
    private boolean isAvailable;

    /**
     * Performs the work member required to do.
     */
    public void doJob(int roomNumber, String message) {
        System.out.println("I am doing my job in room " + roomNumber + " fixing " + message);
    }

    /**
     * Check whether this staff member is available
     * @return true if the member is available and false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Get staff member personal information
     * @return staff member personal information
     */
    public Human getPersonalInformation() {
        return personalInformation;
    }
}



