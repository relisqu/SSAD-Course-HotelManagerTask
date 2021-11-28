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
        System.out.println("I am SecurityGuard and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("Hey man, what protection do you need?");
    }

    @Override
    boolean tryProvideService() {
        int isAbleToProvideService = (Math.random()+1)%100;
        if(isAbleToProvideService < 50){
            System.out.println("Oh, you wanted psychological security? Sorry...");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Let me assign you to my friend, great psychologist");
    }

    @Override
    void requestPayment() {
        System.out.println("Gimme 7k, I will protect you from firemen");
    }


}
