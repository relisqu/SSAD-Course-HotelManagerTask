package com.company.room;

public class HostelRoom extends RoomDecorator {
    public HostelRoom(StandardRoom room) {
        super(room);
    }

    @Override
    public boolean isOccupied() {
        return super.getCurrentResidentsCount()==super.getSize();
    }
}
