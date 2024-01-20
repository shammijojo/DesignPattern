package StrategyPattern.WithoutStrategyPattern;

public class RacingVehicle extends Vehicle{

    //Duplicate code
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
