package com.emailsimulator.main;

import java.util.Scanner;
import com.emailsimulator.model.*;
import com.emailsimulator.service.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmailService service = new EmailServiceImpl();

        while (true) {
            System.out.println("\n===== Email Simulator =====");
            System.out.println("1. Send Personal Email");
            System.out.println("2. Send Official Email");
            System.out.println("3. View Inbox");
            System.out.println("4. Delete Inbox");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2) {

                System.out.print("Sender: ");
                String sender = sc.nextLine();

                System.out.print("Receiver: ");
                String receiver = sc.nextLine();

                System.out.print("Subject: ");
                String subject = sc.nextLine();

                System.out.print("Message: ");
                String body = sc.nextLine();

                Email email;

                if (choice == 1) {
                    email = new PersonalEmail(sender, receiver, subject, body);
                } else {
                    email = new OfficialEmail(sender, receiver, subject, body);
                }

                service.sendEmail(email);
            }
            else if (choice == 3) {
                service.viewInbox();
            }
            else if (choice == 4) {
                service.deleteAllEmails();
            }
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
