package game.tile;

public class TileWall extends Tile {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6093326443610622363L;
	public static final int TOP_CORNER_LEFT = 2;
	public static final int BOTTOM_CORNER_LEFT = 17;
	public static final int TOP_CORNER_RIGHT = 1;
	public static final int BOTTOM_CORNER_RIGHT = 18;

	public static final int WALL_VERTICAL_DAMAGED_TOP = 3;

	public static final int WALL_HORIZONTAL_LEFT = 4;
	public static final int WALL_HORIZONTAL = 5;
	public static final int WALL_HORIZONTAL_RIGHT = 6;

	public static final int WALL_VERTICAL_TOP = 0;
	public static final int WALL_VERTICAL = 16;
	public static final int WALL_VERTICAL_BOTTOM = 32;
	
	public static final int WALL_TJUNC_RIGHT = 52;
	public static final int WALL_TJUNC_DOWN = 53;
	public static final int WALL_XJUNC = 54;
	public static final int WALL_TJUNC_UP = 68;
	public static final int WALL_TJUNC_LEFT = 69;
	
	public static final int WALL_FULL_LEFT = 55;
	public static final int WALL_FULL_TOP = 56;
	public static final int WALL_FULL_RIGHT = 57;
	public static final int WALL_FULL_RIGHT_MIDDLE = 71;
	public static final int WALL_FULL_MIDDLE = 72;
	public static final int WALL_FULL_LEFT_MIDDLE = 73;
	public static final int WALL_FULL_BOTTOM_LEFT = 86;
	public static final int WALL_FULL_BOTTOM_MIDDLE = 87;
	public static final int WALL_FULL_BOTTOM_RIGHT = 88;
	public TileWall(int typ) {
		sprite = typ;
		canPassThrough = false;
		tileName = "Wall "+sprite;

	}

}
