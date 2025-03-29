package decoratorPattern.decoratorPack;

import decoratorPattern.coffee.ICoffee;

// Step 4: Create specific decorators (e.g., Milk, Sugar)
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.5;
    }
}
