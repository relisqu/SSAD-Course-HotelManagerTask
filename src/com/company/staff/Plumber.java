package com.company.staff;

import com.company.Human;

/**
 * Represents Plumber staff member
 */
public class Plumber extends Staff {
    public Plumber(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void comeToRoom(int roomNumber) {
        System.out.println("I am Plumber and I came to room "+roomNumber);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void communicateWithClient() {
        System.out.println("Mmm, I came to fix your pipes");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected boolean tryProvideService() {
        double isAbleToProvideService =  (Math.random()+2)%100;

        System.out.println("Trying to fix pipes.");
        if(isAbleToProvideService < 50){
            System.out.println("They are destroyed, I can't recover it. I guess we need new pipes.");
            return false;
        }
        return true;
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void manageProvideServiceError() {
        System.out.println("Let me ask new pipes from manager.");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void requestPayment() {
        System.out.println("300 bucks, please");
    }

}
