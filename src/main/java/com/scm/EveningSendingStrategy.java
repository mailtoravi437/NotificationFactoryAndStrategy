package com.scm;

public class EveningSendingStrategy implements MessageStrategy{
    @Override
    public void sendMessage() {
        System.out.println("Evening message sending");
    }
}
