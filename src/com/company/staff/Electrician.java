package com.company.staff;

import com.company.Human;

/**
 * Represents Electrician staff member
 */
public class Electrician extends Staff {
    public Electrician(Human personalInformation, StaffType type) {
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
