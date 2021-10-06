package com.company;

import com.company.room.Room;
import com.company.room.RoomType;

import java.sql.Time;
import java.util.ArrayList;

public interface RoomAccess {
    ArrayList<Room> getRooms(Human client,
                             RoomType type, int peopleCount);

    void updateRooms(Room... updatedRooms);

    void deleteRooms(Room... deletedRooms);
}
