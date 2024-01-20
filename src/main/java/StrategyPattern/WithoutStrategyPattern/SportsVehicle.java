package StrategyPattern.WithoutStrategyPattern;

public class SportsVehicle extends Vehicle{

    //Duplicate code
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
