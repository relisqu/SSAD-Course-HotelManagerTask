package com.company.staff;

import com.company.Human;

/**
 * Represents Deliveryman staff member
 */
public class Deliveryman extends Staff {
    public Deliveryman(Human personalInformation, StaffType type) {
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
