package patterns.examples.abstract_factory;

public class MovieFactory implements MediaItemFactory{
    @Override
    public MediaItem create() {
        return new Movie();
    }
}
