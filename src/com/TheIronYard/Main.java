package com.TheIronYard;

public class Main {

    public static void main(String[] args) {
	EmailNotification email = new EmailNotification("Email: This is the subject line", "Email: This is the body area",
            "Email: This is the recipient area", "Email: This is the provider area");

	email.showStatus();

	/* In order to System.out.println the messageNotification, you will need to call the method first which is
	email.messageProtected(); and it will display the override message I have set there */
	email.messageProtected();
	System.out.println(email.messageNotification);

	TextNotification text = new TextNotification("Text: Great Subject Line", "Text: Insert some funny story here",
            "Text: Who sent this?", "Text: Provider area");
	text.showStatus();

//	Object emailNotificationClone = emailNotification.clone();

    }
}
