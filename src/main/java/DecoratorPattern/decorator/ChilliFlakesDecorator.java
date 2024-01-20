package DecoratorPattern.decorator;

import DecoratorPattern.BasePizza;

public class ChilliFlakesDecorator extends ToppingsDecorator{
    private BasePizza basePizza;

    public ChilliFlakesDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+20;
    }
}
