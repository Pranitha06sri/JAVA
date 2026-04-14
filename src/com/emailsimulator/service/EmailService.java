package com.emailsimulator.service;

import com.emailsimulator.model.Email;

public abstract class EmailService {

    public abstract void sendEmail(Email email);

    public abstract void viewInbox();

    public abstract void deleteAllEmails();
}
