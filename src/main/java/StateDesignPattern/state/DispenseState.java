package StateDesignPattern.state;

import StateDesignPattern.VendingMachine;
import StateDesignPattern.constant.Coin;
import StateDesignPattern.dto.Item;

public class DispenseState implements State {

    public DispenseState() {
        System.out.println("Vending machine is in Dispense state");
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        throw new IllegalStateException("Not Allowed");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new IllegalStateException("Not Allowed");
    }

    @Override
    public void pressItemSelectionButton(VendingMachine vendingMachine) {
        throw new IllegalStateException("Not Allowed");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, Item item){
        throw new IllegalStateException("Not Allowed");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Item dispensed successfully");
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void pressCancelButton(VendingMachine vendingMachine) {
        throw new IllegalStateException("Not Allowed");
    }
}
