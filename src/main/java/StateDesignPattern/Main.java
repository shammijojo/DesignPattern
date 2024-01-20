package StateDesignPattern;

import StateDesignPattern.constant.Coin;
import StateDesignPattern.state.IdleState;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.initialiseInventory();
        //vendingMachine.displayInventory();

        vendingMachine.getState().pressInsertCoinButton(vendingMachine);
        vendingMachine.getState().insertCoin(vendingMachine, Coin.HUNDRED);
        vendingMachine.getState().pressItemSelectionButton(vendingMachine);
        vendingMachine.getState().selectProduct(vendingMachine, vendingMachine.getInventory().get(0));
        vendingMachine.getState().dispenseProduct(vendingMachine);
    }



}
