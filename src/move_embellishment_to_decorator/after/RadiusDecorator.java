package move_embellishment_to_decorator.after;

import move_embellishment_to_decorator.Position;

public class RadiusDecorator implements Actor {
    private Actor actor;

    public RadiusDecorator(Actor actor) {
        this.actor = actor;
    }

    public void moveTo(Position newPosition) {
        actor.moveTo(newPosition);
        damageAllActorsInRadius(5.0f);
    }

    private void damageAllActorsInRadius(float radius) {
    }
}
