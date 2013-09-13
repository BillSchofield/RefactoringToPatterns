package move_embellishment_to_decorator.after;

import move_embellishment_to_decorator.Position;

public class ActorFactory {

    public static Actor createActor(Position position){
        return new Character(position);
    }

    public static Actor createActorWithFireAura(Position position){
        Actor actor = createActor(position);
        Actor decoratedActor = new RadiusDecorator(actor);
        return decoratedActor;
    }

}
