package com.company.room;

import com.company.Human;

public abstract class RoomDecorator implements Room {
    private StandardRoom wrappedRoom;

    public RoomDecorator(StandardRoom room) {
        this.wrappedRoom = room;
    }

    @Override
    public void checkIn(Human resident, int residentsCount) {
        wrappedRoom.checkIn(resident, residentsCount);
    }

    @Override
    public void checkOut() {
        wrappedRoom.checkOut();
    }

    @Override
    public int getSize() {
        return wrappedRoom.getSize();
    }

    @Override
    public int getNumber() {
        return wrappedRoom.getNumber();
    }

    @Override
    public int getCurrentResidentsCount() {
        return wrappedRoom.getCurrentResidentsCount();
    }

    @Override
    public boolean isOccupied() {
        return wrappedRoom.isOccupied();
    }

    @Override
    public RoomType getType() {
        return  wrappedRoom.getType();
    }
}
