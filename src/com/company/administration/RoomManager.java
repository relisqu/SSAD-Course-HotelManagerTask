package com.company.administration;

import com.company.Human;
import com.company.RoomAccess;
import com.company.room.Room;
import com.company.room.RoomType;

import java.sql.Time;


public class RoomManager {
    public RoomManager() {

    }

    /**
     * This method allows us to book a room.
     * In the parameters of this method, we pass access,
     * which allows us to access the list of rooms.
     * The method checks all rooms for their availability
     * and suitability by attributes.
     * If all parameters are met, the room is reserved.
     * It does not return anything, it only changes the parameters of a specific room.
     * @param access -
     * @param client -
     * @param type - type of the room for booking
     * @param peopleCount - number of people for booking
     */
    public void bookRoom(RoomAccess access, Human client,
                         RoomType type, int peopleCount) {
     for(int i=0; i<access.getRooms().size(); i++){
        if(access.getRooms().get(i).isOccupied()) continue;
        else{
            if(access.getRooms().get(i).getSize() >= peopleCount && access.getRooms().get(i).getType()==type){
                access.getRooms().get(i).CheckIn(client, peopleCount);
            }
        }
     }
    }

    /**
     * This method allows us to remove the reservation from the room.
     * It does not return anything, it only changes the parameters of a specific room.
     * @param access -
     * @param room - the room we want to free
     */
    public void unbookRoom(RoomAccess access, Room room){
        access.getRooms().get(room.getNumber()).CheckOut();
    }
}
