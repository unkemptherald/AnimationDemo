

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	boolean isInAir = false;
	double yVel;
	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		if(dir>0) 
		{
			this.moveByAmount(5, 0);
		}
		else 
		{
			this.moveByAmount(-5, 0);
		}
		// WALK!
	}

	public void jump() {
		if(!isInAir) 
		{
			yVel +=15;
		}
	}

	public void act(ArrayList<Shape> obstacles) 
	{
		
	}


}
