package patterns.examples.singleton;

public class GameMap {

	private static GameMap instance;

	public static GameMap getInstance() {
		if (instance == null){
			instance = new GameMap();
		}
		return instance;
	}

	private GameMap() {
	}
}
