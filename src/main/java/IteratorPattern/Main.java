package IteratorPattern;


/**
 * we are creating a notification bar in our application that displays all the notifications
 * which are held in a notification collection. NotificationCollection provides an iterator to
 * iterate over its elements without exposing how it has implemented the collection (array in this case)
 * to the Client (NotificationBar)
 */
public class Main {


    public static void main(String[] args) {
        Collection collection = new NotificationCollection();
        collection.addItem(new Notification("Alert_1"));
        collection.addItem(new Notification("Alert_2"));
        collection.addItem(new Notification("Alert_3"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(((Notification)iterator.next()).getNotification());
        }

    }

}
