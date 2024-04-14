package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;
import org.postgresql.util.PGInterval;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "GroupFitnessClass")
public class GroupFitnessClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;

    @Column(name="trainer_id")
    private int trianerId;

    @Column(name="session_date")
    private Date sessionDate;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    public GroupFitnessClass() {
        this.trianerId = 0;
        this.sessionDate = new Date(1990, 1,1);
        this.startTime = Timestamp.valueOf("1990-01-01 00:00:00");
        this.endTime = Timestamp.valueOf("1990-01-01 01:00:00");
    }

    public GroupFitnessClass(int trainer_id, Date session_date, PGInterval duration, Timestamp startTime, Timestamp endTime) {
        this.trianerId = trainer_id;
        this.sessionDate = session_date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //Getters
    public int GetBookingID() { return booking_id; }
    public int GetTrainerId() { return trianerId; }
    public Date GetSessionDate() { return sessionDate; }
    public Timestamp GetStartTime() { return startTime; }
    public Timestamp GetEndTime() { return endTime; }

    //Setters
    public void SetTrainerID(int newTrainerID) { trianerId = newTrainerID; }
    public void SetSessionDate(Date newSessionDate) { sessionDate = newSessionDate; }
    public void SetStartTime(Timestamp newStartTime) { startTime = newStartTime; }
    public void SetEndTime(Timestamp newEndTime) { endTime = newEndTime; }
}
