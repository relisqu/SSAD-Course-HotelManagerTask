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
        int rand = (Math.random())%2;
        return rand == 1;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("What? You haven't ordered shaverma, but ordered potato?!");
    }

    @Override
    void requestPayment() {
        System.out.println("What?! You have tons of promocodes for free delivery?!");
    }
}
