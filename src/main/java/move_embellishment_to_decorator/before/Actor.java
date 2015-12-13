package move_embellishment_to_decorator.before;

import move_embellishment_to_decorator.Position;

public class Actor {

    private Position position;
    private boolean hasFireAura;

    public Actor(Position position, boolean hasFireAura){
        this.position = position;
        this.hasFireAura = hasFireAura;
    }

    public void moveTo(Position newPosition){
        position = newPosition;
        if (hasFireAura){
            damageAllActorsInRadius(5.0f);
        }
    }

    private void damageAllActorsInRadius(float radius) {
    }
}
