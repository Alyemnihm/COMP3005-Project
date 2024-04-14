package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="phone_num")
    private String phoneNum;

    @Column(name="dob")
    private Date dateOfBirth;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="province")
    private String province;

    @Column(name="postal_code")
    private String postalCode;

    @Column(name="join_date")
    private Date joinDate;

    @Column(name="password")
    private String password;

    public Member() {
        this.firstName = "DefaultFirstName";
        this.lastName = "DefaultLastName";
        this.email = "firstname.lastname@gmail.com";
        this.phoneNum = "0000000000";
        this.dateOfBirth = new Date(1999,1,1);
        this.street = "123 Imaginary Lane";
        this.city = "Fictional";
        this.province = "Non-existent";
        this.postalCode = "A1B2C3";
        this.joinDate = new Date(System.currentTimeMillis());
        this.password = "password";
    }

    public Member(String firstName, String lastName, String email, String phoneNum, Date dateOfBirth, String street,
                  String city, String province, String postalCode, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.joinDate = new Date(System.currentTimeMillis());
        this.password = password;
    }

    //Getters
    public int GetID() { return id; }
    public String GetFirstName() { return firstName; }
    public String GetLastName() { return lastName; }
    public String GetEmail() { return email; }
    public String GetPhoneNum() { return phoneNum; }
    public Date GetDateOfBirth() { return dateOfBirth; }
    public String GetStreet() { return street; }
    public String GetCity() { return city; }
    public String GetProvince() { return province; }
    public String GetPostalCode() { return postalCode; }
    public Date GetJoinDate() { return joinDate; }
    public String GetPassword() { return password; }

    //Setters
    public void SetFirstName(String newFirstName) { firstName = newFirstName; }
    public void SetLastName(String newLastName) { lastName = newLastName; }
    public void SetEmail(String newEmail) { email = newEmail; }
    public void SetPhoneNum(String newPhoneNum) { phoneNum = newPhoneNum; }
    public void SetDateOfBirth(Date newDOB) { dateOfBirth = newDOB; }
    public void SetStreet(String newStreet) { street = newStreet; }
    public void SetCity(String newCity) { city = newCity; }
    public void SetProvince(String newProvince) { province = newProvince; }
    public void SetPostalCode(String newPostalCode) { postalCode = newPostalCode; }
    public void SetJoinDate(Date newJoinDate) { joinDate = newJoinDate; }
    public void SetPassword(String newPassword) { password = newPassword; }
}
