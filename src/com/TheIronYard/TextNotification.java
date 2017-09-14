package com.TheIronYard;

public class TextNotification extends Notification{
    // These are your instance variables.
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.messageProtected();
    }

    /* You set up the getters for recipient and smsProviders because in the initial fields, they are set to private.
    * Since they are private fields, no other class and methods can have access to them unless you set the getters for
    * two two fields. Once you do that, then other class and/or methods can have access to those fields. This is good
    * practice to always use the setters and getters at the beginning of programming so that you can decide if you want
    * other developers/users to have access to it or not. */
    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    /* Remember that when you set the method to void, you cannot return the code. In order to return the code, you will
    * need to take the void out in order to return the code. */
    public void showStatus(){
        System.out.println(status);
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(recipient);
        System.out.println(smsProvider);
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreatedAt());
    }
}
