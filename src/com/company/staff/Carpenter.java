package com.company.staff;

import com.company.Human;
import com.company.Main;

/**
 * Represents Carpenter staff member
 */
public class Carpenter extends Staff {
    public Carpenter(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    @Override
    void comeToRoom(int roomNumber) {
        System.out.println("I am Carpenter and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("What kind of furniture would you like to fix?");
    }

    @Override
    boolean tryProvideService() {
        double isAbleToProvideService = (Math.random())%100;
        System.out.println("Here is your fix.");
        if(isAbleToProvideService < 50){
            System.out.println("Is it still broken?");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("My apologies, let us fix it again.");
    }

    @Override
    void requestPayment() {
        System.out.println("Nowadays wood is very expensive. Be a man. Plant a tree.");
    }


}
