package factoryPattern.shape;

// Step 2: Implement the Shape interface in different concrete classes
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn...");
    }
}

