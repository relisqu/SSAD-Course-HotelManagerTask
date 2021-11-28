package com.company.staff;

import com.company.Human;

/**
 * Represents Plumber staff member
 */
public class Plumber extends Staff {
    public Plumber(Human personalInformation, StaffType type) {
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
