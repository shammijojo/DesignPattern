package MediatorPattern.WithMediatorPattern;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Fan fan = new Fan(mediator);
        Switch s = new Switch(mediator);

        mediator.set_switch(s);
        mediator.setFan(fan);

        s.press();
        s.press();
    }

}
