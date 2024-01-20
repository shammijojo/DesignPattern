package FacadePattern;

import java.util.Arrays;
import java.util.List;

public class VegAndNonVegRestaurant implements Restaurant{
    @Override
    public List<String> getMenu() {
        return Arrays.asList("Chicken","Paneer");
    }
}
