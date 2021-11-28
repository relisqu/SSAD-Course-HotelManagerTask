package com.company.staff;

import com.company.Human;

/**
 * Represents Cleaner staff member
 */
public class Cleaner extends Staff {
    public Cleaner(Human personalInformation, StaffType type) {
        super(personalInformation, type);
    }

    @Override
    void comeToRoom(int roomNumber) {
        System.out.println("I am Cleaner and I came to room "+roomNumber);
    }

    @Override
    void communicateWithClient() {
        System.out.println("Good afternoon! Please remove objects from the table.");
    }

    @Override
    boolean tryProvideService() {
        double isAbleToProvideService = (Math.random()+6)%100;
        System.out.println("The cleaning is done, thank you!");
        if(isAbleToProvideService < 50){
            System.out.println("Unfortunately, cleaning of the bathroom is the duty of other department.");
            return false;
        }
        return true;
    }

    @Override
    void manageProvideServiceError() {
        System.out.println("Let us call them.");
    }

    @Override
    void requestPayment() {
        System.out.println("145 rubles per square meter");
    }
}
