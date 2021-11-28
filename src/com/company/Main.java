package com.company;

import com.company.room.*;
import com.company.staff.*;
import com.company.administration.*;
import com.company.staff.creators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Room> hotelRooms = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            hotelRooms.add(new HostelRoom(new StandardRoom(i + 1, 2, RoomType.ECONOMY)));
        }
        for (int i = 0; i < 15; i++) {
            hotelRooms.add(new ExpandableRoom(new StandardRoom(i + 16, 3, RoomType.LUX)));
        }
        Hotel hotel = new Hotel(hotelRooms);
        RoomManager roomManager = new RoomManager();
        StaffManager staffManager = new StaffManager();
        Human client1 = new Human("Kopeikina", "Anna");
        Human client2 = new Human("Tyulebaeva", "Karina");
        Human client3 = new Human("Domrachev", "Ivan");

        Human slave1 = new Human("Alentev", "Igor");

        Human slave2 = new Human("Asatullaev", "Maruf");

        staffManager.hireStaff(hotel, new PlumberCreator().createStaff(slave1, StaffType.IRREGULAR));
        staffManager.hireStaff(hotel, new SecurityGuardCreator().createStaff(slave2, StaffType.IRREGULAR));
        for (int i = 0; i < hotel.getStaff().size(); i++) {
            System.out.println(hotel.getStaff().get(i).getPersonalInformation().getName());
        }
        staffManager.makeOrder(Plumber.class, hotel, 2, "Help, our pump was broken :(");
    }
}

