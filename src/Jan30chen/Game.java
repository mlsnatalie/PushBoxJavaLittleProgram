package Jan30chen;

import java.io.IOException;

public class Game {
	Map map, map1;

	Game(String path) throws IOException {
		map1 = new Map_Normal(path);
		map = map1;
	}

	public void up() {
		map.move('W');
	}

	public void down() {
		map.move('S');
	}

	public void left() {
		map.move('A');
	}

	public void right() {
		map.move('D');
	}

	public void loadPath(String path) throws IOException {
		map1.loadMap(path);
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Map getmap() {
		return map;
	}

	public Map getmap1() {
		return map1;
	}
}
