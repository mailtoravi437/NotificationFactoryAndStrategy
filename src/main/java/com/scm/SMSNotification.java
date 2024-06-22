package com.scm;

public class SMSNotification implements Notification{

    private final String mobileNumber;
    private final String message;

    SMSNotification(String mobileNumber,String message){
        this.message = message;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending message using Mobile number"+this.message);
    }

    @Override
    public void setMessageStrategy(MessageStrategy messageStrategy) {

        System.out.println("Sending message 4");
    }
}
