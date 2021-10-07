package com.company;

import com.company.room.Room;
import com.company.staff.Staff;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

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
        this.rooms = rooms;
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
        staff = staff.stream().map(w -> {
            for (Staff updatedW : updatedStaff) {
                if (updatedW.getPersonalInformation().getId() == w.getPersonalInformation().getId()) {
                    return updatedW;
                }
            }
            return w;
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Remove hotel staff
     * @param deletedStaff to be fired
     */
    @Override
    public void deleteStaff(Staff... deletedStaff) {
        staff = staff.stream().filter(w -> {
            for (Staff deletedW : deletedStaff) {
                if (deletedW.getPersonalInformation().getId() == w.getPersonalInformation().getId()) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Find new staff members
     * @param createdStaff staff to be hired
     */
    @Override
    public void createStaff(Staff... createdStaff) {
        staff.addAll(Arrays.stream(createdStaff).filter(w ->
        {
            for (Staff currentStaff : staff) {
                if (currentStaff.getPersonalInformation().getId() == w.getPersonalInformation().getId()) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toCollection(ArrayList::new)));
    }

    /**
     * Get hotel rooms information
     * @return hotel rooms list
     */
    @Override
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    /**
     * Update hotel rooms information
     * @param updatedRooms rooms to be updated
     */
    @Override
    public void updateRooms(Room... updatedRooms) {
        rooms = rooms.stream().map(w -> {
            for (Room updatedW : updatedRooms) {
                if (updatedW.getNumber() == w.getNumber()) {
                    return updatedW;
                }
            }
            return w;
        }).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Make some hotel rooms unavailable
     * @param deletedRooms rooms to be removed
     */
    @Override
    public void deleteRooms(Room... deletedRooms) {
        rooms = rooms.stream().filter(w -> {
            for (Room deletedW : deletedRooms) {
                if (deletedW.getNumber() == w.getNumber()) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toCollection(ArrayList::new));
    }
}
