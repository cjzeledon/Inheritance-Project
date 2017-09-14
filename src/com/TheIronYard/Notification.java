package com.TheIronYard;
import java.time.LocalDateTime;

public class Notification {
    //The Notifcation class has three private fields
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;
    String messageNotification;

    // This is your constructor Notification
    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.status = "Here is the default status from Notification";

        //This will store the createdAt the current time automatically for you
        createdAt = LocalDateTime.now();
    }

    // Provide a getter method for createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Provide a getter method for subject
    public String getSubject() {
        return subject;
    }

    // Provide a getter method for body
    public String getBody() {
        return body;
    }

    // If you tried to set messageProtected as private instead of protected, then the TextNotification file will not
    // be able to retrieve that message. It is not allowed to get that information.
    protected String messageProtected(){
       return messageNotification = "This protected message is displayed from Notification.";
    }

    public void showStatus(){
        System.out.println(status);
    }


    // We need to handle the exception when something happen
    public void transport() throws NoTransportException{
    }



}

