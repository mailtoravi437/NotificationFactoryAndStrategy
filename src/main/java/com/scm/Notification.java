package com.scm;

public interface Notification {
    void send();
    void setMessageStrategy(MessageStrategy messageStrategy);
}
