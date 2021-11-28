package com.company.staff;

import com.company.Human;

/**
 * Represents Cleaner staff member
 */
public class Cleaner extends Staff {
    public Cleaner(Human personalInformation, StaffType type) {
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
