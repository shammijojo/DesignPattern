package FacadePattern;

import FacadePattern.facade.HouseKeeper;
import FacadePattern.facade.HouseKeeperImpl;

public class Client {

    public static void main(String[] args) {
        HouseKeeper houseKeeper = new HouseKeeperImpl();
        System.out.println(houseKeeper.getVegMenu());
        System.out.println(houseKeeper.getNonVegMenu());
        System.out.println(houseKeeper.getVegAndNonVegMenu());
    }

}
