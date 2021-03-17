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

import board.DuelFrame;

public class RockPaperScissorsFrame extends JFrame implements ActionListener {


	JButton confirmButton;

	JButton rock;
	JButton paper;
	JButton scissors;

	JButton opponent;

	public static ImageIcon rotatedRockImage = new ImageIcon("rotatedrock.jpg");
	public static ImageIcon rotatedPaperImage = new ImageIcon("rotatedpaper.jpg");
	public static ImageIcon rotatedScissorsImage = new ImageIcon("rotatedscissors.jpg");

	public static ImageIcon rockImage = new ImageIcon("rock.jpg");
	public static ImageIcon paperImage = new ImageIcon("paper.jpg");
	public static ImageIcon scissorsImage = new ImageIcon("scissors.jpg");

	public static ImageIcon firstImage = new ImageIcon("first.jpg");
	public static ImageIcon secondImage = new ImageIcon("second.jpg");

	static String[] Options = { "CONFIRM" };

	public static int chosenCard = 0;

	public static boolean goFirst;

	public RockPaperScissorsFrame() {

		confirmButton = new JButton();
		confirmButton.setBounds(650, 800, 250, 50);
		confirmButton.addActionListener(this);
		confirmButton.setText("C O N F I R M");
		confirmButton.setFont(new Font("Impact", Font.BOLD, 22));
		confirmButton.setForeground(Color.white);
		confirmButton.setBackground(new Color(0x1E710E));
		confirmButton.setFocusable(false);

		rock = new JButton();
		rock.setBounds(200, 390, 271, 395);
		rock.addActionListener(this);
		rock.setFocusable(false);
		rock.setIcon(rockImage);
		rock.addActionListener(this);
		rock.setBorder(new LineBorder(Color.WHITE, 3));

		paper = new JButton();
		paper.setBounds(640, 390, 271, 395);
		paper.addActionListener(this);
		paper.setFocusable(false);
		paper.setIcon(paperImage);
		paper.addActionListener(this);
		paper.setBorder(new LineBorder(Color.WHITE, 3));

		scissors = new JButton();
		scissors.setBounds(1065, 390, 271, 385);
		scissors.addActionListener(this);
		scissors.setFocusable(false);
		scissors.setIcon(scissorsImage);
		scissors.addActionListener(this);
		scissors.setBorder(new LineBorder(Color.WHITE, 3));

		opponent = new JButton();
		opponent.setBounds(640, 0, 271, 385);
		opponent.addActionListener(this);
		opponent.setFocusable(false);
		opponent.setIcon(null);
		opponent.addActionListener(this);
		opponent.setVisible(false);
		opponent.setBorder(new LineBorder(Color.WHITE, 3));

		this.setContentPane(new JLabel(new ImageIcon("rockpaperscissors.jpg")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1536, 864);
		this.setMinimumSize(new Dimension(1536, 864));
		this.setVisible(true);
		this.pack();

		this.add(confirmButton);

		this.add(paper);
		this.add(rock);
		this.add(scissors);

		this.add(opponent);


	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rock) {
			rock.setBorder(new LineBorder(Color.RED, 10));
			paper.setBorder(new LineBorder(Color.WHITE, 3));
			scissors.setBorder(new LineBorder(Color.WHITE, 3));
			chosenCard = 1;
		}

		if (e.getSource() == paper) {
			paper.setBorder(new LineBorder(Color.RED, 10));
			rock.setBorder(new LineBorder(Color.WHITE, 3));
			scissors.setBorder(new LineBorder(Color.WHITE, 3));
			chosenCard = 2;
		}

		if (e.getSource() == scissors) {
			scissors.setBorder(new LineBorder(Color.RED, 10));
			paper.setBorder(new LineBorder(Color.WHITE, 3));
			rock.setBorder(new LineBorder(Color.WHITE, 3));
			chosenCard = 3;
		}

		if (e.getSource() == confirmButton) {
			if (chosenCard == 0) {
				JOptionPane.showMessageDialog(null, "Pick a card!", "Pick a card", JOptionPane.ERROR_MESSAGE);
			} else {
				if (chosenCard == 1) {
					opponent.setIcon(rotatedPaperImage);
					opponent.setVisible(true);
					int action = JOptionPane.showOptionDialog(null, "Your opponent chose to go first!", "You Lost!",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Options, 0);
					if (action == 0) {
						goFirst = true;
						dispose();
						new DuelFrame();
					}
				}

				if (chosenCard == 2) {
					opponent.setIcon(rotatedScissorsImage);
					opponent.setVisible(true);
					int action = JOptionPane.showOptionDialog(null, "Your opponent chose to go first!", "You Lost!",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Options, 0);
					if (action == 0) {
						goFirst = true;
						dispose();
						new DuelFrame();
					}

				}

				if (chosenCard == 3) {
					opponent.setIcon(rotatedRockImage);
					opponent.setVisible(true);
					int action = JOptionPane.showOptionDialog(null, "Your opponent chose to go first!", "You Lost!",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Options, 0);
					if (action == 0) {
						goFirst = true;
						dispose();
						new DuelFrame();
					}

				}
			}
		}

	}


}
