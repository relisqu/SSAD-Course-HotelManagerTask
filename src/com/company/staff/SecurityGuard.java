package com.company.staff;

public class SecurityGuard extends Staff{
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Security. Hey, where is your mask?!");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
