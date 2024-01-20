package StrategyPattern.WithStrategyPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();

        vehicle = new RacingVehicle();
        vehicle.drive();
    }

}
