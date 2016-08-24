package patterns.examples.abstract_factory;

public class BookFactory implements MediaItemFactory {

    @Override
    public MediaItem create() {
        return new Book();
    }
}
