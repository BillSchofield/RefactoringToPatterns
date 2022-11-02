package extract_method_and_class.example.extract_class;

public class HitPointChange {
    private final float change;

    public HitPointChange(float change) {
        this.change = change;
    }

    public boolean isDamage() {
        return change < 0.0f;
    }

    public boolean isHealing() {
        return change > 0.0f;
    }

    public boolean isRaiseDead() {
        return change == Float.MAX_VALUE;
    }

    public Float apply(Float currentHitPoints) {
        return currentHitPoints + change;
    }
}