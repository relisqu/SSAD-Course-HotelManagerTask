package com.company.staff;

public class Cleaner extends Staff{
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Cleaner. I will come every 7-10 days. Or not");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
