package com.company.room;

import com.company.Human;

public interface Room {
    void checkIn(Human resident, int residentsCount);

    void checkOut();

    int getSize();

    int getNumber();

    int getCurrentResidentsCount();

    boolean isOccupied();
}
