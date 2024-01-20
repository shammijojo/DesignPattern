package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
