package MediatorPattern.WithoutMediatorPattern;

public class Fan {

    private boolean isOn = false;

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
