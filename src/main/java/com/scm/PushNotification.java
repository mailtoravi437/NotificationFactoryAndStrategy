package com.scm;

public class PushNotification implements Notification{

    private final String recieverId;
    private final String message;
    PushNotification(String recieverId,String message){
        this.recieverId = recieverId;
        this.message = message;
    }


    @Override
    public void send() {
        System.out.println("Sending message using Push Notification"+this.message);
    }

    @Override
    public void setMessageStrategy(MessageStrategy messageStrategy) {
        System.out.println("Sending message");
    }
}
