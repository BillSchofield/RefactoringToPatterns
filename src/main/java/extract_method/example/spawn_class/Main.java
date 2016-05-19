package extract_method.example.spawn_class;


public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor(10.0f);
        actor.changeHitPoints(new HitPointChange(-11.0f));
        actor.reportStatus();
    }
}
