package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class SelectYourDuelistFrame extends JFrame implements ActionListener {
	
	JButton confirmButton;
	JButton returnButton;

	JButton soulBurner;
	JButton revolver;
	JButton reiji;
	JButton playMaker;

	public static ImageIcon soulBurnerImage = new ImageIcon("soulburner.jpg");
	public static ImageIcon revolverImage = new ImageIcon("revolver.jpg");
	public static ImageIcon reijiImage = new ImageIcon("reiji.jpg");
	public static ImageIcon playMakerImage = new ImageIcon("playmaker.jpg");
	
	public static int chosenDuelist = 0;
	
	SelectYourDuelistFrame() {	

		revolver = new JButton();
		revolver.setBounds(380,310,170,170);
		revolver.addActionListener(this);
		revolver.setFocusable(false);
		revolver.setIcon(revolverImage);
		revolver.addActionListener(this);
		revolver.setBorder(new LineBorder(Color.WHITE,3));
		
		soulBurner = new JButton();
		soulBurner.setBounds(585,310,170,170);
		soulBurner.addActionListener(this);
		soulBurner.setFocusable(false);
		soulBurner.setIcon(soulBurnerImage);
		soulBurner.addActionListener(this);
		soulBurner.setBorder(new LineBorder(Color.WHITE,3));
	
		reiji = new JButton();
		reiji.setBounds(790,310,170,170);
		reiji.addActionListener(this);
		reiji.setFocusable(false);
		reiji.setIcon(reijiImage);
		reiji.addActionListener(this);
		reiji.setBorder(new LineBorder(Color.WHITE,3));
		
		playMaker = new JButton();
		playMaker.setBounds(995,310,170,170);
		playMaker.addActionListener(this);
		playMaker.setFocusable(false);
		playMaker.setIcon(playMakerImage);
		playMaker.addActionListener(this);
		playMaker.setBorder(new LineBorder(Color.WHITE,3));

		confirmButton = new JButton();
		confirmButton.setBounds(605,600,250,50);
		confirmButton.addActionListener(this);
		confirmButton.setText("C O N F I R M");
		confirmButton.setFont(new Font("Impact",Font.BOLD, 22));
		confirmButton.setForeground(Color.white);
		confirmButton.setBackground(new Color(0x1E710E));
		confirmButton.setFocusable(false);
		
		returnButton = new JButton();
		returnButton.setBounds(655,700,150,50);
		returnButton.addActionListener(this);
		returnButton.setText("R E T U R N");
		returnButton.setFont(new Font("Impact",Font.BOLD, 22));
		returnButton.setForeground(Color.white);
		returnButton.setBackground(new Color(0x982f30));
		returnButton.setFocusable(false);
		
		this.setContentPane(new JLabel(new ImageIcon("pickyourduelist.jpg")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1536,864);
		this.setMinimumSize(new Dimension(1536, 864));
		this.setVisible(true);
		this.pack();

		
		this.add(confirmButton);
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
			chosenDuelist = 1;
		}
		
		
		if (e.getSource()==soulBurner) {
			soulBurner.setBorder(new LineBorder(Color.RED,10));
			revolver.setBorder(new LineBorder(Color.WHITE,3));
			reiji.setBorder(new LineBorder(Color.WHITE,3));
			playMaker.setBorder(new LineBorder(Color.WHITE,3));
			chosenDuelist = 2;
		}
		
		if (e.getSource()==reiji) {
			reiji.setBorder(new LineBorder(Color.RED,10));
			soulBurner.setBorder(new LineBorder(Color.WHITE,3));
			revolver.setBorder(new LineBorder(Color.WHITE,3));
			playMaker.setBorder(new LineBorder(Color.WHITE,3));
			chosenDuelist = 3;
		}
		
		if (e.getSource()==playMaker) {
			playMaker.setBorder(new LineBorder(Color.RED,10));
			soulBurner.setBorder(new LineBorder(Color.WHITE,3));
			revolver.setBorder(new LineBorder(Color.WHITE,3));
			reiji.setBorder(new LineBorder(Color.WHITE,3));
			chosenDuelist = 4;
		}
		
		
		if(e.getSource()==confirmButton) {
			if (chosenDuelist==0) {
			JOptionPane.showMessageDialog(null, "You must choose a duelist !", "Atention !", JOptionPane.ERROR_MESSAGE);
			} else {
			dispose();
			new SelectYourOpponentFrame();
			}
		} 
		
		if(e.getSource()==returnButton) {
			dispose();
			new StartFrame();
		}
		
	}
	
}
