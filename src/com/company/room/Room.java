package com.company.room;

import com.company.Human;

public class Room {
    private int number;
    private int size;
    private RoomType type;
    private Human resident;
    private int currentResidentsCount;
    private boolean isOccupied;

    public Room(int number, int size, RoomType type) {
        this.number = number;
        this.size = size;
        this.type = type;
    }

    public void CheckIn(Human resident, int residentsCount) {
        if (!isOccupied) {
            this.resident = resident;
            this.currentResidentsCount = residentsCount;
            isOccupied = true;
        }
    }

    public void CheckOut() {
        if (isOccupied) {
            resident = null;
            currentResidentsCount = 0;
            isOccupied = false;
        }
    }

    public int getSize() {
        return size;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getCurrentResidentsCount() {
        return currentResidentsCount;
    }
}
