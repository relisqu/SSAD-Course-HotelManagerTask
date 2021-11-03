package com.company.room;

import com.company.Human;

public class StandardRoom implements Room {

    private int size;
    private int number;
    private int currentResidentsCount;
    private Human resident;
    private boolean isOccupied;


    /**
     * Parametrized constructor used to specify
     * room type, service level and max number
     * of residents.
     *
     * @param number room number
     * @param size   maximum number of residents
     */
    public StandardRoom(int size, int number) {
        this.size = size;
        this.number = number;
    }


    /**
     * Check in new resident
     *
     * @param resident       responsible for booking resident
     * @param residentsCount number of residents
     */
    @Override
    public void checkIn(Human resident, int residentsCount) {
        if (!isOccupied && residentsCount <= getSize()) {
            this.resident = resident;
            this.currentResidentsCount = residentsCount;
            isOccupied = true;
        }
    }

    /**
     * Free room from any residence.
     */
    @Override
    public void checkOut() {
        if (isOccupied) {
            resident = null;
            currentResidentsCount = 0;
            isOccupied = false;
        }
    }

    /**
     * Get information of room maximum number of residents.
     *
     * @return maximum number of residents
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Get room number
     *
     * @return room number
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * Check whether the room is occupied
     *
     * @return true if the room is occupied and false otherwise
     */
    @Override
    public boolean isOccupied() {
        return isOccupied;
    }

    /**
     * Get personal information of a responsible person
     *
     * @return personal information of a main resident
     */
    public Human getResident() {
        return resident;
    }

    /**
     * Get information of current residents count
     *
     * @return current number of residents
     */
    @Override
    public int getCurrentResidentsCount() {
        return currentResidentsCount;
    }
}