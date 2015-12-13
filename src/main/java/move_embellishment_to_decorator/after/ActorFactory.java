package move_embellishment_to_decorator.after;

import move_embellishment_to_decorator.Position;

public class ActorFactory {

    public static Actor createActor(Position position){
        return new Character(position);
    }

    public static Actor createActorWithFireAura(Position position){
        Actor actor = createActor(position);
        return new RadiusDecorator(actor);
    }

}
