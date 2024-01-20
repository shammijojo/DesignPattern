package AdapterPattern.adaptee;

public class WeighingMachineInPoundsImpl implements WeighingMachine {
    @Override
    public Double getWeightInPounds() {
        return 100d;
    }
}
