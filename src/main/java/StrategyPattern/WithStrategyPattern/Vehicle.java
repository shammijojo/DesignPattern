package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
