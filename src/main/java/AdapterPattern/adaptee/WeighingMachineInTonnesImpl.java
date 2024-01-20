package AdapterPattern.adaptee;

public class WeighingMachineInTonnesImpl implements  WeighingMachine{
    @Override
    public Double getWeightInPounds() {
        return 10d;
    }
}
