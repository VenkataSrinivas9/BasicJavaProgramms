package basic.java.designpatterns.creational.singleton;

/**
 * 
 * The SINGLETON is a class that is used to make sure that there can be one and
 * only one instance of a class
 * 
 */
public class SingleObject {

    static boolean instance_flag = false;

    // create an object of SingleObject
     private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be instantiated
    private SingleObject() {
    }

//    public static SingleObject getInstance() {
//        return instance;
//    }
    // Get the only object available
    // public static SingleObject getInstance() {
    // return instance;
    // }
    public static SingleObject getInstance() {
        if (!instance_flag) {
            instance_flag = true;
            return new SingleObject();
        }
        else {
            return null;
        }
    }

//    public void finalize() {
//        instance_flag = false;
//    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
