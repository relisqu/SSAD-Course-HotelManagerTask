package com.company.staff;

/**
 * Represents Deliveryman staff member
 */
public class Deliveryman extends Staff {
    /**
     * Performs the Deliveryman required to do.
     */
    @Override
    public void doJob(int roomNumber, String message) {
        setAvailable(false);
        System.out.println("I am Deliveryman. Someday Yandex rovers will replace me\n");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
        setAvailable(true);
    }
}
