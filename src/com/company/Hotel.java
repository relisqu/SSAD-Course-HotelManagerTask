package com.company;

import com.company.room.Room;
import com.company.room.RoomType;
import com.company.staff.Staff;
import java.util.ArrayList;

/**
 * Represents Hotel Database instance
 */
public class Hotel implements RoomAccess, StaffAccess {
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staff;

    /**
     * Parametrized constructor allows specifying initial rooms set
     * @param rooms initial rooms set
     */
    public Hotel(ArrayList<Room> rooms) {
    }

    /**
     * Get information of currently available staff
     * @return available hotel staff
     */
    @Override
    public ArrayList<Staff> getStaff() {
        return staff;
    }

    /**
     * Update staff information
     * @param updatedStaff new staff information
     */
    @Override
    public void updateStaff(Staff... updatedStaff) {

    }

    /**
     * Remove hotel staff
     * @param firedStaff staff to be fired
     */
    @Override
    public void deleteStaff(Staff... firedStaff) {

    }

    /**
     * Find new staff members
     * @param createdStaff staff to be hired
     */
    @Override
    public void createStaff(Staff... createdStaff) {

    }

    /**
     * Get hotel rooms information
     * @return hotel rooms list
     */
    @Override
    public ArrayList<Room> getRooms() {
        return null;
    }

    /**
     * Update hotel rooms information
     * @param newRooms rooms to be updated
     */
    @Override
    public void updateRooms(Room... newRooms) {

    }

    /**
     * Make some hotel rooms unavailable
     * @param deletedRooms rooms to be removed
     */
    @Override
    public void deleteRooms(Room... deletedRooms) {

    }
}
