package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;
import org.postgresql.util.PGInterval;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="Books")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingID;

    @Column(name="admin_id")
    private int adminID;

    @Column(name="bld_num")
    private int bldNum;

    @Column(name="room_num")
    private int roomNum;

    @Column(name="booking_date")
    private Date bookingDate;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    public Booking() {}

    public Booking(int adminID, int bldNum, int roomNum, Date bookingDate, PGInterval duration, Timestamp startTime, Timestamp endTime) {
        this.adminID = adminID;
        this.bldNum = bldNum;
        this.roomNum = roomNum;
        this.bookingDate = bookingDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //Getters
    public int GetBookingID() { return bookingID; }
    public int GetAdminID() { return adminID; }
    public int GetBldNum() { return bldNum; }
    public int GetRoomNum() { return roomNum; }
    public Date GetBookingDate() { return bookingDate; }
    public Timestamp GetStartTime() { return startTime; }
    public Timestamp GetEndTime() { return endTime; }

    //Setters
    public void SetBldNum(int newBldNum) { bldNum = newBldNum; }
    public void SetRoomNum(int newRoomNum) { bldNum = newRoomNum; }
    public void SetBookingDate(Date newBookingDate) { bookingDate = newBookingDate; }
    public void SetStartTime(Timestamp newStartTime) { startTime = newStartTime; }
    public void SetEndTime(Timestamp newEndTime) { endTime = newEndTime; }
}
