package basic.java.designpatterns.creational.singleton;

/**
 * 
 * The SINGLETON is a class that is used to make sure that there can be one and
 * only one instance of a class
 * 
 */
public class SingleObject {

    // create an object of SingleObject
     private static SingleObject instance;

    // make the constructor private so that this class cannot be instantiated
    private SingleObject() {
    }
    
    public static SingleObject getInstance() {
       if(instance == null){
           return instance = new SingleObject();
       }
       return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
