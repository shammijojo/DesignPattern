package StateDesignPattern.state;

import StateDesignPattern.VendingMachine;
import StateDesignPattern.constant.Coin;
import StateDesignPattern.dto.Item;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Vending machine is in HasMoney state");
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Please insert coin");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Coin inserted : "+coin);
    }

    @Override
    public void pressItemSelectionButton(VendingMachine vendingMachine) {
        System.out.println("Item selection button pressed");
        vendingMachine.setState(new ItemSelectionState());
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
