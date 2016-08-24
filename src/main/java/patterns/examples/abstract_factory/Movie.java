package patterns.examples.abstract_factory;

public class Movie implements MediaItem {
    @Override
    public void print() {
        System.out.println("I am a Movie");
    }
}
