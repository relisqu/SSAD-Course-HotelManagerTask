package com.company.room;

public class ExpandableRoom extends RoomDecorator {
    public ExpandableRoom(StandardRoom room) {
        super(room);
    }
    public void addBed(){
        size++;
    }
    public void removeBed(){
        if(getSize()>1 && getCurrentResidentsCount()<getSize()){
            size--;
        }
    }
}
