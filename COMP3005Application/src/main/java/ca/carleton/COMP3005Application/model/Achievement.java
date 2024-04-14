package ca.carleton.COMP3005Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Achievements")
public class Achievement {

    @Id
    private int memberID;

    @Id
    private String achievementDesc;

    public Achievement() {}

    public Achievement(int memberID, String achievementDesc) {
        this.memberID = memberID;
        this.achievementDesc = achievementDesc;
    }

    //Getters
    public int GetMemberID() { return memberID; }
    public String GetAchievementDesc() { return achievementDesc; }

    //Setters
    public void SetAchievementDesc(String newDesc) { achievementDesc = newDesc; }
}
