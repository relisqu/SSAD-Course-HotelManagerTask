package com.company;

import com.company.room.*;

public class Main {

    public static void main(String[] args) {
        StandardRoom room = new StandardRoom(5,105, RoomType.STANDARD);
        System.out.println("Room size was: " + room.getSize());
        // room.setSize(); - Private can not be accessed
        ExpandableRoom resizableRoom = new ExpandableRoom(room);
        resizableRoom.addBed();
        System.out.println("Now we can safely change room size, new size is: " + resizableRoom.getSize());
        System.out.println("References are held correct as well: " + room.getSize());
}

