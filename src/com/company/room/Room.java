package com.company.room;

import com.company.Human;

/**
 * Abstract class representing Hotel Room
 */
public abstract class Room {
    private int size;

    /**
     * Check in clients in room instance
     *
     * @param resident       booking responsible client
     * @param residentsCount number of room residents
     */
    abstract public void checkIn(Human resident, int residentsCount);

    /**
     * Check out all residents and make room available again.
     */
    abstract public void checkOut();

    /**
     * Getter for room number
     *
     * @return integer room number
     */
    abstract public int getNumber();

    /**
     * Getter for number of current residents
     *
     * @return integer number of residents
     */
    abstract public int getCurrentResidentsCount();

    /**
     * Check whether the room is available
     *
     * @return false if room is free and true otherwise
     */
    abstract public boolean isOccupied();

    /**
     * Getter for room instance type
     *
     * @return RoomType type of room instance
     */
    abstract public RoomType getType();

    /**
     * Protected setter for a room size, which makes it
     * possible to resize room right on the fly
     *
     * @param newSize integer new size of the room
     */
    protected void setSize(int newSize) {
        if (newSize < 0) {
            return;
        }
        if (newSize < getCurrentResidentsCount()) {
            return;
        }
        size = newSize;
    }

    /**
     * Public getter of the current room size
     *
     * @return integer current room size
     */
    public int getSize() {
        return size;
    }
}
