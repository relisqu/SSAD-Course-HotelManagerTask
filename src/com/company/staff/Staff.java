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

    /**
    * Work algorithm step: arrival to the
    * room where maintenance is needed.
    *
    * @param roomNumber - room to visit
    */
    abstract protected void comeToRoom(int roomNumber);

    /**
    * Work algorithm step: communication
    * with the client to determine the
    * problems occured.
    */
    abstract protected void communicateWithClient();

    /**
    * Work algorithm step: try to resolve
    * the issue the client specified.
    */
    abstract protected boolean tryProvideService();

    /**
    * Work algorithm step: sometimes it is 
    * impossible to fix the issue. (e.g. 
    * insufficient supply or time limit)
    * That is why it is necessary to manage
    * the errors.
    */
    abstract protected void manageProvideServiceError();

    /**
    * Work algorithm step: a worker needs
    * the payment, it may be implemented 
    * either way (hourly/per order/etc)
    */
    abstract protected void requestPayment();

    /**
     * Check whether this staff member is available
     *
     * @return true if the member is available and false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
    * Avaiability setter for a staff member
    *
    * @param avaiable set the staff member avaiability with provided value
    */
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



