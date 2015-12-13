package decorator_example;

// This is what decorators look like
public class Loud implements Speaker{
    private Speaker speaker;

    public Loud(Speaker speaker) {
        this.speaker = speaker;
    }

    public String speak() {
        return speaker.speak() + "!!!";
    }
}
