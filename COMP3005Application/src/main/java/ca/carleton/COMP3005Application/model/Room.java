package ca.carleton.COMP3005Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Room")
public class Room {

    @Id
    private int bldNum;

    @Id
    private int roomNum;

    public Room() { }

    public Room(int bldNum, int roomNum) {
        this.bldNum = bldNum;
        this.roomNum = roomNum;
    }

    //Getters
    public int GetBldNum() { return bldNum; }
    public int GetRoomNum() { return roomNum; }
}
