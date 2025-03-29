package decoratorPattern.decoratorPack;

import decoratorPattern.coffee.ICoffee;

// Step 4: Create specific decorators (e.g., Milk, Sugar)
public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 1;
    }
}
