package com.company;

import com.company.room.Room;
import com.company.staff.Staff;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Hotel implements RoomAccess, StaffAccess {
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staff;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

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

    @Override
    public ArrayList<Room> getRooms() {
        return rooms;
    }

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
