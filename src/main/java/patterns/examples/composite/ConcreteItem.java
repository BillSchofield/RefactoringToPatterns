package patterns.examples.composite;

public class ConcreteItem implements Item{
    private final String name;

    public ConcreteItem(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
