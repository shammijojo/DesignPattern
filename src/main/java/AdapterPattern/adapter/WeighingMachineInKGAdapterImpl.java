package AdapterPattern.adapter;

import AdapterPattern.adaptee.WeighingMachine;

public class WeighingMachineInKGAdapterImpl implements WeighingMachineAdapter {

    WeighingMachine weighingMachine;

    public WeighingMachineInKGAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public Double getWeightIhInKG() {
        return weighingMachine.getWeightInPounds()*0.45;
    }
}
