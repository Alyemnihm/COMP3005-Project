package ca.carleton.COMP3005Application.app;

import ca.carleton.COMP3005Application.model.*;
import ca.carleton.COMP3005Application.service.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Establish connection to database
         *
         * NOTE: You will need to update these variables in hibernate.cfg.xml according to your own database if you decide to run the program on your machine:
         *      <property name="hibernate.connection.url">jdbc:postgresql://localhost:<PORT NUMBER>/<DATABASE NAME></property>
         *      <property name="hibernate.connection.username"><POSTGRES USERNAME></property>
         *      <property name="hibernate.connection.password"><POSTGRES PASSWORD></property>
         */
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Achievement.class)
                .addAnnotatedClass(Admin.class)
                .addAnnotatedClass(Attends.class)
                .addAnnotatedClass(Bill.class)
                .addAnnotatedClass(Booking.class)
                .addAnnotatedClass(Day.class)
                .addAnnotatedClass(FitnessEquipment.class)
                .addAnnotatedClass(Goal.class)
                .addAnnotatedClass(GroupFitnessClass.class)
                .addAnnotatedClass(HealthMetric.class)
                .addAnnotatedClass(Member.class)
                .addAnnotatedClass(PersonalTrainingSession.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Routine.class)
                .addAnnotatedClass(Trainer.class)
                .buildSessionFactory();

        Scanner scanner = new Scanner(System.in);
        String userType;
        String userEmail;
        String userPassword;

        System.out.println("     Welcome to the Health and Fitness Club Management System!");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("\n");

        //Determine whether the use is a member, trainer or admin
        System.out.println("Select one of the following to proceed to login: (Enter the number of the option)");
        System.out.println("1. Member");
        System.out.println("2. Trainer");
        System.out.println("3. Admin");
        System.out.print("> ");
        userType = scanner.nextLine();
        System.out.print("\n"); System.out.print("\n");


        if(Objects.equals(userType, "1")) {
            String existingMember;
            System.out.println("Are you an existing member? (y/n) > ");
            existingMember = scanner.nextLine();
            System.out.print("\n");

            MemberService memberService = new MemberService(factory);

            if(Objects.equals(existingMember, "y")) {
                //Get email and password
                System.out.print("Enter email: \t>");
                userEmail = scanner.nextLine();
                System.out.print("Enter password: \t>");
                userPassword = scanner.nextLine();
                System.out.print("\n");

                if(memberService.login(userEmail, userPassword)) {
                    memberService.memberHub();
                } else {
                    System.out.println("Cannot find member. Incorrect email or password inputted.");
                }
            }
            else if(Objects.equals(existingMember, "n")) {
                memberService.createMember();
                memberService.memberHub();
            }
            else {
                System.out.println("Input not recognized.");
            }

        }

        else if(Objects.equals(userType, "2")) {
            //Get email and password
            System.out.print("Enter email: \t>");
            userEmail = scanner.nextLine();
            System.out.print("Enter password: \t>");
            userPassword = scanner.nextLine();
            System.out.print("\n");

            TrainerService trainerService = new TrainerService(factory);

            if(trainerService.login(userEmail, userPassword)) {
                trainerService.trainerHub();
            } else {
                System.out.println("Cannot find trainer. Incorrect email or password inputted.");
            }
        }

        else if(Objects.equals(userType, "3")) {
            //Get email and password
            System.out.print("Enter email: \t>");
            userEmail = scanner.nextLine();
            System.out.print("Enter password: \t>");
            userPassword = scanner.nextLine();
            System.out.print("\n");

            AdminService adminService = new AdminService(factory);

            if(adminService.login(userEmail, userPassword)) {
                adminService.adminHub();
            } else {
                System.out.println("Cannot find admin. Incorrect email or password inputted.");
            }
        }

        else {
            System.out.println("Input not recognized.");
        }

    }
}