package ca.carleton.COMP3005Application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Attends")
public class Attends {

    @Id
    @Column(name = "booking_id")
    private int bookingID;

    @Id
    @Column(name = "member_id")
    private int memberID;

    public Attends() { }

    public Attends(int bookingID, int memberID) {
        this.bookingID = bookingID;
        this.memberID = memberID;
    }

    //Getter
    public int GetBookingID() { return bookingID; }
    public int GetMemberId() { return memberID; }
}
