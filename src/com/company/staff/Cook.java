package com.company.staff;

import com.company.Human;

/**
 * Represents Cook staff member
 */
public class Cook extends Staff {
    public Cook(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void comeToRoom(int roomNumber) {
        System.out.println("I am Cook and I came to room "+roomNumber);
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void communicateWithClient() {
        System.out.println("Do you want salad with garlic?");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    boolean tryProvideService() {
        double isAbleToProvideService = (Math.random()+5)%100;
        System.out.println("Here is your dish! Bonna appetite!");
        if(isAbleToProvideService < 50){
            System.out.println("The ingredients are wrong? I am sorry.");
            return false;
        }
        return true;
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void manageProvideServiceError() {
        System.out.println("I will redo the salad, my apologises.");
    }

    /**
    * Templated in Staff service algorithm step implementation.
    */
    @Override
    void requestPayment() {
        System.out.println("No need to pay. Just come to stolovka");
    }
}
