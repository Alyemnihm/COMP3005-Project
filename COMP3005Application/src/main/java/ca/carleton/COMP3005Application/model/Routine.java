package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

@Entity
@Table(name="Routine")
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int routineID;

    @Column(name="member_id")
    private int memberID;

    @Column(name="exercise")
    private String exercise;

    public Routine() {}

    public Routine(int memberID, String exercise) {
        this.memberID = memberID;
        this.exercise = exercise;
    }

    //Getters
    public int GetRoutineID() { return routineID; }
    public int GetMemberID() { return memberID; }
    public String GetExercise() { return exercise; }

    //Setters
    public void SetExercise(String newExercise) { exercise = newExercise; }
}
