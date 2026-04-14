package com.emailsimulator.model;

public class OfficialEmail extends Email {

    public OfficialEmail(String sender, String receiver, String subject, String body) {
        super(sender, receiver, subject, body);
    }

    @Override
    public String formatEmail() {
        return "[Official]\n" + super.formatEmail();
    }
}