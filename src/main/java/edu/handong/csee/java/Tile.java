package edu.handong.csee.java;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class Tile extends JLabel implements MouseListener, MouseMotionListener{

	private Cursor cursor;
	private Stone hereStone;
	
	public Tile(int i, int j){
		this.setVisible(true);
		this.setLocation(20 + i*40, 10 + j*40);
		this.setSize(39, 39);
		addMouseListener(this);
		addMouseMotionListener(this);
		hereStone = new Stone(i,j);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int now = Justice.getInstance().getCount();
		
		if(!Justice.getInstance().isDoStart()) {
			hereStone.setMyJob(Stone.NPC);
			this.setIcon(hereStone.getRoleIcon());
			PlayFrame.getInstance().setTurnLabel(hereStone.getRoleIcon());
		}
		else if(now%4==0) {
			hereStone.setMyJob(Stone.BLACK);
			this.setIcon(hereStone.getRoleIcon());
			PlayFrame.getInstance().setTurnLabel(Stone.WhiteIcon);
		}
		else if(now%4==1) {
			hereStone.setMyJob(Stone.WHITE);
			this.setIcon(hereStone.getRoleIcon());
			PlayFrame.getInstance().setTurnLabel(Stone.WhiteIcon);
		}
		else if(now%4==2) {
			hereStone.setMyJob(Stone.WHITE);
			this.setIcon(hereStone.getRoleIcon());
			PlayFrame.getInstance().setTurnLabel(Stone.BlackIcon);
		}
		else if(now%4==3) {
			hereStone.setMyJob(Stone.BLACK);
			this.setIcon(hereStone.getRoleIcon());
			PlayFrame.getInstance().setTurnLabel(Stone.BlackIcon);
		}
			
		System.out.println(hereStone.getLocationNRole()[0] + " : " +hereStone.getLocationNRole()[1] + " : " +hereStone.getLocationNRole()[2]);
		removeMouseListener(this);
		removeMouseMotionListener(this);
		cursor = Cursor.getDefaultCursor();
		PlayFrame.getPlayFrame().setCursor(cursor);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
		PlayFrame.getPlayFrame().setCursor(cursor);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		cursor = Cursor.getDefaultCursor();
		PlayFrame.getPlayFrame().setCursor(cursor);
	}

}
