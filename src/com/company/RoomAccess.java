package com.company;

import com.company.room.Room;

import java.util.ArrayList;

/**
 * Access modifier for our database.
 * Represents access to hotel rooms information.
 */
public interface RoomAccess {

    /**
     * Get hotel rooms information
     *
     * @return hotel rooms list
     */
    ArrayList<Room> getRooms();

    /**
     * Update hotel rooms information
     *
     * @param updatedRooms to be updated
     */
    void updateRooms(Room... updatedRooms);

    /**
     * Make some hotel rooms unavailable
     *
     * @param deletedRooms rooms to be removed
     */
    void deleteRooms(Room... deletedRooms);
}
