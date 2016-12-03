package basic.java.designpatterns.creational.abstractfactory;

/**
 * 
 * The ABSTRACT FACTORY is a factory object that returns one of several
 * factories. The actual class names are hidden in the factory.
 * 
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}
