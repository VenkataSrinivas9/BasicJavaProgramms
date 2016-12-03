package basic.java.designpatterns.creational.builder;

public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
    public abstract float price();
}

