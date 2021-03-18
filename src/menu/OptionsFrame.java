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

public class OptionsFrame extends JFrame implements ActionListener {
	

	JButton returnButton;

	public OptionsFrame() {

		returnButton = new JButton();
		returnButton.setBounds(655,700,150,50);
		returnButton.addActionListener(this);
		returnButton.setText("R E T U R N");
		returnButton.setFont(new Font("Impact",Font.BOLD, 22));
		returnButton.setForeground(Color.white);
		returnButton.setBackground(new Color(0x982f30));
		returnButton.setFocusable(false);
		
		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("options.jpg"))));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1536,864);
		this.setMinimumSize(new Dimension(1536, 864));
		this.setVisible(true);
		this.pack();

		
		this.add(returnButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==returnButton) {
			dispose();
			new StartFrame();
		}		
	}
	
}
