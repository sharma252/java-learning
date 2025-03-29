package decoratorPattern.coffee;

// Step 2: Create a Concrete Coffee class
public class SimpleCoffee implements ICoffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
