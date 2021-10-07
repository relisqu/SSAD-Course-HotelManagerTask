package com.company.room;

import com.company.Human;

/**
 * Represents hotel room.
 */
public class Room {
    private int number;
    private int size;
    private RoomType type;
    private Human resident;
    private int currentResidentsCount;
    private boolean isOccupied;

    /**
     * Parametrized constructor used to specify
     * room type, service level and max number
     * of residents.
     * @param number room number
     * @param size   maximum number of residents
     * @param type   room service type
     */
    public Room(int number, int size, RoomType type) {
        this.number = number;
        this.size = size;
        this.type = type;
    }

    /**
     * Check in new resident
     * @param resident       responsible for booking resident
     * @param residentsCount number of residents
     */
    public void checkIn(Human resident, int residentsCount) {
        //   TODO: check if number of residents does not exceed room size.
        if (!isOccupied) {
            this.resident = resident;
            this.currentResidentsCount = residentsCount;
            isOccupied = true;
        }
    }

    /**
     * Free room from any residence.
     */
    public void checkOut() {
        if (isOccupied) {
            resident = null;
            currentResidentsCount = 0;
            isOccupied = false;
        }
    }

    /**
     * Get information of room maximum number of residents.
     * @return maximum number of residents
     */
    public int getSize() {
        return size;
    }

    /**
     * Get room number
     * @return room number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Get information of a room service type
     * @return room type
     */
    public RoomType getType() {
        return type;
    }

    /**
     * Check whether the room is occupied
     * @return true if the room is occupied and false otherwise
     */
    public boolean isOccupied() {
        return isOccupied;
    }

    /**
     * Get information of current residents count
     * @return current number of residents
     */
    public int getCurrentResidentsCount() {
        return currentResidentsCount;
    }
}
