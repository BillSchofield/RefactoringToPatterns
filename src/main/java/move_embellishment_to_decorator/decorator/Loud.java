package move_embellishment_to_decorator.decorator;

// This is what decorators look like
public class Loud implements Speaker{
    private final Speaker speaker;

    public Loud(Speaker speaker) {
        this.speaker = speaker;
    }

    public String speak() {
        return speaker.speak().toUpperCase();
    }
}
