package extract_method_and_class.exercise;

import java.util.List;

public class Track {
    private final List<Session> sessions;

    public Track(List<Session> sessions) {
        this.sessions = sessions;
    }

    public List<Session> getSessions() {
        return sessions;
    }
}
