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
        System.out.println("I am Electrician and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("Again problems with lights in bathroom?!");
    }

    @Override
    boolean tryProvideService() {
        int rand = (Math.random())%2;
        return rand == 1;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Sorry, I don't wanted to break up rest of lights...");
    }

    @Override
    void requestPayment() {
        System.out.println("No need to pay me. It's better to pay attention to the nature!");
    }
}
