package decoratorPattern.decoratorPack;

import decoratorPattern.coffee.ICoffee;

// Step 3: Create an abstract decorator class that implements Coffee
public abstract class CoffeeDecorator implements ICoffee {
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}
