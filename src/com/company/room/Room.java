package com.company.room;

import com.company.Human;

public abstract class Room {
    private int size;

    abstract void checkIn(Human resident, int residentsCount);

    abstract void checkOut();


    abstract int getNumber();

    abstract int getCurrentResidentsCount();

    abstract boolean isOccupied();

    abstract RoomType getType();

    protected void setSize(int newSize) {
        if (newSize >= getCurrentResidentsCount() && newSize >= 0) {
            size = newSize;
        }
    }

    protected int getSize() {
        return size;
    }
}
