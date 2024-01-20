package DecoratorPattern.decorator;

import DecoratorPattern.BasePizza;

public class CheeseDecorator extends ToppingsDecorator{

    private BasePizza basePizza;

    public CheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+10;
    }
}
