package com.scm;

public class NullNotification implements Notification{
    @Override
    public void send() {
        System.out.println("No message type notification is defined");
    }

    @Override
    public void setMessageStrategy(MessageStrategy messageStrategy) {
        System.out.println("Messgae strategy");
    }
}
