package AdapterPattern;

import AdapterPattern.adaptee.WeighingMachineInPoundsImpl;
import AdapterPattern.adapter.WeighingMachineAdapter;
import AdapterPattern.adapter.WeighingMachineInKGAdapterImpl;

public class Client {

    public static void main(String[] args) {
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineInKGAdapterImpl(new WeighingMachineInPoundsImpl());
        System.out.println(weighingMachineAdapter.getWeightIhInKG());
    }
}
