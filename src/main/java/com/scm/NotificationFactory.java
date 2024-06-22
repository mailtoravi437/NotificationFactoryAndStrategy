package com.scm;

public class NotificationFactory {

    public static Notification createNotification(String type,String reciever,String message){
        switch(type){
            case "email":
                return new EmailNotification(reciever,message);
            case "pushNotification":
                return new PushNotification(reciever,message);
            case "sms":
                return new SMSNotification(reciever,message);
            default:
                return new NullNotification();

        }

    }
}
