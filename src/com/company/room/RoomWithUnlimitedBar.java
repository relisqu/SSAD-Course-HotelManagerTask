package com.company.room;

public class RoomWithUnlimitedBar extends RoomDecorator {
    public RoomWithUnlimitedBar(StandardRoom room) {
        super(room);
    }

    public void bringBreakfast() {

        /*if(room.isOccupied()){
            System.out.println("Here is the breakfast for "+ room.getResidentsCurrentCount()+" residents from "+ room.getNumber()+" room!");
        }
        *
        */
    }
}
