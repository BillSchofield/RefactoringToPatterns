package move_embellishment_to_decorator.after;

import move_embellishment_to_decorator.Position;

public class Character implements Actor {

    private Position position;

    public Character(Position position){
        this.position = position;
    }

    public void moveTo(Position newPosition){
        position = newPosition;
    }
}
