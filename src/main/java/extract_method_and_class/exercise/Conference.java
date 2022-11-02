package extract_method_and_class.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

public class Conference {
	private final int startTimeInMinutes;
	private final int endTimeInMinutes;
	Map<String, Track> tracks = new HashMap<>();

	public Conference(int startTimeInMinutes, int endTimeInMinutes) {
		this.startTimeInMinutes = startTimeInMinutes;
		this.endTimeInMinutes = endTimeInMinutes;
	}

	public void addSession(String sessionString) {
		String[] tokens = sessionString.split(",");
		String trackName = tokens[0];
		String sessionName = tokens[1];
		int duration = Integer.parseInt(tokens[2]);

		Track track = findTrack(trackName);
		if (sessionDoesNotExist(sessionName, track)) {
			addSession(sessionName, duration, track);
		}
	}

	private boolean sessionDoesNotExist(String sessionName, Track track) {
		Session foundSession = null;
		for (Session session : track.getSessions()) {
			if (session.getName().equals(sessionName)) {
				foundSession = session;
				break;
			}
		}
		return foundSession == null;
	}

	private void addSession(String sessionName, int duration, Track track) {
		if (track.getSessions().isEmpty()) {
			addSessionIfConferenceIsLongEnoughToContainIt(sessionName, duration, track);
		} else {
			TimeSlot candidateTimeSlot = findTimeSlot(duration, track);
			if (candidateTimeSlot != null) {
				track.getSessions().add(new Session(sessionName, candidateTimeSlot.getStartTime(), candidateTimeSlot.getStartTime() + duration));
			}
		}
	}

	private TimeSlot findTimeSlot(int duration, Track track) {
		List<TimeSlot> emptyTimeSlots = findEmptyTimeSlots(track);
		return findUsableTimeSlot(duration, emptyTimeSlots);
	}

	private TimeSlot findUsableTimeSlot(int duration, List<TimeSlot> emptyTimeSlots) {
		for (TimeSlot emptyTimeSlot : emptyTimeSlots) {
			if (emptyTimeSlot.isLongerThan(duration)) {
				return new TimeSlot(emptyTimeSlot.getStartTime(), emptyTimeSlot.getStartTime() + duration);
			}
		}
		return null;
	}

	private List<TimeSlot> findEmptyTimeSlots(Track track) {
		List<TimeSlot> emptyTimeSlots = new ArrayList<>();
		int startTime = startTimeInMinutes;
		for (Session session : track.getSessions()) {
			emptyTimeSlots.add(new TimeSlot(startTime, session.getStartTime()));
			startTime = session.getEndTime();
		}
		emptyTimeSlots.add(new TimeSlot(startTime, endTimeInMinutes));
		return emptyTimeSlots;
	}

	private void addSessionIfConferenceIsLongEnoughToContainIt(String sessionName, int duration, Track track) {
		if (endTimeInMinutes - startTimeInMinutes > duration) {
			track.getSessions().add(new Session(sessionName, startTimeInMinutes, startTimeInMinutes + duration));
		}
	}

	private Track findTrack(String trackName) {
		if (!tracks.containsKey(trackName)) {
			tracks.put(trackName, new Track(new ArrayList<>()));
		}
		return tracks.get(trackName);
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
		int hours = time / 60;
		int minutes = time - hours * 60;
		return format("%02d:%02d", hours, minutes);
	}
}
