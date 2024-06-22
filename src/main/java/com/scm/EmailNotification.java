package com.scm;

import java.util.logging.Logger;

public class EmailNotification implements Notification{

    private final String email;
    private final String message;

    private MessageStrategy messageStrategy;
    EmailNotification(String email,String message){
        this.email = email;
        this.message = message;
    }

    public void setMessageStrategy(MessageStrategy messageStrategy){
        this.messageStrategy = messageStrategy;
    }
    @Override
    public void send() {
        System.out.println("Sending SMS using email"+this.message);
        messageStrategy.sendMessage();
    }
}
