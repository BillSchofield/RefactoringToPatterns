package extract_method_and_class.exercise;

public class Session {
    private final String name;
    private final int startTimeInMinutes;
    private final int endTimeInMinutes;

    public Session(String name, int startTimeInMinutes, int endTimeInMinutes) {
        this.name = name;
        this.startTimeInMinutes = startTimeInMinutes;
        this.endTimeInMinutes = endTimeInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getStartTime() {
        return startTimeInMinutes;
    }

    public int getEndTime() {
        return endTimeInMinutes;
    }
}
