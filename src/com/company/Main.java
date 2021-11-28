package com.company;

import com.company.room.*;

public class Main {

    public static void main(String[] args) {
<<<<<<< Updated upstream
        StandardRoom room = new StandardRoom(5,105, RoomType.STANDARD);
        System.out.println("Room size was: " + room.getSize());
        // room.setSize(); - Private can not be accessed
        ExpandableRoom resizableRoom = new ExpandableRoom(room);
        resizableRoom.addBed();
        System.out.println("Now we can safely change room size, new size is: " + resizableRoom.getSize());
        System.out.println("References are held correct as well: " + room.getSize());
=======
        StandardRoom roomHuyum = new StandardRoom((int) Double.POSITIVE_INFINITY, 105);/*
        ArrayList<Room> hotelRooms = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
        // hotelRooms.add(new Room(i+1,2, RoomType.ECONOMY));
        }
        for (int i = 0; i < 15; i++) {
        //    hotelRooms.add(new Room(i+16,3, RoomType.LUX));
        }
        Hotel hotel = new Hotel(hotelRooms);
        RoomManager roomManager=new RoomManager();
        StaffManager staffManager= new StaffManager();
        for (int i=0;i<hotel.getRooms().size();i++){
            System.out.print(hotel.getRooms().get(i).getNumber());
            System.out.print(' ');
        }
        System.out.println();
        Human client1= new Human("Kopeikina","Anna");
        Human client2= new Human("Tyulebaeva","Karina");
        Human client3= new Human("Domrachev","Ivan");
>>>>>>> Stashed changes

        StandardRoom room1 = new StandardRoom(2, 105, RoomType.STANDARD);
        System.out.println("Room occupied: " + room1.isOccupied());
        room1.checkIn(new Human("Kopeikina", "Anna"), 1);
        System.out.println("Room occupied after booking: " + room1.isOccupied());
        HostelRoom hostelRoom = new HostelRoom(room1);
        System.out.println("Room occupied after becoming hostel with free place: " + hostelRoom.isOccupied());
    }
}

