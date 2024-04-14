package ca.carleton.COMP3005Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Days")
public class Day {

    @Id
    private int routineID;

    @Id
    private String day;

    public Day() {}

    public Day(int routineID, String day) {
        this.routineID = routineID;
        this.day = day;
    }

    //Getters
    public int GetRoutineID() { return routineID; }
    public String GetDay() { return day; }
}
