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
        System.out.println("I am Cleaner and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("I entered without knocking, but hope you are dressed up");
    }

    @Override
    boolean tryProvideService() {
        int rand = (Math.random())%2;
        return rand == 1;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("If you don't like our service, you can wrote about it to Mr. Seednight");
    }

    @Override
    void requestPayment() {
        System.out.println("145 rubles per square meter");
    }
}
