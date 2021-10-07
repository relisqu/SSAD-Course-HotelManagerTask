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
     * Performs the Deliveryman required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Deliveryman. Someday Yandex rovers will replace me");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
