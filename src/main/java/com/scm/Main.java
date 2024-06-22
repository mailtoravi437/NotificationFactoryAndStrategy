package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notification emailNotification = NotificationFactory.createNotification("email","mailtoravi437@gmail.com","Hello");
        MessageStrategy messageStrategy = new EveningSendingStrategy();
        emailNotification.setMessageStrategy(messageStrategy);
        emailNotification.send();
    }
}