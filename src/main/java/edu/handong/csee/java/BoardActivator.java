package edu.handong.csee.java;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class BoardActivator {

	private Tile[][] setTile;
	
	
	public BoardActivator() {
		setTile = new Tile[19][19];
		makeTiles();
	}


	private void makeTiles() {
		int x = 20;
		int y = 10;
		
		for(int i = 0; i < 19 ; i++) {
			x=20;
			for(int j = 0 ; j < 19 ; j++) {
				
				setTile[i][j] = new Tile(x,y);
				
				x = x+40;
			}	
			y = y + 40; 
		}
	}


	public Tile[][] getSetTile() {
		return setTile;
	}
	
	
}
