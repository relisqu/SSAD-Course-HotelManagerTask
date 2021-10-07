package com.company.staff;

public class Plumber extends Staff{
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Plumber. I came to clean your pipes");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
