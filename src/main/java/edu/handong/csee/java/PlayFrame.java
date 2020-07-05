package edu.handong.csee.java;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Shape;
import javax.swing.JPanel;

public class PlayFrame extends JComponent  {

	
	private static JFrame playFrame = new JFrame("Connect6 - 육목");
	private BoardActivator myActivator = new BoardActivator();
			
	private Tile[][] setTile;
	private Shape seletedTile;
	private boolean isThere;
	private Cursor cursor=null;
	
	private int infoX, infoY;
	
	
			//인터페이스 구축 
	public PlayFrame() {
		playFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		playFrame.getContentPane().setLayout(null);
		playFrame.setSize(1100, 900);
		
		JLabel playTimeLabelHead = new JLabel("대국 시간");
		playTimeLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", playTimeLabelHead.getFont().getStyle(), playTimeLabelHead.getFont().getSize()));
		playTimeLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		playTimeLabelHead.setBounds(1033, 19, 61, 16);
		playFrame.getContentPane().add(playTimeLabelHead);
		
		JLabel playTimeLabelBody = new JLabel("05 : 36");
		playTimeLabelBody.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", playTimeLabelBody.getFont().getStyle(), playTimeLabelBody.getFont().getSize()));
		playTimeLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		playTimeLabelBody.setBounds(1033, 47, 61, 16);
		playFrame.getContentPane().add(playTimeLabelBody);
		
		JLabel countDownLabelHead = new JLabel("제한 시간");
		countDownLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", countDownLabelHead.getFont().getStyle(), countDownLabelHead.getFont().getSize()));
		countDownLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		countDownLabelHead.setBounds(1033, 75, 61, 16);
		playFrame.getContentPane().add(countDownLabelHead);
		
		JLabel countDownLabelBody = new JLabel("  0 : 01");
		countDownLabelBody.setForeground(Color.RED);
		countDownLabelBody.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", countDownLabelBody.getFont().getStyle(), countDownLabelBody.getFont().getSize()));
		countDownLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		countDownLabelBody.setBounds(1033, 103, 61, 16);
		playFrame.getContentPane().add(countDownLabelBody);
		
		JLabel nowTurnLabelHead = new JLabel("놓을 차례");
		nowTurnLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", nowTurnLabelHead.getFont().getStyle(), nowTurnLabelHead.getFont().getSize()));
		nowTurnLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		nowTurnLabelHead.setBounds(1033, 131, 61, 16);
		playFrame.getContentPane().add(nowTurnLabelHead);
		
		JLabel nowTurnLabelBody = new JLabel(" ");
		nowTurnLabelBody.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/Origin - catStone1.jpg"));
		nowTurnLabelBody.setBounds(1033, 159, 60, 60);
		playFrame.getContentPane().add(nowTurnLabelBody);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(18, 49, 800, 790);
		panel.setLayout(null);
		playFrame.getContentPane().add(panel);
		
		
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/catStone1 - removeBG 복사본.png"));
		label.setBounds(1034, 235, 60, 60);
		playFrame.getContentPane().add(label);
	
		
		setTile = myActivator.getSetTile();
		
		for(Tile[] temp : setTile) {
			for(Tile t : temp) {
				panel.add(t);
			}
		}
		
		JLabel lblNewLabel = new JLabel(" \n");
		lblNewLabel.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/Connect6Borad.png"));
		lblNewLabel.setBounds(18, 18, 760, 760);
		panel.add(lblNewLabel);
		
		playFrame.setVisible(true);
	}

	public static JFrame getPlayFrame() {
		return playFrame;
	}

}
