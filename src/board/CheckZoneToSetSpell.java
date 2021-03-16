package board;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import cards.SmallCards;

public class CheckZoneToSetSpell {

	public static Icon currentSetSpellZone1;
	public static Icon currentSetSpellZone2;
	public static Icon currentSetSpellZone3;
	public static Icon currentSetSpellZone4;
	public static Icon currentSetSpellZone5;

	public static JButton currentSettedSpellZone1 = new JButton();
	public static JButton currentSettedSpellZone2 = new JButton();
	public static JButton currentSettedSpellZone3 = new JButton();
	public static JButton currentSettedSpellZone4 = new JButton();
	public static JButton currentSettedSpellZone5 = new JButton();

	public static boolean checkZoneToSetSpell(Icon icon) {
		if (BoardControl.playerSpell3Occupied == false) {
			currentSetSpellZone3 = icon;
			currentSettedSpellZone3.setIcon(icon);
			DuelFrame.playerSpellZone3.setIcon(SmallCards.minicover);
			BoardControl.playerSpell3Occupied = true;
			return true;
		} else if (BoardControl.playerSpell4Occupied == false) {
			currentSetSpellZone4 = icon;
			currentSettedSpellZone4.setIcon(icon);
			DuelFrame.playerSpellZone4.setIcon(SmallCards.minicover);
			BoardControl.playerSpell4Occupied = true;
			return true;
		} else if (BoardControl.playerSpell2Occupied == false) {
			currentSetSpellZone2 = icon;
			currentSettedSpellZone2.setIcon(icon);
			DuelFrame.playerSpellZone2.setIcon(SmallCards.minicover);
			BoardControl.playerSpell2Occupied = true;
			return true;
		} else if (BoardControl.playerSpell1Occupied == false) {
			currentSetSpellZone1 = icon;
			currentSettedSpellZone1.setIcon(icon);
			DuelFrame.playerSpellZone1.setIcon(SmallCards.minicover);
			BoardControl.playerSpell1Occupied = true;
			return true;
		} else if (BoardControl.playerSpell5Occupied == false) {
			currentSetSpellZone5 = icon;
			currentSettedSpellZone5.setIcon(icon);
			DuelFrame.playerSpellZone5.setIcon(SmallCards.minicover);
			BoardControl.playerSpell5Occupied = true;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "You can only control five spell and traps!",
					"You can only control five spell and traps!", 0);
			return false;
		}

	}

}
