package com.company.staff;

import com.company.Human;

/**
 * Represents staff member
 */
public class Staff {
    private StaffType type;
    private Human personalInformation;
    private boolean isAvailable;

    public Staff(Human personalInformation, StaffType type) {
        this.personalInformation = personalInformation;
        this.type = type;
    }

    /**
     * Performs the work member required to do.
     */
    public void doJob(int roomNumber, String message) {

        System.out.println("I am doing my job\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }

    /**
     * Check whether this staff member is available
     *
     * @return true if the member is available and false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    /**
     * Get staff member personal information
     *
     * @return staff member personal information
     */
    public Human getPersonalInformation() {
        return personalInformation;
    }
}



