package replace_constructors_with_creation_methods.after;

import java.util.ArrayList;
import java.util.List;

import static replace_constructors_with_creation_methods.after.Actor.*;

public class EnemySpawner {

    public List<Actor> spawn(){
        List<Actor> enemies = new ArrayList<Actor>();
        enemies.add(orc());
        enemies.add(warg().withRider(orc()));
        enemies.add(goblinBalloon());
        return enemies;
    }
}
