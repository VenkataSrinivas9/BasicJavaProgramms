package basic.java.designpatterns.creational.prototype;

public class Coke
        extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
