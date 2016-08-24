package patterns.examples.composite;

public class Main {
    public static void main(String[] args) {
        Item wheels = new CompositeItem(
                new ConcreteItem("Wheel"),
                new ConcreteItem("Wheel"),
                new ConcreteItem("Wheel"),
                new ConcreteItem("Wheel")
        );
        wheels.print();

        System.out.println("---------------");

        Item car = new CompositeItem(
                new ConcreteItem("Body"),
                wheels
        );

        car.print();
    }
}
