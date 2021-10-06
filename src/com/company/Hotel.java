package com.company;

import com.company.room.Room;
import com.company.room.RoomType;
import com.company.staff.Staff;
import java.util.ArrayList;

public class Hotel implements RoomAccess, StaffAccess {
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staff;

    public Hotel(ArrayList<Room> rooms) {
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    @Override
    public void updateStaff(Staff... updatedStaff) {

    }

    @Override
    public void deleteStaff(Staff... firedStaff) {

    }

    @Override
    public void createStaff(Staff... createStaff) {

    }

    @Override
    public ArrayList<Room> getRooms() {
        return null;
    }

    @Override
    public void updateRooms(Room... newRooms) {

    }

    @Override
    public void deleteRooms(Room... deletedRooms) {

    }
}
