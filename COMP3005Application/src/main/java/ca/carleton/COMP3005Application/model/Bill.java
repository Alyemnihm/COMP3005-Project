package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billNum;

    @Column(name="admin_id")
    private int adminID;

    @Column(name="member_id")
    private int memberID;

    @Column(name="member_first_name")
    private String memberFirstName;

    @Column(name="member_last_name")
    private String memberLastName;

    @Column(name="member_email")
    private String memberEmail;

    @Column(name="phone_num")
    private int memberPhoneNum;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="province")
    private String province;

    @Column(name="postal_code")
    private String postalCode;

    @Column(name="invoice_date")
    private Date invoiceDate;

    @Column(name="total_amt")
    private float totalAmt;

    @Column(name="card_num")
    private String cardNum;

    @Column(name="card_type")
    private String cardType;

    @Column(name="card_cvv")
    private String cardCVV;

    @Column(name="card_first_name")
    private String cardFirstName;

    @Column(name="card_last_name")
    private String cardLastName;

    public Bill() {}

    public Bill(int adminID, int memberID, String memberFirstName, String memberLastName, String memberEmail,
                int memberPhoneNum, String street, String city, String province, String postalCode, Date invoiceDate,
                float totalAmt, String cardNum, String cardType, String cardCVV, String cardFirstName, String cardLastName) {

        this.adminID = adminID;
        this.memberID = memberID;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberEmail = memberEmail;
        this.memberPhoneNum = memberPhoneNum;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.invoiceDate = invoiceDate;
        this.totalAmt = totalAmt;
        this.cardNum = cardNum;
        this.cardCVV = cardCVV;
        this.cardType= cardType;
        this.cardFirstName = cardFirstName;
        this.cardLastName = cardLastName;
    }

    //Getters
    public int GetBillNum() { return billNum; }
    public int GetAdminID() { return adminID; }
    public String GetMemberFirstName() { return memberFirstName; }
    public String GetMemberLastName() { return memberLastName; }
    public String GetMemberEmail() { return memberEmail; }
    public int GetMemberPhoneNum() { return memberPhoneNum; }
    public String GetStreet() { return street; }
    public String GetCity() { return city; }
    public String GetProvince() { return province; }
    public String GetPostalCode() { return postalCode; }
    public Date GetInvoiceDate() { return invoiceDate; }
    public float GetTotalAmt() { return totalAmt; }
    public String GetCardNum() { return cardNum; }
    public String GetCardType() { return cardType; }
    public String GetCardCVV() { return cardCVV; }
    public String GetCardFirstName() { return cardFirstName; }
    public String GetCardLastName() { return cardLastName; }

}
