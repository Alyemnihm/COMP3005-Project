package ca.carleton.COMP3005Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Goals")
public class Goal {

    @Id
    private int memberID;

    @Id
    private String goalDesc;

    public Goal() {}

    public Goal(int memberID, String goalDesc) {
        this.memberID = memberID;
        this.goalDesc = goalDesc;
    }

    //Getters
    public int GetMemberID() { return memberID; }
    public String GetGoalDesc() { return goalDesc; }

    //Setters
    public void SetGoalDesc(String newDesc) { goalDesc = newDesc; }
}
