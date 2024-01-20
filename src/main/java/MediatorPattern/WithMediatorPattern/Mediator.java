package MediatorPattern.WithMediatorPattern;

public class Mediator {

    private Fan fan;
    private Switch _switch;

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void set_switch(Switch _switch) {
        this._switch = _switch;
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
