package extract_method_and_class.example.extract_class;


public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor(10.0f);
        actor.changeHitPoints(new HitPointChange(-11.0f));
        actor.reportStatus();
    }
}
