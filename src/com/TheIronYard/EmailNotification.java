package com.TheIronYard;

public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "Calling in the status from EmailNotification file";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void showStatus(){
        System.out.println(status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

//    // Okay...this is really throwing me off.
//    @Override
//    protected Object clone(){
//        EmailNotification();
//    }

    /*  You can give more access, not less
            If you set it to private, it will not work. */
    @Override
    public String messageProtected() {
        super.messageProtected();
        return messageNotification = "This protected message is displayed from EmailNotification.";
    }

    /* This method will override the base method with NoTransportException */
    @Override
    public void transport() throws NoTransportException {
        System.out.println(recipient);
        System.out.println(smtpProvider);
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreatedAt());
    }

}
