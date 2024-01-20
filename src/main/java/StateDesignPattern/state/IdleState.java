package StateDesignPattern.state;

import StateDesignPattern.VendingMachine;
import StateDesignPattern.constant.Coin;
import StateDesignPattern.dto.Item;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Vending machine is in Idle state");
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setState(new HasMoneyState());
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
        throw new IllegalStateException("Not Allowed");
    }

    @Override
    public void pressCancelButton(VendingMachine vendingMachine) {
        System.out.println("Processing cancelled");
        vendingMachine.setState(new IdleState());
    }
}
