package DecoratorPattern;

import DecoratorPattern.decorator.CheeseDecorator;
import DecoratorPattern.decorator.ChilliFlakesDecorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Getting VegDelight with Cheese....");
        BasePizza basePizza = new CheeseDecorator(new VegDelight());
        System.out.println("Total cost: "+basePizza.getCost());

        System.out.println("Getting ChickenDelight with ChilliFlakes....");
        basePizza = new ChilliFlakesDecorator(new ChickenDelight());
        System.out.println("Total cost: "+basePizza.getCost());
    }
}
