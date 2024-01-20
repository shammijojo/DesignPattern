package MediatorPattern.WithMediatorPattern;

public class Switch {

    private Mediator mediator;

    public Switch(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }



}
