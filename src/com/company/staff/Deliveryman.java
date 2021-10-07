package com.company.staff;

public class Deliveryman extends Staff {
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Deliveryman. Someday Yandex rovers will replace me");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
