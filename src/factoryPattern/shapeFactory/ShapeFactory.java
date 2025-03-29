package factoryPattern.shapeFactory;

import factoryPattern.shape.Circle;
import factoryPattern.shape.Square;
import factoryPattern.shape.IShape;

// Step 3: Create a Factory class that returns different Shape objects
public class ShapeFactory {
    // Factory Method
    public IShape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}

