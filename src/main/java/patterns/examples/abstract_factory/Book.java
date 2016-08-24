package patterns.examples.abstract_factory;

public class Book implements MediaItem {
    @Override
    public void print() {
        System.out.println("I am a Book");
    }
}
