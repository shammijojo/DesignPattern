package StateDesignPattern;

import StateDesignPattern.dto.Item;
import StateDesignPattern.state.IdleState;
import StateDesignPattern.state.State;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {

     private State state;
     private List<Item> inventory;

     public VendingMachine() {
          state = new IdleState();
          inventory = new ArrayList<>();
     }

     public void initialiseInventory() {
          Item i1 = new Item("PEPSI",101,10);
          Item i2 = new Item("SODA",102,20);
          Item i3 = new Item("MAZA",103,30);
          inventory.add(i1);
          inventory.add(i2);
          inventory.add(i3);
     }

     public void displayInventory() {
          for(Item item : inventory) {
               System.out.println(item.getName()+" "+item.getCode()+ " "+item.getPrice());
          }
          System.out.println();
     }


}
