package com.company.staff;

import com.company.Human;

/**
 * Represents Cook staff member
 */
public class Cook extends Staff {
    public Cook(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    @Override
    void comeToRoom(int roomNumber) {


    }

    @Override
    void communicateWithClient() {

    }

    @Override
    boolean tryProvideService() {
        return false;
    }

    @Override
    void manageProvideServiceError() {

    }

    @Override
    void requestPayment() {

    }
}
