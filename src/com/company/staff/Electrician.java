package com.company.staff;

public class Electrician extends Staff{
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Electrician. I heard you have no electricity, so I brought you candle");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
