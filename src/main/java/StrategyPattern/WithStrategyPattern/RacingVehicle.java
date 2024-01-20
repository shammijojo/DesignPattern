package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.strategy.SpecialDriveStrategy;

public class RacingVehicle extends Vehicle{
    public RacingVehicle() {
        super(new SpecialDriveStrategy());
    }
}
