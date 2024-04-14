package ca.carleton.COMP3005Application.service;

import ca.carleton.COMP3005Application.model.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.sql.Date;
import java.util.Objects;
import java.util.Scanner;

public class MemberService {

    private Session session;
    Member member;

    public MemberService(SessionFactory factory) {
        this.session = factory.getCurrentSession();
    }

    public boolean login(String email, String password) {
        session.beginTransaction();

        Query<Member> query = session.createQuery("from Member where email = :email and password = :password", Member.class);
        query.setParameter("email", email);
        query.setParameter("password", password);

        if(!query.list().isEmpty()) {
           member = query.uniqueResult();
            return true;
        }

        return false;
    }

    /*
     * Function: createMember
     * Inserts a new member record into the members table.
     *
     * @params: None
     * @return: None
     */
    public void createMember() {
        Scanner scanner = new Scanner(System.in);

        //variables needed from user
        String firstName;
        String lastName;
        String email;
        String phoneNum;
        String dob;
        String street;
        String city;
        String province;
        String postal_code;
        String password;

        //ask user for information
        System.out.print("Enter your first name: >");
        firstName = scanner.nextLine();

        System.out.print("Enter your Last name: >");
        lastName = scanner.nextLine();

        System.out.print("Enter your email: >");
        email = scanner.nextLine();

        System.out.print("Enter your phone number: >");
        phoneNum = scanner.nextLine();

        System.out.print("Enter your date of birth (yyyy-mm-dd): >");
        dob = scanner.nextLine();

        System.out.print("Enter your street address: >");
        street = scanner.nextLine();

        System.out.print("Enter your city: >");
        city = scanner.nextLine();

        System.out.print("Enter your province: >");
        province = scanner.nextLine();

        System.out.print("Enter your postal code: >");
        postal_code = scanner.nextLine();

        System.out.print("Enter your password: >");
        password = scanner.nextLine();

        //add member to database
        session.beginTransaction();
        Member newMember = new Member(firstName, lastName, email, phoneNum, Date.valueOf(dob), street, city, province, postal_code, password);
        session.save(newMember);
        session.getTransaction().commit();

        //assign to member variable (log user in)
        member = newMember;
        scanner.close();
    }

    public void memberHub() {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("--------------------------------------------------------");
        System.out.println("     Welcome " + member.GetFirstName() + "!");
        System.out.println("--------------------------------------------------------");

        System.out.print("\n");
        String option;
        String choice;

        while(keepRunning) {

            System.out.println("--------------------------------------------------------");
            System.out.println("                      MEMBER HUB");
            System.out.println("--------------------------------------------------------");

            System.out.println("What would you like to do? (Enter the number of the option)");
            System.out.println("1. View profile");
            System.out.println("2. View dashboard");
            System.out.println("3. Schedule session or classes");
            System.out.print("\n");

            System.out.print("> ");
            option = scanner.nextLine();

            if (Objects.equals(option, "1")) {

            } else if (Objects.equals(option, "2")) {

            } else if (Objects.equals(option, "3")) {

            } else {
                System.out.println("Unrecognized input. Please choose one of the listed options.");
            }

            //Ask user if they'd like to perform another operation
            System.out.println("Would you like to perform another operation? (y/n)");
            choice = scanner.nextLine();
            if(Objects.equals(choice, "y")) { //if yes, continue while loop
                System.out.print("\n");
                continue;
            }
            else if(Objects.equals(choice, "n")) { //if no, exit program
                System.out.print("\n");
                System.out.println("Thank you for using the system, you will be logged out. Have a great day!");
                scanner.close();
                keepRunning = false;
            }
            else { //if user inputted any other input, exit program
                System.out.print("\n");
                System.out.println("Unrecognized input. Terminating program.");
                scanner.close();
                keepRunning = false;
            }
        }
    }

    public void manageProfile() {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.print("\n");
        String option;
        String choice;

        while (keepRunning) {

            System.out.println("--------------------------------------------------------");
            System.out.println("                  PROFILE MANAGEMENT");
            System.out.println("--------------------------------------------------------");

            System.out.print("\n");
            System.out.print("\n");

            System.out.println("+++++++++++++++++++++");
            System.out.println("Profile Details:");
            System.out.println("+++++++++++++++++++++");
            System.out.print("\n");


        }
    }
}
