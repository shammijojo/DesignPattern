package FacadePattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VegRestaurant implements Restaurant {
    @Override
    public List<String> getMenu() {
        return Arrays.asList("Paneer","Mushroom");
    }
}
