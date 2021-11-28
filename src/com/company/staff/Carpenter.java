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
        System.out.println("No, I am not selling carpets, I am working with wood");
    }

    @Override
    boolean tryProvideService() {
        int isAbleToProvideService = (Math.random())%100;
        if(isAbleToProvideService < 50){
            System.out.println("It is sad, that you feel nostalgic about your home country interior");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Well, if you want carpet we can go to the bazar");
    }

    @Override
    void requestPayment() {
        System.out.println("Nowadays wood is very expensive. Be a man. Plant a tree.");
    }


}
