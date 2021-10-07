package com.company.staff;

public class Carpenter extends Staff{
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Carpenter. I will open bathroom door if you got stuck in it.");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
