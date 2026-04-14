package com.emailsimulator.service;

import com.emailsimulator.model.Email;
import com.emailsimulator.util.FileHandler;

public class EmailServiceImpl extends EmailService {

    @Override
    public void sendEmail(Email email) {
        FileHandler.writeEmail(email.formatEmail());
        System.out.println("Email Sent!");
    }

    @Override
    public void viewInbox() {
        System.out.println("\nInbox:");
        FileHandler.readEmails();
    }

    @Override
    public void deleteAllEmails() {
        FileHandler.clearInbox();
        System.out.println("Inbox Cleared!");
    }
}
