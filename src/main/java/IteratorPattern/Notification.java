package IteratorPattern;

import lombok.Data;

@Data
public class Notification {

    private String notification;

    public Notification(String notification) {
        this.notification = notification;
    }
}
