package extract_method.exercise;

import java.util.*;

import static java.lang.String.format;

public class Conference {
    private final int startTimeInMinutes;
    private final int endTimeInMinutes;
    Map<String, Track> tracks = new HashMap<String, Track>();

    public Conference(int startTimeInMinutes, int endTimeInMinutes) {
        this.startTimeInMinutes = startTimeInMinutes;
        this.endTimeInMinutes = endTimeInMinutes;
    }

    public void addSession(String sessionString) {
        String[] tokens = sessionString.split(",");

        String trackName = tokens[0];
        String sessionName = tokens[1];
        int duration = Integer.parseInt(tokens[2]);

        if (!tracks.containsKey(trackName)) {
            tracks.put(trackName, new Track(new ArrayList<Session>()));
        }
        Track track = tracks.get(trackName);
        Session foundSession = null;
        for (Session session : track.getSessions()) {
            if (session.getName().equals(sessionName)) {
                foundSession = session;
                break;
            }
        }

        if (foundSession == null) {
            if (track.getSessions().isEmpty()) {
                if (endTimeInMinutes - startTimeInMinutes > duration) {
                    track.getSessions().add(new Session(sessionName, startTimeInMinutes, startTimeInMinutes + duration));
                }
            } else {
                int candidateStartTime = startTimeInMinutes;
                int candidateEndTime = -1;
                List<Session> sessions = track.getSessions();
                for (Session session : sessions) {
                    candidateEndTime = session.getStartTime();
                    if (candidateEndTime - candidateStartTime > duration) {
                        candidateEndTime = candidateStartTime + duration;
                        break;
                    }
                    candidateStartTime = session.getEndTime();
                }
                if (candidateEndTime != -1) {
                    track.getSessions().add(new Session(sessionName, candidateStartTime, candidateStartTime + duration));
                }
            }
        }
    }


    public void print() {
        for (Map.Entry<String, Track> track : tracks.entrySet()) {
            System.out.println(track.getKey());
            List<Session> sessions = track.getValue().getSessions();
            for (Session session : sessions) {
                System.out.println(session.getName() + ": " + timeString(session.getStartTime()) + " - " + timeString(session.getEndTime()));
            }
        }
    }

    private String timeString(int time) {
        int hours = time/60;
        int minutes = time - hours*60;
        return format("%02d:%02d", hours, minutes);
    }
}
