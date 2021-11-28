package com.company.staff;

import com.company.Human;

/**
 * Represents staff member
 */
public abstract class Staff {
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
    public final void doJob(int roomNumber) {
        comeToRoom(roomNumber);
        communicateWithClient();
        if (!tryProvideService()) {
            manageProvideServiceError();
        }
        requestPayment();
    }


    abstract protected void comeToRoom(int roomNumber);

    abstract protected void communicateWithClient();

    abstract protected boolean tryProvideService();

    abstract protected void manageProvideServiceError();

    abstract protected void requestPayment();

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



