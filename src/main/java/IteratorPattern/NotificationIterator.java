package IteratorPattern;

import CommandPattern.light.Light;

import java.util.List;

public class NotificationIterator implements Iterator {

    private List<Notification> notifications;
    private int currentPosition=0;

    public NotificationIterator(List<Notification> notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition>=notifications.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object object = notifications.get(currentPosition);
        currentPosition++;
        return object;
    }
}
