package com.company.administration;

import com.company.Human;
import com.company.RoomAccess;
import com.company.room.Room;
import com.company.room.RoomType;

import java.util.ArrayList;

/**
 * Represents Hotel com.company.room.Room Manager.
 * He resolves everything related to rooms
 * and their availability.
 */
public class RoomManager {
    public RoomManager() {
    }

    /**
     * This method allows us to book a room.
     * In the parameters of this method, we pass access,
     * which allows us to access the list of rooms.
     * The method checks all rooms for their availability
     * and suitability by attributes.
     * If all parameters are met, the room is reserved.
     * It does not return anything, it only changes the parameters of a specific room.
     *
     * @param access      hotel rooms information
     * @param client      human, who want to book the room
     * @param type        type of the room for booking
     * @param peopleCount number of people for booking
     */
    public void bookRoom(RoomAccess access, Human client,
                                          RoomType type, int peopleCount) {
        Room currentRoom;
        for (int i = 0; i < access.getRooms().size(); i++) {
            currentRoom = access.getRooms().get(i);
            if (!currentRoom.isOccupied() && currentRoom.getSize() >= peopleCount && currentRoom.getType() == type) {
                currentRoom.checkIn(client, peopleCount);
                break;
            }
        }
    }

    /**
     * Get the list of a hotel rooms
     *
     * @param access hotel rooms information
     * @return list of hotel rooms
     */
    public ArrayList<Room> getRoomList(RoomAccess access) {
        return access.getRooms();
    }

    /**
     * Try to free room from a client.
     * E.g. departure time has come or
     * the client decided to leave himself.
     *
     * @param access hotel rooms information
     * @param room   room to be freed
     */
    public void unbookRoom(RoomAccess access, Room room) {
        room.checkOut();
    }
}
