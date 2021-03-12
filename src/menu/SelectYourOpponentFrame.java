package menu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import board.DuelFrame;

public class SelectYourOpponentFrame extends JFrame implements ActionListener {
	
	JButton duelButton;
	JButton returnButton;
	
	JButton soulBurner;
	JButton revolver;
	JButton reiji;
	JButton playMaker;
	
	public static int chosenOpponent = 0;

	public SelectYourOpponentFrame() {	
		
		revolver = new JButton();
		revolver.setBounds(380,310,170,170);
		revolver.addActionListener(this);
		revolver.setFocusable(false);
		revolver.setIcon(SelectYourDuelistFrame.revolverImage);
		revolver.addActionListener(this);
		revolver.setBorder(new LineBorder(Color.WHITE,3));
		
		soulBurner = new JButton();
		soulBurner.setBounds(585,310,170,170);
		soulBurner.addActionListener(this);
		soulBurner.setFocusable(false);
		soulBurner.setIcon(SelectYourDuelistFrame.soulBurnerImage);
		soulBurner.addActionListener(this);
		soulBurner.setBorder(new LineBorder(Color.WHITE,3));
	
		reiji = new JButton();
		reiji.setBounds(790,310,170,170);
		reiji.addActionListener(this);
		reiji.setFocusable(false);
		reiji.setIcon(SelectYourDuelistFrame.reijiImage);
		reiji.addActionListener(this);
		reiji.setBorder(new LineBorder(Color.WHITE,3));
		
		playMaker = new JButton();
		playMaker.setBounds(995,310,170,170);
		playMaker.addActionListener(this);
		playMaker.setFocusable(false);
		playMaker.setIcon(SelectYourDuelistFrame.playMakerImage);
		playMaker.addActionListener(this);
		playMaker.setBorder(new LineBorder(Color.WHITE,3));

		
		duelButton = new JButton();
		duelButton.setBounds(605,600,250,50);
		duelButton.addActionListener(this);
		duelButton.setText("D U E L");
		duelButton.setFont(new Font("Impact",Font.BOLD, 22));
		duelButton.setForeground(Color.white);
		duelButton.setBackground(new Color(0x1E710E));
		duelButton.setFocusable(false);
		
		returnButton = new JButton();
		returnButton.setBounds(655,700,150,50);
		returnButton.addActionListener(this);
		returnButton.setText("R E T U R N");
		returnButton.setFont(new Font("Impact",Font.BOLD, 22));
		returnButton.setForeground(Color.white);
		returnButton.setBackground(new Color(0x982f30));
		returnButton.setFocusable(false);
		
		this.setContentPane(new JLabel(new ImageIcon("pickyouropponent.jpg")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1536,864);
		this.setVisible(true);
		this.pack();

		
		this.add(duelButton);
		this.add(returnButton);
		this.add(soulBurner);
		this.add(revolver);
		this.add(reiji);
		this.add(playMaker);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==revolver) {
			revolver.setBorder(new LineBorder(Color.RED,10));
			soulBurner.setBorder(new LineBorder(Color.WHITE,3));
			reiji.setBorder(new LineBorder(Color.WHITE,3));
			playMaker.setBorder(new LineBorder(Color.WHITE,3));
			chosenOpponent = 1;
		}
		
		
		if (e.getSource()==soulBurner) {
			soulBurner.setBorder(new LineBorder(Color.RED,10));
			revolver.setBorder(new LineBorder(Color.WHITE,3));
			reiji.setBorder(new LineBorder(Color.WHITE,3));
			playMaker.setBorder(new LineBorder(Color.WHITE,3));
			chosenOpponent = 2;
		}
		
		if (e.getSource()==reiji) {
			reiji.setBorder(new LineBorder(Color.RED,10));
			soulBurner.setBorder(new LineBorder(Color.WHITE,3));
			revolver.setBorder(new LineBorder(Color.WHITE,3));
			playMaker.setBorder(new LineBorder(Color.WHITE,3));
			chosenOpponent = 3;
		}
		
		if (e.getSource()==playMaker) {
			playMaker.setBorder(new LineBorder(Color.RED,10));
			soulBurner.setBorder(new LineBorder(Color.WHITE,3));
			revolver.setBorder(new LineBorder(Color.WHITE,3));
			reiji.setBorder(new LineBorder(Color.WHITE,3));
			chosenOpponent = 4;
		}
		
		
		if(e.getSource()==duelButton) {
			if (chosenOpponent==0) {
			JOptionPane.showMessageDialog(null, "You must choose a opponent !", "Atention !", JOptionPane.ERROR_MESSAGE);
			} else {
			new DuelFrame();
			dispose();
			}
		} 
		
		if(e.getSource()==returnButton) {
			dispose();
			new SelectYourDuelistFrame();
		}
	}
	
}
