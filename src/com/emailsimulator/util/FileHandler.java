package com.emailsimulator.util;

import java.io.*;

public class FileHandler {

    private static final String FILE_NAME = "src/emailsimulator/data/inbox.txt";

    public static void writeEmail(String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing email.");
        }
    }

    public static void readEmails() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Inbox empty.");
        }
    }

    public static void clearInbox() {
        try (PrintWriter pw = new PrintWriter(FILE_NAME)) {
            pw.close();
        } catch (Exception e) {
            System.out.println("Error clearing inbox.");
        }
    }
}