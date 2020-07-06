package edu.handong.csee.java;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PlayFrame extends JComponent implements ActionListener  {

	private static PlayFrame instance;
	
	private static JFrame playFrame = new JFrame("Connect6 - 육목");
	private JButton startButton;
	private JLabel nowTurnLabelBody, countDownLabelBody ,playTimeLabelBody ;
	
	private BoardActivator myActivator = new BoardActivator();
	private Tile[][] setTile;
	
	private MusicPlayer soundPlayer;
			//인터페이스 구축 
	public PlayFrame() {
		
		soundPlayer = new MusicPlayer();
		soundPlayer.BGMPlay();
		playFrame.getContentPane().setBackground(Color.WHITE);
		playFrame.getContentPane().setLayout(null);
		playFrame.setSize(1000, 900);
		
		JLabel playTimeLabelHead = new JLabel("대국 시간");
		playTimeLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", playTimeLabelHead.getFont().getStyle(), 15));
		playTimeLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		playTimeLabelHead.setBounds(859, 28, 91, 29);
		playFrame.getContentPane().add(playTimeLabelHead);
		
		playTimeLabelBody = new JLabel("05 : 36");
		playTimeLabelBody.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", playTimeLabelBody.getFont().getStyle(), 17));
		playTimeLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		playTimeLabelBody.setBounds(859, 56, 91, 29);
		playFrame.getContentPane().add(playTimeLabelBody);
		
		JLabel countDownLabelHead = new JLabel("제한 시간");
		countDownLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", countDownLabelHead.getFont().getStyle(), 15));
		countDownLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		countDownLabelHead.setBounds(859, 97, 91, 29);
		playFrame.getContentPane().add(countDownLabelHead);
		 
		countDownLabelBody = new JLabel("00 : 00");
		countDownLabelBody.setForeground(Color.RED);
		countDownLabelBody.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", countDownLabelBody.getFont().getStyle(), 17));
		countDownLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		countDownLabelBody.setBounds(859, 138, 91, 45);
		playFrame.getContentPane().add(countDownLabelBody);
		
		JLabel nowTurnLabelHead = new JLabel("놓을 차례");
		nowTurnLabelHead.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", nowTurnLabelHead.getFont().getStyle(), 15));
		nowTurnLabelHead.setHorizontalAlignment(SwingConstants.CENTER);
		nowTurnLabelHead.setBounds(859, 182, 91, 29);
		playFrame.getContentPane().add(nowTurnLabelHead);
		
		nowTurnLabelBody = new JLabel(" ");
		nowTurnLabelBody.setHorizontalAlignment(SwingConstants.CENTER);
		nowTurnLabelBody.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/Source/NPCCatStone - red.png"));
		nowTurnLabelBody.setBounds(877, 210, 60, 60);
		playFrame.getContentPane().add(nowTurnLabelBody);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(18, 49, 800, 790);
		panel.setLayout(null);
		playFrame.getContentPane().add(panel);
	
		
		setTile = myActivator.getSetTile();
		
		for(Tile[] temp : setTile) {
			for(Tile t : temp) {
				panel.add(t);
			}
		}
		
		JLabel lblNewLabel = new JLabel(" \n");
		lblNewLabel.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/Source/Connect6Borad.png"));
		lblNewLabel.setBounds(18, 18, 760, 760);
		panel.add(lblNewLabel);
		
		startButton = new JButton("게임 시작!");
		startButton.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", startButton.getFont().getStyle(), startButton.getFont().getSize()));
		startButton.setBounds(701, 13, 117, 29);
		playFrame.getContentPane().add(startButton);
		
		playFrame.setVisible(true);
		
		startButton.addActionListener(this);
	}

	public static JFrame getPlayFrame() {
		return playFrame;
	}
	
	public void setTurnLabel(ImageIcon nowIcon) {
		nowTurnLabelBody.setIcon(nowIcon);
	}
	
	public void setPlayTimeLabelBody(String text) {
		playTimeLabelBody.setText(text);
	}
	
	public void setCountDownLabelBody(String text) {
		countDownLabelBody.setText(text);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource().equals(startButton)) {
			setTurnLabel(new ImageIcon("/Users/suhyun/git/SSC_Project5/Source/blackCatStone.png"));
			startButton.setText("게임 중...");
			startButton.setEnabled(false);
			Justice.getInstance().setDoStart(true);
		}
	}

	public static PlayFrame getInstance() {
		if(instance == null)
			instance = new PlayFrame();
		return instance;
	}

}
