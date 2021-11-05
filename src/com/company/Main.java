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

        StandardRoom room1 = new StandardRoom(2, 105, RoomType.STANDARD);
        System.out.println("Room occupied: " + room1.isOccupied());
        room1.checkIn(new Human("Kopeikina", "Anna"), 1);
        System.out.println("Room occupied after booking: " + room1.isOccupied());
        HostelRoom hostelRoom = new HostelRoom(room1);
        System.out.println("Room occupied after becoming hostel with free place: " + hostelRoom.isOccupied());
    }
}

