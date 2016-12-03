package basic.java.designpatterns.creational.factory;

/**
 * 
 * The FACTORY is a class that decides which of these subclasses to return
 * depending on the arguments user give it. The one it returns doesn't matter
 * to the programmer since they all have the same methods but different
 * implementations.
 * 
 */
public class ShapeFactory {

    // use getShape method to get object of type shape
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

}
