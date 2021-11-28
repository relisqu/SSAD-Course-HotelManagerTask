package com.company.staff;

import com.company.Human;

/**
 * Represents Security Guard staff member
 */
public class SecurityGuard extends Staff {
    public SecurityGuard(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void comeToRoom(int roomNumber) {
        System.out.println("I am SecurityGuard and I came to room "+roomNumber);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void communicateWithClient() {
        System.out.println("Hey man, what kind of protection would you need?");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    boolean tryProvideService() {
        double isAbleToProvideService = (Math.random()+1)%100;
        System.out.println("Good afternoon, let me bodyguard you.");
        if(isAbleToProvideService < 50){
            System.out.println("Oh, you wanted psychological security? Sorry...");
            return false;
        }
        return true;
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void manageProvideServiceError() {
        System.out.println("Let me assign you to my friend, great psychologist");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void requestPayment() {
        System.out.println("Gimme 7k, I will protect you from firemen");
    }


}
