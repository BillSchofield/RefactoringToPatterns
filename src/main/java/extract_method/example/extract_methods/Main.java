package extract_method.example.extract_methods;


public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor(10.0f);
        actor.changeHitPoints(-11.0f);
        actor.reportStatus();
    }
}
