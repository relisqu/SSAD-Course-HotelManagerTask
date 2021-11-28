package com.company.staff;

import com.company.Human;

/**
 * Represents Deliveryman staff member
 */
public class Deliveryman extends Staff {
    public Deliveryman(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void comeToRoom(int roomNumber) {
        System.out.println("I am Deliveryman and I came to room "+roomNumber);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void communicateWithClient() {
        System.out.println("Hello! Would you like to order Burger? We will deliver it in a minute!");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected boolean tryProvideService() {
        double isAbleToProvideService = (Math.random()+4)%100;
        System.out.println("Good afternoon, here are your products.");
        if(isAbleToProvideService < 50){
            System.out.println("You haven't ordered burger, but ordered potato? I am sorry for this delivery mistake.");
            return false;
        }
        return true;
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void manageProvideServiceError() {
        System.out.println("Here is your burger.");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    protected void requestPayment() {
        System.out.println("What?! You have tons of promocodes for free delivery?!");
    }
}
