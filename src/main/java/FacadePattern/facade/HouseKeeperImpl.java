package FacadePattern.facade;

import FacadePattern.NonVegRestaurant;
import FacadePattern.VegAndNonVegRestaurant;
import FacadePattern.VegRestaurant;

import java.util.List;

public class HouseKeeperImpl implements HouseKeeper {

    private VegRestaurant vegRestaurant;
    private NonVegRestaurant nonVegRestaurant;
    private VegAndNonVegRestaurant vegAndNonVegRestaurant;

    public HouseKeeperImpl() {
        this.vegRestaurant = new VegRestaurant();
        this.nonVegRestaurant = new NonVegRestaurant();
        this.vegAndNonVegRestaurant = new VegAndNonVegRestaurant();
    }

    @Override
    public List<String> getVegMenu() {
        return vegRestaurant.getMenu();
    }

    @Override
    public List<String> getNonVegMenu() {
        return nonVegRestaurant.getMenu();
    }

    @Override
    public List<String> getVegAndNonVegMenu() {
        return vegAndNonVegRestaurant.getMenu();
    }
}
