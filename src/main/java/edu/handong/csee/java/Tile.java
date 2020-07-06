package edu.handong.csee.java;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tile extends JLabel implements MouseListener, MouseMotionListener{

	private Cursor cursor;
	private BufferedImage stoneImage;
	private ImageIcon white, black, npc;
	
	
	

	
	
	public Tile(int x, int y){
		this.setVisible(true);
		this.setLocation(x, y);
		this.setSize(39, 39);
		addMouseListener(this);
		addMouseMotionListener(this);
		black = new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/blackCatStone.png");
		white = new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/WhiteCatStone.png");
		npc = new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/NPCCatStone.png");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int now = Justice.getInstance().getCount();
		
		
		if(!Justice.getInstance().isDoStart()) {
			this.setIcon(npc);
			PlayFrame.getInstance().setTurnLabel(npc);
		}
		else if(now%4==0) {
			this.setIcon(black);
			PlayFrame.getInstance().setTurnLabel(black);
		}
		else if(now%4==1) {
			this.setIcon(white);
			PlayFrame.getInstance().setTurnLabel(white);
		}
		else if(now%4==2) {
			this.setIcon(white);
			PlayFrame.getInstance().setTurnLabel(white);
		}
		else if(now%4==3) {
			this.setIcon(black);
			PlayFrame.getInstance().setTurnLabel(black);
		}
			
		
		removeMouseListener(this);
		removeMouseMotionListener(this);
		cursor = Cursor.getDefaultCursor();
		PlayFrame.getPlayFrame().setCursor(cursor);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
		PlayFrame.getPlayFrame().setCursor(cursor);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		cursor = Cursor.getDefaultCursor();
//		setCursor(cursor);
		PlayFrame.getPlayFrame().setCursor(cursor);
	}

}
