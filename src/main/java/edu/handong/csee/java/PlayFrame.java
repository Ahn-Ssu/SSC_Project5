package edu.handong.csee.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PlayFrame extends JComponent implements MouseListener, MouseMotionListener {

	//인터페이스 구축 
	private JFrame playFrame = new JFrame("Connect6 - 육목");
	
	public PlayFrame() {
		playFrame.getContentPane().setBackground(Color.WHITE);
		playFrame.getContentPane().setLayout(null);
		
		JLabel playBoard = new JLabel("");
		playBoard.setHorizontalAlignment(SwingConstants.CENTER);
		playBoard.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/mini.png"));
		playBoard.setBounds(20, 60, 340, 280);
		playFrame.getContentPane().add(playBoard);
		
		JLabel playTimeLabelHead = new JLabel("대국 시간");
		playTimeLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", playTimeLabelHead.getFont().getStyle(), playTimeLabelHead.getFont().getSize()));
		playTimeLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		playTimeLabelHead.setBounds(569, 21, 61, 16);
		playFrame.getContentPane().add(playTimeLabelHead);
		
		JLabel playTimeLabelBody = new JLabel("05 : 36");
		playTimeLabelBody.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", playTimeLabelBody.getFont().getStyle(), playTimeLabelBody.getFont().getSize()));
		playTimeLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		playTimeLabelBody.setBounds(569, 49, 61, 16);
		playFrame.getContentPane().add(playTimeLabelBody);
		
		JLabel countDownLabelHead = new JLabel("제한 시간");
		countDownLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", countDownLabelHead.getFont().getStyle(), countDownLabelHead.getFont().getSize()));
		countDownLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		countDownLabelHead.setBounds(569, 77, 61, 16);
		playFrame.getContentPane().add(countDownLabelHead);
		
		JLabel countDownLabelBody = new JLabel("  0 : 01");
		countDownLabelBody.setForeground(Color.RED);
		countDownLabelBody.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", countDownLabelBody.getFont().getStyle(), countDownLabelBody.getFont().getSize()));
		countDownLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		countDownLabelBody.setBounds(569, 105, 61, 16);
		playFrame.getContentPane().add(countDownLabelBody);
		
		JLabel nowTurnLabelHead = new JLabel("놓을 차례");
		nowTurnLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", nowTurnLabelHead.getFont().getStyle(), nowTurnLabelHead.getFont().getSize()));
		nowTurnLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		nowTurnLabelHead.setBounds(569, 133, 61, 16);
		playFrame.getContentPane().add(nowTurnLabelHead);
		
		JLabel nowTurnLabelBody = new JLabel(" ");
		nowTurnLabelBody.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/catStone1.jpg"));
		nowTurnLabelBody.setBounds(569, 161, 60, 60);
		playFrame.getContentPane().add(nowTurnLabelBody);
		playFrame.setVisible(true);
		playFrame.setSize(650, 535);
		playFrame.setLocation(300, 150);
	}

	

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void mouseEntered(MouseEvent e) {	}

	@Override
	public void mouseExited(MouseEvent e) {	}
	
	@Override
	public void mouseDragged(MouseEvent e) {	}
}
