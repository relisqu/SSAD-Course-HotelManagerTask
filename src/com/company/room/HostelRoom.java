package com.company.room;

/**
 * Hostel Room decorator allows converting
 * room into hostel room to optimize
 * available places.
 */
public class HostelRoom extends RoomDecorator {
    /**
     * Decorator constructor wraps existing room
     *
     * @param room Room instance which needs to be decorated
     */
    public HostelRoom(StandardRoom room) {
        super(room);
    }

    /**
     * Occupation behaviour is changed. Now the room
     * can not accept new residents only when the total
     * number of busy places equals to maximum size.
     *
     * @return true if all places are busy and false otherwise
     */
    @Override
    public boolean isOccupied() {
        return super.getCurrentResidentsCount() == super.getSize();
    }

}
