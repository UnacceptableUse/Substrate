package game.screen;

import game.Game;
import game.utils.SpriteSheet;

import java.awt.Graphics;

public class ScreenLoading extends Screen {

	public ScreenLoading(int width, int height, SpriteSheet sheet) {
		super(width, height, sheet);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(game.loadingScreen, 0, 0, Game.WIDTH, Game.HEIGHT, game);

	}

	@Override
	public void tick()
	{
	}

}
