package com.company.staff;

import com.company.Human;

/**
 * Represents Deliveryman staff member
 */
public class Deliveryman extends Staff {
    public Deliveryman(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    @Override
    void comeToRoom(int roomNumber) {
        System.out.println("I am Deliveryman and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("I know you called YandexRover, but it is not working and I took your BigBoss shaverma");
    }

    @Override
    boolean tryProvideService() {
        int isAbleToProvideService = (Math.random()+4)%100;
        if(isAbleToProvideService < 50){
            System.out.println("What? You haven't ordered shaverma, but ordered potato?!");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Please, try this shaverma, I hope it will help you lose weight if you wish");
    }

    @Override
    void requestPayment() {
        System.out.println("What?! You have tons of promocodes for free delivery?!");
    }
}
