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
        int isAbleToProvideService = (Math.random()+3)%100;
        if(isAbleToProvideService < 50){
            System.out.println("Sorry, I don't wanted to break up rest of bulbs...");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Let me go and take 5 more bulbs");
    }

    @Override
    void requestPayment() {
        System.out.println("No need to pay me. It's better to pay attention to the nature!");
    }
}
