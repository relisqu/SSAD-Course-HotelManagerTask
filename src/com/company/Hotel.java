package com.company;

import com.company.room.Room;
import com.company.staff.Staff;
import java.util.ArrayList;
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

    private ListIterator<Staff> findStaff (Staff searchRequest) {
        ListIterator<Staff> curStaff = staff.listIterator();

        while(curStaff.hasNext()) {
            if(curStaff.next().getPersonalInformation().getId() == searchRequest.getPersonalInformation().getId()) {
                curStaff.previous();
                break;
            }
        }

        return curStaff;
    }

    private ListIterator<Room> findRoom (Room searchRequest) {
        ListIterator<Room> curRoom = rooms.listIterator();

        while(curRoom.hasNext()) {
            if(curRoom.next().getNumber() == searchRequest.getNumber()) {
                curRoom.previous();
                break;
            }
        }

        return curRoom;
    }

    @Override
    public void updateStaff(Staff... updatedStaff) {
        for(Staff staffForUpdate: updatedStaff) {
            ListIterator<Staff> it = findStaff(staffForUpdate);

            if(it.hasNext()) {
                it.set(staffForUpdate);
            }
        }
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
        for(Staff newStaff : createdStaff) {
            if(!findStaff(newStaff).hasNext()) {
                staff.add(newStaff);
            }
        }

    }

    @Override
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public void updateRooms(Room... updatedRooms) {
        for(Room roomForUpdate: updatedRooms) {
            ListIterator<Room> it = findRoom(roomForUpdate);

            if(it.hasNext()) {
                it.set(roomForUpdate);
            }
        }
    }

    @Override
    public void deleteRooms(Room... deletedRooms) {
        for(Room roomToDelete : deletedRooms) {
            ListIterator<Room> it = findRoom(roomToDelete);

            if(it.hasNext()) {
                it.remove();
            }
        }
    }
}
