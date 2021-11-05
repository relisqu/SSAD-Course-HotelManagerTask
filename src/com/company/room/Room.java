package com.company.room;

import com.company.Human;

public abstract class Room {
    protected int size;
    abstract void checkIn(Human resident, int residentsCount);

    abstract void checkOut();

    abstract int getSize();

    abstract int getNumber();

    abstract int getCurrentResidentsCount();

    abstract boolean isOccupied();

    abstract RoomType getType();
}
