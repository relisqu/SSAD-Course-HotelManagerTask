package com.company.staff;

public class Cook extends Staff {
    @Override
    public void doJob(int roomNumber, String message) {
        System.out.println("I am Cook. I like cooking cockroaches.");
        System.out.println("Currently in room: " + roomNumber + " fixing " + message);
    }
}
