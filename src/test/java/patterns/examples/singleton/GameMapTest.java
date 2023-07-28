package patterns.examples.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMapTest {

	@Test
	void shouldDoSomethingWhen() {
		GameMap instance = GameMap.getInstance();
	}

	@Test
	void shouldDoSomethingElse() {
		GameMap instance = GameMap.getInstance();
	}

}