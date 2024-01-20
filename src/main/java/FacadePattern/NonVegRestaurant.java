package FacadePattern;

import java.util.Arrays;
import java.util.List;

public class NonVegRestaurant implements Restaurant{
    @Override
    public List<String> getMenu() {
        return Arrays.asList("Chicken","Mutton");
    }
}
