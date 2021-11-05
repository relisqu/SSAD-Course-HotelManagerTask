package com.company.room;

import com.company.Human;

/**
 * Abstract class for decorating Room class
 * It allows modifications of behaviour and
 * properties of the instance getting wrapped
 */
public abstract class RoomDecorator extends Room {
    private StandardRoom wrappedRoom;

    /**
     * Decorator constructor wraps existing room
     *
     * @param room Room instance which needs to be decorated
     */
    public RoomDecorator(StandardRoom room) {
        this.wrappedRoom = room;
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     *
     * @param resident       booking responsible client
     * @param residentsCount number of room residents
     */
    @Override
    public void checkIn(Human resident, int residentsCount) {
        wrappedRoom.checkIn(resident, residentsCount);
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     */
    @Override
    public void checkOut() {
        wrappedRoom.checkOut();
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     */
    @Override
    public int getSize() {
        return wrappedRoom.getSize();
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     */
    @Override
    public int getNumber() {
        return wrappedRoom.getNumber();
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     */
    @Override
    public int getCurrentResidentsCount() {
        return wrappedRoom.getCurrentResidentsCount();
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     */
    @Override
    public boolean isOccupied() {
        return wrappedRoom.isOccupied();
    }

    /**
     * Forwarding method which by default calls
     * the method of wrapped instance
     */
    @Override
    public RoomType getType() {
        return  wrappedRoom.getType();
    }
}
