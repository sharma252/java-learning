
import decoratorPattern.coffee.ICoffee;
import decoratorPattern.coffee.SimpleCoffee;
import decoratorPattern.decoratorPack.MilkDecorator;
import decoratorPattern.decoratorPack.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        //Factory pattern implementation:
//        System.out.println("Factory Pattern in Java (Factory Method Pattern)");
//
//        ShapeFactory shapeFactoryObj = new ShapeFactory();
//
//        IShape circleShape = shapeFactoryObj.getShape("Circle");
//        circleShape.draw();
//
//        IShape squareShape = shapeFactoryObj.getShape("Square");
//        squareShape.draw();

        //Decorator pattern implementation:
        ICoffee coffee = new SimpleCoffee();
        System.out.println("Coffee: "+ coffee.getDescription() + "\n Cost: " + coffee.getPrice());

        ICoffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Coffee: " + milkCoffee.getDescription() + "\n Cost: " + milkCoffee.getPrice());

        ICoffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println("Coffee: " + sugarCoffee.getDescription() + "\n Cost: " + sugarCoffee.getPrice());

    }
}