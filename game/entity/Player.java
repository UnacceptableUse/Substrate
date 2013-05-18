package game.entity;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import game.Controls;
import game.Game;
import game.screen.Screen;
import game.screen.ScreenGame;

public class Player extends Entity {

	public static final int NORTH = 0, EAST = 1, SOUTH = 2, WEST = 3;
	Screen game;
	private int orientation = 0, health = 20, ammo = 5;
	public int ammocooldown = 0;

	public Player(Screen game) {
		super((ScreenGame) game);
		this.game =  game;
		this.sprite = 0;

	}
	
	@Override
	public boolean tryMoveEntity(int x, int y)
	{
		
		
		if(x == 1) // Player is moving forwards 
		{
				ArrayList<Entity>eib = ((ScreenGame) game).getEntitiesInBox(new Rectangle(this.x+x - 10 , this.y+y - 20, Game.SIZE, Game.SIZE));
			if(eib.size() > 1)
			{
				for(Entity e : eib)
				{
					if(e instanceof Player == false)
					{
						e.onCollideWithPlayer(x, 0);
						return false;
					}
				}				
			}
		}
		if(x == -1) // Player is moving backwards
		{
				ArrayList<Entity>eib = ((ScreenGame) game).getEntitiesInBox(new Rectangle(this.x+x - 25 , this.y+y - 20, Game.SIZE, Game.SIZE));
			if(eib.size() > 1)
			{
				for(Entity e : eib)
				{
					if(e instanceof Player == false)
					{
						e.onCollideWithPlayer(x, 0);
						return false;
					}
				}				
			}
		}
		if(y == 1) // Player is moving up 
		{
				ArrayList<Entity>eib = ((ScreenGame) game).getEntitiesInBox(new Rectangle(this.x+x - 25 , this.y+y - 5, Game.SIZE, Game.SIZE));
			if(eib.size() > 1)
			{
				for(Entity e : eib)
				{
					if(e instanceof Player == false)
					{
						e.onCollideWithPlayer(0, y);
						return false;
					}
				}				
			}
		}
		if(y == -1) // Player is moving down
		{
				ArrayList<Entity>eib = ((ScreenGame) game).getEntitiesInBox(new Rectangle(this.x+x - 25 , this.y+y - 25, Game.SIZE, Game.SIZE));
			if(eib.size() > 1)
			{
				for(Entity e : eib)
				{
					if(e instanceof Player == false)
					{
						e.onCollideWithPlayer(0, y);
						return false;
					}
				}				
			}
		}
		super.tryMoveEntity(x, y);
		return false;
		}
	

	@Override
	public void tick() {
		if(ammocooldown != 0)
		{
			ammocooldown--;
		}
		if(ammocooldown < 0)
		{
			ammocooldown = 256;
		}
		if(ammocooldown > 256)
		{
			ammocooldown = 0;
		}

		

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == game.game.controls.getKey(Controls.CONTROL_UP)) {
			sprite = 1;
			setOrientation(NORTH);

		}
		if (e.getKeyCode() == game.game.controls.getKey(Controls.CONTROL_DOWN)) {
			sprite = 0;
			setOrientation(SOUTH);

		}
		if (e.getKeyCode() == game.game.controls.getKey(Controls.CONTROL_LEFT)) {
			sprite = 3 ;
			setOrientation(WEST);

		}
		if (e.getKeyCode() == game.game.controls.getKey(Controls.CONTROL_RIGHT)) {
			sprite = 2;
			setOrientation(EAST);

		}
		if (e.getKeyCode() == game.game.controls.getKey(Controls.CONTROL_FIRE)) {
			if(ammo != 0 && ammocooldown == 0)
			{
				((ScreenGame) game).spawnEntity(new EntityBullet((ScreenGame) game, 0, getOrientation(), x, y));
				ammo--;
				ammocooldown = 256;
			}
			
			
		}
	
	}

	public void keyReleased(KeyEvent e) {

	}
	
	public int getOrientation()
	{
		return orientation;
	}
	
	public void setOrientation(int or)
	{
		orientation = or;
	}
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int he)
	{
		health = he;
	}
	public int getAmmo()
	{
		return ammo;
	}
	
	public void setAmmo(int am)
	{
		this.ammo = am;
	}

}
