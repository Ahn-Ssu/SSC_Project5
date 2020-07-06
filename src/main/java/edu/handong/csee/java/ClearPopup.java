package edu.handong.csee.java;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ClearPopup extends JComponent implements ActionListener {

	private JFrame popUp; 
	private JButton OKButton;
	
	
	public ClearPopup(int role) {
		popUp = new JFrame ("승 리!");
		popUp.getContentPane().setBackground(Color.WHITE);
		popUp.setBackground(Color.WHITE);
		popUp.getContentPane().setForeground(Color.WHITE);
		popUp.getContentPane().setLayout(null);
		
		JLabel catIcon = new JLabel(" ");
		catIcon.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		if(role==1) {
			catIcon.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/Source/blackCatStone.png"));
		}
		else if (role == -1) {
			catIcon.setIcon(new ImageIcon("/Users/suhyun/git/SSC_Project5/Source/whiteCatStone.png"));
		}
		catIcon.setBounds(42, 46, 51, 50);
		popUp.getContentPane().add(catIcon);
		
		JLabel InfoMessageLabel = new JLabel("이겼어요!");
		InfoMessageLabel.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", InfoMessageLabel.getFont().getStyle(), InfoMessageLabel.getFont().getSize()));
		InfoMessageLabel.setBounds(104, 63, 105, 19);
		popUp.getContentPane().add(InfoMessageLabel);
		
		JLabel reactionLabel = new JLabel("으와아앙");
		reactionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reactionLabel.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", reactionLabel.getFont().getStyle(), 15));
		reactionLabel.setBounds(42, 23, 167, 16);
		popUp.getContentPane().add(reactionLabel);
		
		OKButton = new JButton("확인");
		OKButton.setFont(new Font("DX\uACBD\uD544\uACE0\uB515B", OKButton.getFont().getStyle(), OKButton.getFont().getSize()));
		OKButton.setBounds(88, 93, 65, 29);
		popUp.getContentPane().add(OKButton);
		popUp.setSize(250, 150);
		popUp.setLocation(500, 300);
		
		popUp.setVisible(true);
		
		OKButton.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(OKButton)) {
			popUp.dispose();
		}
		
	}
}
