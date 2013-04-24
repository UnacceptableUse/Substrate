package game.tile;

import game.screen.ScreenGame;

public class TileWater extends Tile{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1625043749319476216L;

	public TileWater(ScreenGame game) {
		super(game);
		sprite = 22;
		canPassThrough = false;
	}

}