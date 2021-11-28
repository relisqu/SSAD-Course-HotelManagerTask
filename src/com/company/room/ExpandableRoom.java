package com.company.room;

/**
 * Room class decorator allowing to resize
 * the room allowing it to have less or more
 * residents than set initially
 */
public class ExpandableRoom extends RoomDecorator {
    /**
     * Decorator constructor wraps existing room
     *
     * @param room Room instance which needs to be decorated
     */
    public ExpandableRoom(StandardRoom room) {
        super(room);
    }

<<<<<<< Updated upstream
    /**
     * Public API for increasing the size of the room
     */
    public void addBed(){
        super.setSize(super.getSize() + 1);
    }

    /**
     * Public API for decreasing the size of the room
     */
    public void removeBed(){
=======
    public void addBed() {
        super.setSize(super.getSize() + 1);
    }

    public void removeBed() {
>>>>>>> Stashed changes
        super.setSize(super.getSize() - 1);
    }
}
