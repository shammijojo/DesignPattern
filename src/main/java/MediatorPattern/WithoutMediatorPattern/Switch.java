package MediatorPattern.WithoutMediatorPattern;

public class Switch {

    Fan fan;

    public Switch(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        System.out.println("Switch pressed");
        if(fan.getIsOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

}
