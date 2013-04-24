package game.tile;

import game.screen.ScreenGame;

public class TileRubble extends Tile{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5853358076920516483L;

	public TileRubble(ScreenGame game) {
		super(game);
		sprite = 19;
		canPassThrough = true;
	}

}