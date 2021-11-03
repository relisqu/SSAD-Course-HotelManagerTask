package com.company;

public class Main {

    public static void main(String[] args) {/*
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

        Human slave1= new Human("Alentev","Igor");

        Human slave2= new Human("Asatullaev","Maruf");

        staffManager.hireStaff(hotel,new PlumberCreator().createStaff(slave1, StaffType.IRREGULAR));
        staffManager.hireStaff(hotel,new SecurityGuardCreator().createStaff(slave2, StaffType.IRREGULAR));
        for (int i = 0; i < hotel.getStaff().size(); i++) {
            System.out.println(hotel.getStaff().get(i).getPersonalInformation().getName());
        }
        staffManager.makeOrder(Plumber.class, hotel,2,"Help, our pump was broken :(");
        ArrayList<Staff> list = staffManager.getStaffList(hotel);
        for (Staff worker : list) {
            staffManager.fireStaff(hotel, worker);
        }
        System.out.println("Fired everybody");
        staffManager.makeOrder(Plumber.class, hotel,2,"Help, our pump was broken :(");
     //   roomManager.bookRoom(hotel, client1, RoomType.LUX, 2);
     //   roomManager.bookRoom(hotel, client2, RoomType.ECONOMY, 1);
        ArrayList<Room> rooms = roomManager.getRoomList(hotel);
        for (Room room : rooms) {
            if (room.isOccupied()) {
                if (room.getType() == RoomType.LUX) {
                    System.out.println("Found the room where Ann lives!");
                    System.out.println("People live here: " + room.getCurrentResidentsCount());
                    System.out.println("com.company.room.Room number: " + room.getNumber());
                    System.out.println("com.company.room.Room is occupied? " + room.isOccupied());
                    roomManager.unbookRoom(hotel, room);
                    System.out.println("Kicked her out!");
                    System.out.println("People live here: " + room.getCurrentResidentsCount());
                    System.out.println("com.company.room.Room number: " + room.getNumber());
                    System.out.println("com.company.room.Room is occupied? " + room.isOccupied());
                }
                if (room.getType() == RoomType.ECONOMY) {
                    System.out.println("Found the room where Karina lives!");
                    System.out.println("People live here: " + room.getCurrentResidentsCount());
                    System.out.println("com.company.room.Room number: " + room.getNumber());
                    System.out.println("com.company.room.Room is occupied? " + room.isOccupied());
                    roomManager.unbookRoom(hotel, room);
                    System.out.println("Kicked her out!");
                    System.out.println("People live here: " + room.getCurrentResidentsCount());
                    System.out.println("com.company.room.Room number: " + room.getNumber());
                    System.out.println("com.company.room.Room is occupied? " + room.isOccupied());
                    System.out.println("\n\n");
                }
        }*/
    }
}

