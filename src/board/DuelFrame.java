package board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import cards.BigCards;
import cards.DrawCardOpponent;
import cards.DrawCardPlayer;
import menu.Main;
import menu.SelectYourDuelistFrame;
import menu.SelectYourOpponentFrame;

public class DuelFrame extends JFrame implements ActionListener {

	public static JPanel playerHand = new JPanel();
	public static JButton playerHand1 = new JButton();
	public static JButton playerHand2 = new JButton();
	public static JButton playerHand3 = new JButton();
	public static JButton playerHand4 = new JButton();
	public static JButton playerHand5 = new JButton();
	public static JButton playerHand6 = new JButton();
	public static JButton playerHand7 = new JButton();
	public static JButton playerHand8 = new JButton();
	public static JButton playerHand9 = new JButton();
	public static JButton playerHand10 = new JButton();
	public static JButton playerHand11 = new JButton();
	public static JButton playerHand12 = new JButton();
	public static JButton playerHand13 = new JButton();
	public static JButton playerHand14 = new JButton();
	public static JButton playerHand15 = new JButton();
	public static JButton playerHand16 = new JButton();
	public static JButton playerHand17 = new JButton();
	public static JButton playerHand18 = new JButton();
	public static JButton playerHand19 = new JButton();
	public static JButton playerHand20 = new JButton();
	public static JButton playerHand21 = new JButton();
	public static JButton playerHand22 = new JButton();
	public static JButton playerHand23 = new JButton();
	public static JButton playerHand24 = new JButton();
	public static JButton playerHand25 = new JButton();
	public static JButton playerHand26 = new JButton();
	public static JButton playerHand27 = new JButton();
	public static JButton playerHand28 = new JButton();
	public static JButton playerHand29 = new JButton();
	public static JButton playerHand30 = new JButton();
	public static JButton playerHand31 = new JButton();
	public static JButton playerHand32 = new JButton();
	public static JButton playerHand33 = new JButton();
	public static JButton playerHand34 = new JButton();
	public static JButton playerHand35 = new JButton();
	public static JButton playerHand36 = new JButton();
	public static JButton playerHand37 = new JButton();
	public static JButton playerHand38 = new JButton();
	public static JButton playerHand39 = new JButton();
	public static JButton playerHand40 = new JButton();

	public static JPanel opponentHand = new JPanel();
	public static JButton opponentHand1 = new JButton();
	public static JButton opponentHand2 = new JButton();
	public static JButton opponentHand3 = new JButton();
	public static JButton opponentHand4 = new JButton();
	public static JButton opponentHand5 = new JButton();
	public static JButton opponentHand6 = new JButton();
	public static JButton opponentHand7 = new JButton();
	public static JButton opponentHand8 = new JButton();
	public static JButton opponentHand9 = new JButton();
	public static JButton opponentHand10 = new JButton();
	public static JButton opponentHand11 = new JButton();
	public static JButton opponentHand12 = new JButton();
	public static JButton opponentHand13 = new JButton();
	public static JButton opponentHand14 = new JButton();
	public static JButton opponentHand15 = new JButton();
	public static JButton opponentHand16 = new JButton();
	public static JButton opponentHand17 = new JButton();
	public static JButton opponentHand18 = new JButton();
	public static JButton opponentHand19 = new JButton();
	public static JButton opponentHand20 = new JButton();
	public static JButton opponentHand21 = new JButton();
	public static JButton opponentHand22 = new JButton();
	public static JButton opponentHand23 = new JButton();
	public static JButton opponentHand24 = new JButton();
	public static JButton opponentHand25 = new JButton();
	public static JButton opponentHand26 = new JButton();
	public static JButton opponentHand27 = new JButton();
	public static JButton opponentHand28 = new JButton();
	public static JButton opponentHand29 = new JButton();
	public static JButton opponentHand30 = new JButton();
	public static JButton opponentHand31 = new JButton();
	public static JButton opponentHand32 = new JButton();
	public static JButton opponentHand33 = new JButton();
	public static JButton opponentHand34 = new JButton();
	public static JButton opponentHand35 = new JButton();
	public static JButton opponentHand36 = new JButton();
	public static JButton opponentHand37 = new JButton();
	public static JButton opponentHand38 = new JButton();
	public static JButton opponentHand39 = new JButton();
	public static JButton opponentHand40 = new JButton();

	static JButton nextPhaseButton = new JButton();
	public static JButton returnToMenu = new JButton();

	static JLabel cardInfo = new JLabel();
	public static JLabel playerFace = new JLabel();
	public static JLabel opponentFace = new JLabel();
	public static JLabel round = new JLabel();
	public static JLabel playerLP = new JLabel();
	public static JLabel opponentLP = new JLabel();

	public static JButton playerMonsterZone1 = new JButton();
	public static JButton playerMonsterZone2 = new JButton();
	public static JButton playerMonsterZone3 = new JButton();
	public static JButton playerMonsterZone4 = new JButton();
	public static JButton playerMonsterZone5 = new JButton();
	public static JButton playerSpellZone1 = new JButton();
	public static JButton playerSpellZone2 = new JButton();
	public static JButton playerSpellZone3 = new JButton();
	public static JButton playerSpellZone4 = new JButton();
	public static JButton playerSpellZone5 = new JButton();
	public static JButton playerDeck = new JButton();
	public static JButton playerField = new JButton();
	public static JButton playerGraveyard = new JButton();
	public static JButton playerExtraDeck = new JButton();

	public static JButton opponentMonsterZone1 = new JButton();
	public static JButton opponentMonsterZone2 = new JButton();
	public static JButton opponentMonsterZone3 = new JButton();
	public static JButton opponentMonsterZone4 = new JButton();
	public static JButton opponentMonsterZone5 = new JButton();
	public static JButton opponentSpellZone1 = new JButton();
	public static JButton opponentSpellZone2 = new JButton();
	public static JButton opponentSpellZone3 = new JButton();
	public static JButton opponentSpellZone4 = new JButton();
	public static JButton opponentSpellZone5 = new JButton();
	public static JButton opponentDeck = new JButton();
	public static JButton opponentField = new JButton();
	public static JButton opponentGraveyard = new JButton();
	public static JButton opponentExtraDeck = new JButton();
	public static JButton linkZone1 = new JButton();
	public static JButton linkZone2 = new JButton();

	public DuelFrame() {

		this.setContentPane(new JLabel(new ImageIcon("board.jpg")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1536, 864);
		this.setVisible(true);
		this.setResizable(false);
		this.setBackground(Color.black);
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.black));
		this.isUndecorated();
		this.pack();

		playerHand.setLayout(null);
		playerHand.setPreferredSize(new Dimension(2000, 155));

		int i = 0;

		playerHand1.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand1.addActionListener(this);
		playerHand1.setFocusable(false);
		playerHand1.setVisible(false);
		playerHand.add(playerHand1);

		playerHand2.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand2.addActionListener(this);
		playerHand2.setFocusable(false);
		playerHand2.setVisible(false);
		playerHand.add(playerHand2);

		playerHand3.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand3.addActionListener(this);
		playerHand3.setFocusable(false);
		playerHand3.setVisible(false);
		playerHand.add(playerHand3);

		playerHand4.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand4.addActionListener(this);
		playerHand4.setFocusable(false);
		playerHand4.setVisible(false);
		playerHand.add(playerHand4);

		playerHand5.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand5.addActionListener(this);
		playerHand5.setFocusable(false);
		playerHand5.setVisible(false);
		playerHand.add(playerHand5);

		playerHand6.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand6.addActionListener(this);
		playerHand6.setVisible(false);
		playerHand.add(playerHand6);

		playerHand7.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand7.addActionListener(this);
		playerHand7.setFocusable(false);
		playerHand7.setVisible(false);
		playerHand.add(playerHand7);

		playerHand8.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand8.addActionListener(this);
		playerHand8.setFocusable(false);
		playerHand8.setVisible(false);
		playerHand.add(playerHand8);

		playerHand9.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand9.addActionListener(this);
		playerHand9.setFocusable(false);
		playerHand9.setVisible(false);
		playerHand.add(playerHand9);

		playerHand10.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand10.addActionListener(this);
		playerHand10.setFocusable(false);
		playerHand10.setVisible(false);
		playerHand.add(playerHand10);

		playerHand11.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand11.addActionListener(this);
		playerHand11.setFocusable(false);
		playerHand11.setVisible(false);
		playerHand.add(playerHand11);

		playerHand12.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand12.addActionListener(this);
		playerHand12.setFocusable(false);
		playerHand12.setVisible(false);
		playerHand.add(playerHand12);

		playerHand13.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand13.addActionListener(this);
		playerHand13.setFocusable(false);
		playerHand13.setVisible(false);
		playerHand.add(playerHand13);

		playerHand14.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand14.addActionListener(this);
		playerHand14.setFocusable(false);
		playerHand14.setVisible(false);
		playerHand.add(playerHand14);

		playerHand15.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand15.addActionListener(this);
		playerHand15.setFocusable(false);
		playerHand15.setVisible(false);
		playerHand.add(playerHand15);

		playerHand16.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand16.addActionListener(this);
		playerHand16.setFocusable(false);
		playerHand16.setVisible(false);
		playerHand.add(playerHand16);

		playerHand17.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand17.addActionListener(this);
		playerHand17.setFocusable(false);
		playerHand17.setVisible(false);
		playerHand.add(playerHand17);

		playerHand18.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand18.addActionListener(this);
		playerHand18.setFocusable(false);
		playerHand18.setVisible(false);
		playerHand.add(playerHand18);

		playerHand19.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand19.addActionListener(this);
		playerHand19.setFocusable(false);
		playerHand19.setVisible(false);
		playerHand.add(playerHand19);

		playerHand20.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand20.addActionListener(this);
		playerHand20.setFocusable(false);
		playerHand20.setVisible(false);
		playerHand.add(playerHand20);

		playerHand21.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand21.addActionListener(this);
		playerHand21.setFocusable(false);
		playerHand21.setVisible(false);
		playerHand.add(playerHand21);

		playerHand22.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand22.addActionListener(this);
		playerHand22.setFocusable(false);
		playerHand22.setVisible(false);
		playerHand.add(playerHand22);

		playerHand23.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand23.addActionListener(this);
		playerHand23.setFocusable(false);
		playerHand23.setVisible(false);
		playerHand.add(playerHand23);

		playerHand24.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand24.addActionListener(this);
		playerHand24.setFocusable(false);
		playerHand24.setVisible(false);
		playerHand.add(playerHand24);

		playerHand25.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand25.addActionListener(this);
		playerHand25.setFocusable(false);
		playerHand25.setVisible(false);
		playerHand.add(playerHand25);

		playerHand26.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand26.addActionListener(this);
		playerHand26.setFocusable(false);
		playerHand26.setVisible(false);
		playerHand.add(playerHand26);

		playerHand27.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand27.addActionListener(this);
		playerHand27.setFocusable(false);
		playerHand27.setVisible(false);
		playerHand.add(playerHand27);

		playerHand28.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand28.addActionListener(this);
		playerHand28.setFocusable(false);
		playerHand28.setVisible(false);
		playerHand.add(playerHand28);

		playerHand29.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand29.addActionListener(this);
		playerHand29.setFocusable(false);
		playerHand29.setVisible(false);
		playerHand.add(playerHand29);

		playerHand30.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand30.addActionListener(this);
		playerHand30.setFocusable(false);
		playerHand30.setVisible(false);
		playerHand.add(playerHand30);

		playerHand31.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand31.addActionListener(this);
		playerHand31.setFocusable(false);
		playerHand31.setVisible(false);
		playerHand.add(playerHand31);

		playerHand32.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand32.addActionListener(this);
		playerHand32.setFocusable(false);
		playerHand32.setVisible(false);
		playerHand.add(playerHand32);

		playerHand33.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand33.addActionListener(this);
		playerHand33.setFocusable(false);
		playerHand33.setVisible(false);
		playerHand.add(playerHand33);

		playerHand34.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand34.addActionListener(this);
		playerHand34.setFocusable(false);
		playerHand34.setVisible(false);
		playerHand.add(playerHand34);

		playerHand35.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand35.addActionListener(this);
		playerHand35.setFocusable(false);
		playerHand35.setVisible(false);
		playerHand.add(playerHand35);

		playerHand36.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand36.addActionListener(this);
		playerHand36.setFocusable(false);
		playerHand36.setVisible(false);
		playerHand.add(playerHand36);

		playerHand37.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand37.addActionListener(this);
		playerHand37.setFocusable(false);
		playerHand37.setVisible(false);
		playerHand.add(playerHand37);

		playerHand38.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand38.addActionListener(this);
		playerHand38.setFocusable(false);
		playerHand38.setVisible(false);
		playerHand.add(playerHand38);

		playerHand39.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand39.addActionListener(this);
		playerHand39.setFocusable(false);
		playerHand39.setVisible(false);
		playerHand.add(playerHand39);

		playerHand40.setBounds(i, 0, 110, 155);
		i += 80;
		playerHand40.addActionListener(this);
		playerHand40.setFocusable(false);
		playerHand40.setVisible(false);
		playerHand.add(playerHand40);

		JScrollPane playerHandScroll = new JScrollPane(playerHand, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		playerHandScroll.setEnabled(true);
		playerHandScroll.setBounds(0, 702, 500, 155);

		this.add(playerHandScroll);

		opponentHand.setLayout(null);
		opponentHand.setPreferredSize(new Dimension(1500, 155));

		i = 0;

		opponentHand1.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand1.addActionListener(this);
		opponentHand1.setFocusable(false);
		opponentHand1.setVisible(false);
		opponentHand.add(opponentHand1);

		opponentHand2.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand2.addActionListener(this);
		opponentHand2.setFocusable(false);
		opponentHand2.setVisible(false);
		opponentHand.add(opponentHand2);

		opponentHand3.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand3.addActionListener(this);
		opponentHand3.setFocusable(false);
		opponentHand3.setVisible(false);
		opponentHand.add(opponentHand3);

		opponentHand4.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand4.addActionListener(this);
		opponentHand4.setFocusable(false);
		opponentHand4.setVisible(false);
		opponentHand.add(opponentHand4);

		opponentHand5.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand5.addActionListener(this);
		opponentHand5.setFocusable(false);
		opponentHand5.setVisible(false);
		opponentHand.add(opponentHand5);

		opponentHand6.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand6.addActionListener(this);
		opponentHand6.setVisible(false);
		opponentHand.add(opponentHand6);

		opponentHand7.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand7.addActionListener(this);
		opponentHand7.setFocusable(false);
		opponentHand7.setVisible(false);
		opponentHand.add(opponentHand7);

		opponentHand8.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand8.addActionListener(this);
		opponentHand8.setFocusable(false);
		opponentHand8.setVisible(false);
		opponentHand.add(opponentHand8);

		opponentHand9.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand9.addActionListener(this);
		opponentHand9.setFocusable(false);
		opponentHand9.setVisible(false);
		opponentHand.add(opponentHand9);

		opponentHand10.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand10.addActionListener(this);
		opponentHand10.setFocusable(false);
		opponentHand10.setVisible(false);
		opponentHand.add(opponentHand10);

		opponentHand11.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand11.addActionListener(this);
		opponentHand11.setFocusable(false);
		opponentHand11.setVisible(false);
		opponentHand.add(opponentHand11);

		opponentHand12.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand12.addActionListener(this);
		opponentHand12.setFocusable(false);
		opponentHand12.setVisible(false);
		opponentHand.add(opponentHand12);

		opponentHand13.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand13.addActionListener(this);
		opponentHand13.setFocusable(false);
		opponentHand13.setVisible(false);
		opponentHand.add(opponentHand13);

		opponentHand14.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand14.addActionListener(this);
		opponentHand14.setFocusable(false);
		opponentHand14.setVisible(false);
		opponentHand.add(opponentHand14);

		opponentHand15.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand15.addActionListener(this);
		opponentHand15.setFocusable(false);
		opponentHand15.setVisible(false);
		opponentHand.add(opponentHand15);

		opponentHand16.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand16.addActionListener(this);
		opponentHand16.setFocusable(false);
		opponentHand16.setVisible(false);
		opponentHand.add(opponentHand16);

		opponentHand17.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand17.addActionListener(this);
		opponentHand17.setFocusable(false);
		opponentHand17.setVisible(false);
		opponentHand.add(opponentHand17);

		opponentHand18.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand18.addActionListener(this);
		opponentHand18.setFocusable(false);
		opponentHand18.setVisible(false);
		opponentHand.add(opponentHand18);

		opponentHand19.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand19.addActionListener(this);
		opponentHand19.setFocusable(false);
		opponentHand19.setVisible(false);
		opponentHand.add(opponentHand19);

		opponentHand20.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand20.addActionListener(this);
		opponentHand20.setFocusable(false);
		opponentHand20.setVisible(false);
		opponentHand.add(opponentHand20);

		opponentHand21.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand21.addActionListener(this);
		opponentHand21.setFocusable(false);
		opponentHand21.setVisible(false);
		opponentHand.add(opponentHand21);

		opponentHand22.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand22.addActionListener(this);
		opponentHand22.setFocusable(false);
		opponentHand22.setVisible(false);
		opponentHand.add(opponentHand22);

		opponentHand23.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand23.addActionListener(this);
		opponentHand23.setFocusable(false);
		opponentHand23.setVisible(false);
		opponentHand.add(opponentHand23);

		opponentHand24.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand24.addActionListener(this);
		opponentHand24.setFocusable(false);
		opponentHand24.setVisible(false);
		opponentHand.add(opponentHand24);

		opponentHand25.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand25.addActionListener(this);
		opponentHand25.setFocusable(false);
		opponentHand25.setVisible(false);
		opponentHand.add(opponentHand25);

		opponentHand26.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand26.addActionListener(this);
		opponentHand26.setFocusable(false);
		opponentHand26.setVisible(false);
		opponentHand.add(opponentHand26);

		opponentHand27.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand27.addActionListener(this);
		opponentHand27.setFocusable(false);
		opponentHand27.setVisible(false);
		opponentHand.add(opponentHand27);

		opponentHand28.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand28.addActionListener(this);
		opponentHand28.setFocusable(false);
		opponentHand28.setVisible(false);
		opponentHand.add(opponentHand28);

		opponentHand29.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand29.addActionListener(this);
		opponentHand29.setFocusable(false);
		opponentHand29.setVisible(false);
		opponentHand.add(opponentHand29);

		opponentHand30.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand30.addActionListener(this);
		opponentHand30.setFocusable(false);
		opponentHand30.setVisible(false);
		opponentHand.add(opponentHand30);

		opponentHand31.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand31.addActionListener(this);
		opponentHand31.setFocusable(false);
		opponentHand31.setVisible(false);
		opponentHand.add(opponentHand31);

		opponentHand32.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand32.addActionListener(this);
		opponentHand32.setFocusable(false);
		opponentHand32.setVisible(false);
		opponentHand.add(opponentHand32);

		opponentHand33.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand33.addActionListener(this);
		opponentHand33.setFocusable(false);
		opponentHand33.setVisible(false);
		opponentHand.add(opponentHand33);

		opponentHand34.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand34.addActionListener(this);
		opponentHand34.setFocusable(false);
		opponentHand34.setVisible(false);
		opponentHand.add(opponentHand34);

		opponentHand35.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand35.addActionListener(this);
		opponentHand35.setFocusable(false);
		opponentHand35.setVisible(false);
		opponentHand.add(opponentHand35);

		opponentHand36.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand36.addActionListener(this);
		opponentHand36.setFocusable(false);
		opponentHand36.setVisible(false);
		opponentHand.add(opponentHand36);

		opponentHand37.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand37.addActionListener(this);
		opponentHand37.setFocusable(false);
		opponentHand37.setVisible(false);
		opponentHand.add(opponentHand37);

		opponentHand38.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand38.addActionListener(this);
		opponentHand38.setFocusable(false);
		opponentHand38.setVisible(false);
		opponentHand.add(opponentHand38);

		opponentHand39.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand39.addActionListener(this);
		opponentHand39.setFocusable(false);
		opponentHand39.setVisible(false);
		opponentHand.add(opponentHand39);

		opponentHand40.setBounds(i, 0, 110, 155);
		i += 80;
		opponentHand40.addActionListener(this);
		opponentHand40.setFocusable(false);
		opponentHand40.setVisible(false);
		opponentHand.add(opponentHand40);

		JScrollPane opponentHandScroll = new JScrollPane(opponentHand, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		opponentHandScroll.setEnabled(true);
		opponentHandScroll.setBounds(0, 0, 500, 155);

		this.add(opponentHandScroll);

		nextPhaseButton.setBounds(955, 450, 150, 50);
		nextPhaseButton.addActionListener(this);
		nextPhaseButton.setText("Battle phase");
		nextPhaseButton.setFont(new Font("Impact", Font.BOLD, 16));
		nextPhaseButton.setForeground(Color.white);
		nextPhaseButton.setBackground(new Color(0x982f30));
		nextPhaseButton.setFocusable(false);
		this.add(nextPhaseButton);

		cardInfo.setBounds(0, 225, 271, 395);
		cardInfo.setIcon(BigCards.cover);
		cardInfo.setBackground(Color.black);
		cardInfo.setBorder(BorderFactory.createLineBorder(Color.white));
		this.add(cardInfo);

		playerFace.setBounds(518, 822, 145, 40);
		playerFace.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		switch (SelectYourDuelistFrame.chosenDuelist) {
		case 1:
			playerFace.setIcon(SelectYourDuelistFrame.revolverImage);
			break;
		case 2:
			playerFace.setIcon(SelectYourDuelistFrame.soulBurnerImage);
			break;
		case 3:
			playerFace.setIcon(SelectYourDuelistFrame.reijiImage);
			break;
		case 4:
			playerFace.setIcon(SelectYourDuelistFrame.playMakerImage);
			break;
		}
		this.add(playerFace);

		opponentFace.setBounds(1390, 5, 145, 40);
		opponentFace.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		switch (SelectYourOpponentFrame.chosenOpponent) {
		case 1:
			opponentFace.setIcon(SelectYourDuelistFrame.revolverImage);
			break;
		case 2:
			opponentFace.setIcon(SelectYourDuelistFrame.soulBurnerImage);
			break;
		case 3:
			opponentFace.setIcon(SelectYourDuelistFrame.reijiImage);
			break;
		case 4:
			opponentFace.setIcon(SelectYourDuelistFrame.playMakerImage);
			break;
		}
		this.add(opponentFace);

		playerLP.setBounds(1390, 822, 145, 40);
		playerLP.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		playerLP.setFont(new Font("Impact", Font.PLAIN, 20));
		playerLP.setHorizontalTextPosition(JLabel.CENTER);
		playerLP.setVerticalTextPosition(JLabel.CENTER);
		playerLP.setForeground(Color.white);
		playerLP.setText("             " + Main.playerLifePoints);
		this.add(playerLP);

		opponentLP.setBounds(518, 5, 145, 40);
		opponentLP.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		opponentLP.setFont(new Font("Impact", Font.PLAIN, 20));
		opponentLP.setHorizontalTextPosition(JLabel.CENTER);
		opponentLP.setVerticalTextPosition(JLabel.CENTER);
		opponentLP.setForeground(Color.white);
		opponentLP.setText("             " + Main.opponentLifePoints);
		this.add(opponentLP);

		round.setBounds(995, 367, 60, 60);
		round.setBorder(BorderFactory.createLineBorder(Color.red));
		round.setFont(new Font("Impact", Font.PLAIN, 30));
		round.setHorizontalTextPosition(JLabel.CENTER);
		round.setVerticalTextPosition(JLabel.CENTER);
		round.setForeground(Color.white);
		round.setText("     " + Main.round);
		this.add(round);

		linkZone1.setBounds(823, 357, 110, 155);
		linkZone1.setBorder(BorderFactory.createLineBorder(Color.cyan));
		linkZone1.addActionListener(this);
		this.add(linkZone1);

		linkZone2.setBounds(1121, 357, 110, 155);
		linkZone2.setBorder(BorderFactory.createLineBorder(Color.cyan));
		linkZone2.addActionListener(this);
		this.add(linkZone2);

		playerField.setBounds(538, 482, 110, 155);
		playerField.setBorder(BorderFactory.createLineBorder(Color.green));
		playerField.addActionListener(this);
		this.add(playerField);

		playerDeck.setBounds(1408, 657, 110, 155);
		playerDeck.setBorder(BorderFactory.createLineBorder(Color.orange));
		playerDeck.addActionListener(this);
		this.add(playerDeck);

		playerExtraDeck.setBounds(538, 657, 110, 155);
		playerExtraDeck.setBorder(BorderFactory.createLineBorder(Color.pink));
		playerExtraDeck.addActionListener(this);
		this.add(playerExtraDeck);

		playerGraveyard.setBounds(1408, 482, 110, 155);
		playerGraveyard.setBorder(BorderFactory.createLineBorder(Color.red));
		playerGraveyard.addActionListener(this);
		this.add(playerGraveyard);

		playerMonsterZone1.setBounds(676, 532, 110, 155);
		playerMonsterZone1.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone1.addActionListener(this);
		this.add(playerMonsterZone1);

		playerMonsterZone2.setBounds(823, 532, 110, 155);
		playerMonsterZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone2.addActionListener(this);
		this.add(playerMonsterZone2);

		playerMonsterZone3.setBounds(972, 532, 110, 155);
		playerMonsterZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone3.addActionListener(this);
		this.add(playerMonsterZone3);

		playerMonsterZone4.setBounds(1121, 532, 110, 155);
		playerMonsterZone4.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone4.addActionListener(this);
		this.add(playerMonsterZone4);

		playerMonsterZone5.setBounds(1270, 532, 110, 155);
		playerMonsterZone5.setBorder(BorderFactory.createLineBorder(Color.white));
		playerMonsterZone5.addActionListener(this);
		this.add(playerMonsterZone5);

		playerSpellZone1.setBounds(676, 707, 110, 155);
		playerSpellZone1.setBorder(BorderFactory.createLineBorder(Color.white));
		playerSpellZone1.addActionListener(this);
		this.add(playerSpellZone1);

		playerSpellZone2.setBounds(823, 707, 110, 155);
		playerSpellZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		playerSpellZone2.addActionListener(this);
		this.add(playerSpellZone2);

		playerSpellZone3.setBounds(972, 707, 110, 155);
		playerSpellZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		playerSpellZone3.addActionListener(this);
		this.add(playerSpellZone3);

		playerSpellZone4.setBounds(1121, 707, 110, 155);
		playerSpellZone4.setBorder(BorderFactory.createLineBorder(Color.white));
		playerSpellZone4.addActionListener(this);
		this.add(playerSpellZone4);

		playerSpellZone5.setBounds(1270, 707, 110, 155);
		playerSpellZone5.setBorder(BorderFactory.createLineBorder(Color.white));
		linkZone2.addActionListener(this);
		this.add(playerSpellZone5);

		opponentField.setBounds(1408, 231, 110, 155);
		opponentField.setBorder(BorderFactory.createLineBorder(Color.green));
		opponentField.addActionListener(this);
		this.add(opponentField);

		opponentDeck.setBounds(538, 55, 110, 155);
		;
		opponentDeck.setBorder(BorderFactory.createLineBorder(Color.orange));
		opponentDeck.addActionListener(this);
		this.add(opponentDeck);

		opponentExtraDeck.setBounds(1408, 55, 110, 155);
		opponentExtraDeck.setBorder(BorderFactory.createLineBorder(Color.pink));
		opponentExtraDeck.addActionListener(this);
		this.add(opponentExtraDeck);

		opponentGraveyard.setBounds(538, 231, 110, 155);
		opponentGraveyard.setBorder(BorderFactory.createLineBorder(Color.red));
		opponentGraveyard.addActionListener(this);
		this.add(opponentGraveyard);

		opponentMonsterZone1.setBounds(676, 181, 110, 155);
		opponentMonsterZone1.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone1.addActionListener(this);
		this.add(opponentMonsterZone1);

		opponentMonsterZone2.setBounds(823, 181, 110, 155);
		opponentMonsterZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone2.addActionListener(this);
		this.add(opponentMonsterZone2);

		opponentMonsterZone3.setBounds(972, 181, 110, 155);
		opponentMonsterZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		linkZone2.addActionListener(this);
		this.add(opponentMonsterZone3);

		opponentMonsterZone4.setBounds(1121, 181, 110, 155);
		opponentMonsterZone4.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone4.addActionListener(this);
		this.add(opponentMonsterZone4);

		opponentMonsterZone5.setBounds(1270, 181, 110, 155);
		opponentMonsterZone5.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentMonsterZone5.addActionListener(this);
		this.add(opponentMonsterZone5);

		opponentSpellZone1.setBounds(676, 5, 110, 155);
		opponentSpellZone1.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentSpellZone1.addActionListener(this);
		this.add(opponentSpellZone1);

		opponentSpellZone2.setBounds(823, 5, 110, 155);
		opponentSpellZone2.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentSpellZone2.addActionListener(this);
		this.add(opponentSpellZone2);

		opponentSpellZone3.setBounds(972, 5, 110, 155);
		opponentSpellZone3.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentSpellZone3.addActionListener(this);
		this.add(opponentSpellZone3);

		opponentSpellZone4.setBounds(1121, 5, 110, 155);
		opponentSpellZone4.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentSpellZone4.addActionListener(this);
		this.add(opponentSpellZone4);

		opponentSpellZone5.setBounds(1270, 5, 110, 155);
		opponentSpellZone5.setBorder(BorderFactory.createLineBorder(Color.white));
		opponentSpellZone5.addActionListener(this);
		this.add(opponentSpellZone5);

		DrawCardPlayer.drawCardPlayer();
		DrawCardPlayer.drawCardPlayer();
		DrawCardPlayer.drawCardPlayer();
		DrawCardPlayer.drawCardPlayer();
		DrawCardPlayer.drawCardPlayer();

		DrawCardOpponent.drawCardOpponent();
		DrawCardOpponent.drawCardOpponent();
		DrawCardOpponent.drawCardOpponent();
		DrawCardOpponent.drawCardOpponent();
		DrawCardOpponent.drawCardOpponent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextPhaseButton) {
			cardInfo.setIcon(BigCards.raigeki);
			nextPhaseButton.setText("Main phase 2");
			Main.damagePlayer(2000);
			DrawCardPlayer.drawCardPlayer();
		}

		if (e.getSource() == DuelFrame.playerHand1) {
			boolean played = PlayCard.playCard(playerHand1);
			if (played == true) {
				HandControl.playerHand1Occupied = false;
			}
		}

		if (e.getSource() == playerHand2) {
			boolean played = PlayCard.playCard(playerHand2);
			if (played == true) {
				HandControl.playerHand2Occupied = false;
			}
		}

		if (e.getSource() == playerHand3) {
			boolean played = PlayCard.playCard(playerHand3);
			if (played == true) {
				HandControl.playerHand3Occupied = false;
			}
		}

		if (e.getSource() == playerHand4) {
			boolean played = PlayCard.playCard(playerHand4);
			if (played == true) {
				HandControl.playerHand4Occupied = false;
			}
		}

		if (e.getSource() == playerHand5) {
			boolean played = PlayCard.playCard(playerHand5);
			if (played == true) {
				HandControl.playerHand5Occupied = false;
			}
		}

		if (e.getSource() == playerHand6) {
			boolean played = PlayCard.playCard(playerHand6);
			if (played == true) {
				HandControl.playerHand6Occupied = false;
			}
		}

	}
}
