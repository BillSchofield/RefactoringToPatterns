package extract_method_and_class.exercise;

public class TimeSlot {
    private final int startTime;
    private final int endTime;

    public TimeSlot(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public boolean isLongerThan(int duration) {
        return endTime - startTime > duration;
    }
}
