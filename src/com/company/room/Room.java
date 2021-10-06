package com.company.room;

public class Room {
    private int number;
    private int size;
    private RoomType type;

    public Room(int number, int size, RoomType type) {
        this.number = number;
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

}
