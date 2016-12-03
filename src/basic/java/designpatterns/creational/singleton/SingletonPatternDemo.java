package basic.java.designpatterns.creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        try {
            // Get the only object available
            SingleObject object1 = SingleObject.getInstance();

            // show the message
            object1.showMessage();
        }
        catch (Exception e) {
            System.out.println("First object is not created");
        }

        try {
            // Get the only object available - throws error
            SingleObject object2 = SingleObject.getInstance();

            // show the message
            object2.showMessage();
        }
        catch (Exception e) {
            System.out.println("Second object is not created");
        }

        try {
            // Get the only object available - throws error
            SingleObject object3 = SingleObject.getInstance();

            // show the message
            object3.showMessage();
        }
        catch (Exception e) {
            System.out.println("Thrid object is not created");
        }

//        try {
//            // Get the only object available - throws error
//            SingleObject object4 = new SingleObject();
//
//            // show the message
//            object4.showMessage();
//        }
//        catch (Exception e) {
//            System.out.println("object can not be created");
//        }
        
    }

}
