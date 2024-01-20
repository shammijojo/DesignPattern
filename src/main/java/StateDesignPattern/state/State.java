package StateDesignPattern.state;

import StateDesignPattern.VendingMachine;
import StateDesignPattern.constant.Coin;
import StateDesignPattern.dto.Item;

public interface State {

    void pressInsertCoinButton(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine, Coin coin);
    void pressItemSelectionButton(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine, Item item);
    void dispenseProduct(VendingMachine vendingMachine);
    void pressCancelButton(VendingMachine vendingMachine);

}
