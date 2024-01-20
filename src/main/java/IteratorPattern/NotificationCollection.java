package IteratorPattern;

import java.util.ArrayList;
import java.util.List;


public class NotificationCollection implements Collection {

    private List<Notification> notifications;

    public NotificationCollection() {
        this.notifications = new ArrayList<>();
    }

    @Override
    public void addItem(Object notification) {
        notifications.add((Notification) notification);
    }


    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
