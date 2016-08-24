package extract_method.exercise;

public class TimeSlot {
    private int startTime;
    private int endTime;

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
