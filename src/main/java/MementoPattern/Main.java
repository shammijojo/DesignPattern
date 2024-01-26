package MementoPattern;

public class Main {

    public static void main(String[] args) {
        ConfigurationManagerOriginator originator = new ConfigurationManagerOriginator();
        originator.setTimeout(1000);
        ConfigurationManagerMemento memento = originator.saveToMemento();
        System.out.println("Current timeout : "+originator.timeout);

        originator.setTimeout(2000);
        ConfigurationManagerMemento memento_1 = originator.saveToMemento();
        System.out.println("Current timeout : "+originator.timeout);

        ConfigurationManagerCareTaker careTaker = new ConfigurationManagerCareTaker();
        careTaker.add(memento);
       // careTaker.add(memento_1);

        originator.restoreFromMemento(careTaker.undo());
        System.out.println("Current timeout after undo: "+originator.timeout);

    }






}
