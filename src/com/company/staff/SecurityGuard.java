package com.company.staff;

import com.company.Human;

/**
 * Represents Security Guard staff member
 */
public class SecurityGuard extends Staff {
    public SecurityGuard(Human personalInformation, StaffType type) {
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
