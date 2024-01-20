package MediatorPattern.WithMediatorPattern;

public class Fan {
    private boolean isOn = false;
    private  Mediator mediator;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        System.out.println("Fan is switched on");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Fan is switched off");
        isOn = false;
    }
}
