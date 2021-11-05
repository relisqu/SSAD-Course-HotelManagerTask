package com.company.room;

public class ExpandableRoom extends RoomDecorator {
    public ExpandableRoom(StandardRoom room) {
        super(room);
    }
    public void addBed(){
        super.setSize(super.getSize()+1);
    }
    public void removeBed(){
        super.setSize(super.getSize()-1);
    }
}
