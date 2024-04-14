package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

@Entity
@Table(name = "AdminStaff")
public class Admin {

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

    @Column(name="password")
    private String password;

    public Admin() {
        this.firstName = "DefaultFirstName";
        this.lastName = "DefaultLastName";
        this.email = "firstname.lastname@gmail.com";
        this.phoneNum = "0000000000";
        this.password = "password";
    }

    public Admin(String firstName, String lastName, String email, String phoneNum, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
    }

    //Getters
    public int GetID() { return id; }
    public String GetFirstName() { return firstName; }
    public String GetLastName() { return lastName; }
    public String GetEmail() { return email; }
    public String GetPhoneNum() { return phoneNum; }
    public String GetPassword() { return password; }

    //Setters
    public void SetFirstName(String newFirstName) { firstName = newFirstName; }
    public void SetLastName(String newLastName) { lastName = newLastName; }
    public void SetEmail(String newEmail) { email = newEmail; }
    public void SetPhoneNum(String newPhoneNum) { phoneNum = newPhoneNum; }
    public void SetPassword(String newPassword) { password = newPassword; }
}
