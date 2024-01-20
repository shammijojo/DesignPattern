package FacadePattern.facade;

import FacadePattern.Restaurant;

import java.util.List;

public interface HouseKeeper {

    List<String> getVegMenu();

    List<String> getNonVegMenu();

    List<String> getVegAndNonVegMenu();
}
