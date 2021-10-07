package com.company.administration;

import com.company.Human;
import com.company.RoomAccess;
import com.company.room.Room;
import com.company.room.RoomType;

import java.sql.Time;

/**
 * Represents Hotel Room Manager.
 * He resolves everything related to rooms
 * and their availability.
 */
public class RoomManager {
    public RoomManager() {}

    /**
     * Try to book the room with the given parameters
     * if the one is available and do nothing otherwise.
     * @param access      hotel rooms information
     * @param client      the personal data of a client
     * @param type        room service level
     * @param peopleCount amount of people pretending to live
     */
    public void bookRoom(RoomAccess access, Human client,
                         RoomType type, int peopleCount) {
    }

    /**
     * Try to free room from a client.
     * E.g. departure time has come or
     * the client decided to leave himself.
     * @param access hotel rooms information
     * @param room   room to be freed
     */
    public void unbookRoom(RoomAccess access, Room room){}
}
