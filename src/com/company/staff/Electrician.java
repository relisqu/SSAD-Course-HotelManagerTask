package com.company.staff;

import com.company.Human;

/**
 * Represents Electrician staff member
 */
public class Electrician extends Staff {
    public Electrician(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }


    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void comeToRoom(int roomNumber) {
        System.out.println("I am Electrician and I came to room "+roomNumber);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void communicateWithClient() {
        System.out.println("Again problems with lights in bathroom?");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected boolean tryProvideService() {
        double isAbleToProvideService = (Math.random()+3)%100;
        System.out.println("Trying to fix the lighting.");
        if(isAbleToProvideService < 50){
            System.out.println("Sorry, I don't wanted to break up rest of bulbs...");
            return false;
        }
        return true;
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void manageProvideServiceError() {
        System.out.println("Let me go and take 5 more bulbs");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void requestPayment() {
        System.out.println("No need to pay me. It's better to pay attention to the nature!");
    }
}
