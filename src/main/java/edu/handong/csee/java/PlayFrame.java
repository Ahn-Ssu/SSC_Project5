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
	private JLabel nowTurnLabelBody;
	
	private BoardActivator myActivator = new BoardActivator();
	private Tile[][] setTile;
	
			//인터페이스 구축 
	public PlayFrame() {
		playFrame.getContentPane().setBackground(Color.WHITE);
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
		
		nowTurnLabelBody = new JLabel(" ");
		nowTurnLabelBody.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/NPCCatStone.png"));
		nowTurnLabelBody.setBounds(1033, 159, 60, 60);
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
		lblNewLabel.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/Connect6Borad.png"));
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource().equals(startButton)) {
			setTurnLabel(new ImageIcon("/Users/suhyun/git/SSC_Project5/imageSource/blackCatStone.png"));
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
