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

public class StartFrame extends JFrame implements ActionListener {
	
	JButton startButton;
	JButton optionsButton;
	JButton exitButton;

	public StartFrame() {	
		
		startButton = new JButton();
		startButton.setBounds(605,500,250,50);
		startButton.addActionListener(this);
		startButton.setText("I N T O   T H E   V R A I N S");
		startButton.setFont(new Font("Impact",Font.BOLD, 22));
		startButton.setForeground(Color.white);
		startButton.setBackground(new Color(0x1E710E));
		startButton.setFocusable(false);
		
		optionsButton = new JButton();
		optionsButton.setBounds(630,600,200,50);
		optionsButton.addActionListener(this);
		optionsButton.setText("O P T I O N S");
		optionsButton.setFont(new Font("Impact",Font.BOLD, 22));
		optionsButton.setForeground(Color.white);
		optionsButton.setBackground(Color.blue);
		optionsButton.setFocusable(false);
		
		exitButton = new JButton();
		exitButton.setBounds(655,700,150,50);
		exitButton.addActionListener(this);
		exitButton.setText("E X I T");
		exitButton.setFont(new Font("Impact",Font.BOLD, 22));
		exitButton.setForeground(Color.white);
		exitButton.setBackground(new Color(0x982f30));
		exitButton.setFocusable(false);
		
		this.setContentPane(new JLabel(new ImageIcon("start.jpg")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1536,864);
		this.setMinimumSize(new Dimension(1536, 864));
		this.setVisible(true);
		this.pack();

		this.add(startButton);
		this.add(optionsButton);
		this.add(exitButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startButton) {
			dispose();
			new SelectYourDuelistFrame();		
		} else if (e.getSource()==optionsButton) {
			dispose();
			new OptionsFrame();	
		} else if(e.getSource()==exitButton) {
			dispose();
		}		
	}
	
}
