package board;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import cards.SmallCards;

public class CheckZoneToSetSpell {

	public static Icon currentSetSpellZone1;
	public static Icon currentSetSpellZone2;
	public static Icon currentSetSpellZone3;
	public static Icon currentSetSpellZone4;
	public static Icon currentSetSpellZone5;

	public static boolean checkZoneToSetSpell(Icon icon) {
		if (BoardControl.playerSpell3Occupied == false) {
			currentSetSpellZone3 = icon;
			DuelFrame.playerSpellZone3.setIcon(SmallCards.minicover);
			BoardControl.playerSpell3Occupied = true;
			return true;
		} else if (BoardControl.playerSpell4Occupied == false) {
			currentSetSpellZone4 = icon;
			DuelFrame.playerSpellZone4.setIcon(SmallCards.minicover);
			BoardControl.playerSpell4Occupied = true;
			return true;
		} else if (BoardControl.playerSpell2Occupied == false) {
			currentSetSpellZone2 = icon;
			DuelFrame.playerSpellZone2.setIcon(SmallCards.minicover);
			BoardControl.playerSpell2Occupied = true;
			return true;
		} else if (BoardControl.playerSpell1Occupied == false) {
			currentSetSpellZone1 = icon;
			DuelFrame.playerSpellZone1.setIcon(SmallCards.minicover);
			BoardControl.playerSpell1Occupied = true;
			return true;
		} else if (BoardControl.playerSpell5Occupied == false) {
			currentSetSpellZone5 = icon;
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
