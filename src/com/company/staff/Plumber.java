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
        System.out.println("I am Plumber and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("Mmm, I came to fix your pipes");
    }

    @Override
    boolean tryProvideService() {
        int isAbleToProvideService = (Math.random()+2)%100;
        if(isAbleToProvideService < 50){
            System.out.println("I guess we need new pipes");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Let me ask new pipes from manager");
    }

    @Override
    void requestPayment() {
        System.out.println("300 bucks, please");
    }

}
