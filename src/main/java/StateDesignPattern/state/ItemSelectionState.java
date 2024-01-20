package StateDesignPattern.state;

import StateDesignPattern.VendingMachine;
import StateDesignPattern.constant.Coin;
import StateDesignPattern.dto.Item;

public class ItemSelectionState implements State {

    public ItemSelectionState() {
        System.out.println("Vending machine is in Item Selection state");
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
        System.out.println("Select the item");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, Item item) {
        System.out.println("Item selected : "+item);
        vendingMachine.setState(new DispenseState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        throw new IllegalStateException("Not Allowed");
    }

    @Override
    public void pressCancelButton(VendingMachine vendingMachine) {
        System.out.println("Processing cancelled");
        vendingMachine.setState(new IdleState());
    }
}
