package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
