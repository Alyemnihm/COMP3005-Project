package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Trainer")
public class Trainer {

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

    @Column(name="hourly_rate")
    private float hourlyRate;

    public Trainer() {
        this.firstName = "DefaultFirstName";
        this.lastName = "DefaultLastName";
        this.email = "firstname.lastname@HandRClub.ca";
        this.phoneNum = "0000000000";
        this.password = "password";
        this.hourlyRate = 15.5F;
    }

    public Trainer(String firstName, String lastName, String email, String phoneNum, String password, float hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
        this.hourlyRate = hourlyRate;
    }

    //Getters
    public int GetID() { return id; }
    public String GetFirstName() { return firstName; }
    public String GetLastName() { return lastName; }
    public String GetEmail() { return email; }
    public String GetPassword() { return password; }
    public float GetHourly() { return hourlyRate; }

    //Setters
    public void SetFirstName(String newFirstName) { firstName = newFirstName; }
    public void SetLastName(String newLastName) { lastName = newLastName; }
    public void SetEmail(String newEmail) { email = newEmail; }
    public void SetPhoneNum(String newPhoneNum) { phoneNum = newPhoneNum; }
    public void SetPassword(String newPassword) { password = newPassword; }
    public void SetHourlyRate(float newHourlyRate) { hourlyRate = newHourlyRate; }
}
