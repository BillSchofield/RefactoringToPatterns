package replace_state_altering_conditionals_with_state.after;

public interface State {
	State handleEvent(Event event);
}
