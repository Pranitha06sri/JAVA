package com.emailsimulator.model;

public class PersonalEmail extends Email {

    public PersonalEmail(String sender, String receiver, String subject, String body) {
        super(sender, receiver, subject, body);
    }

    @Override
    public String formatEmail() {
        return "[Personal]\n" + super.formatEmail();
    }
}