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
        System.out.println("I am Cook and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("Do you want salad with cockroaches and warms?");
    }

    @Override
    boolean tryProvideService() {
        int rand = (Math.random())%2;
        return rand == 1;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Okay( Maybe you want Caesar salad(also with warms)?");
    }

    @Override
    void requestPayment() {
        System.out.println("No need to pay. Just come to stolovka");
    }
}
