package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="HealthMetric")
public class HealthMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordID;

    @Column(name = "member_id")
    private int memberID;

    @Column(name = "systolic_bp")
    private int systolicBP;

    @Column(name = "diastolic_bp")
    private int diastolicBP;

    @Column(name = "ldl")
    private int ldl;

    @Column(name = "weight")
    private float weight;

    @Column(name = "height")
    private float height;

    @Column(name = "bmi")
    private float bmi;

    @Column(name = "date_recorded")
    private Date dateRecorded;

    public HealthMetric() {}

    public HealthMetric(int memberID, int systolicBP, int diastolicBP, int ldl, float weight, float height, float bmi, Date dateRecorded) {
        this.memberID = memberID;
        this.systolicBP = systolicBP;
        this.diastolicBP = diastolicBP;
        this.ldl = ldl;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.dateRecorded = dateRecorded;
    }

    //Getters
    public int GetRecordID() { return recordID; }
    public int GetMemberID() { return memberID; }
    public int GetSystolicBP() { return systolicBP; }
    public int GetDiastolicBP() { return diastolicBP; }
    public int GetLDL() { return ldl; }
    public float GetWeight() { return weight; }
    public float GetHeight() { return height; }
    public float GetBmi() { return bmi; }
    public Date GetDateRecorded() { return dateRecorded; }

    //Setters
    public void SetMemberId(int newMemberID) { memberID = newMemberID; }
    public void SetSystolicBP(int newSystolicBP) { systolicBP = newSystolicBP; }
    public void SetDiastolicBP(int newDiastolicBP) { diastolicBP = newDiastolicBP; }
    public void SetLDL(int newLdl) { ldl = newLdl; }
    public void SetWeight(float newWeight) { weight = newWeight; }
    public void SetHeight(float newHeight) { height = newHeight; }
    public void SetBmi(float newBmi) { height = newBmi; }
    public void SetDateRecorded(Date newDateRecorded) { dateRecorded = newDateRecorded;}
}
