package extract_method.exercise;

import java.util.Objects;

public class Session {
    private String name;
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
