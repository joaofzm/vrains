package board;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import cards.SmallCards;

public class CheckZoneToSetMonster {

	public static Icon currentSetMonsterZone1;
	public static Icon currentSetMonsterZone2;
	public static Icon currentSetMonsterZone3;
	public static Icon currentSetMonsterZone4;
	public static Icon currentSetMonsterZone5;

	public static boolean checkZoneToSetMonster(Icon icon) {
		if (BoardControl.playerMonster3Occupied == false) {
			currentSetMonsterZone3 = icon;
			DuelFrame.playerMonsterZone3.setIcon(SmallCards.minicover);
			BoardControl.playerMonster3Occupied = true;
			return true;
		} else if (BoardControl.playerMonster4Occupied == false) {
			currentSetMonsterZone4 = icon;
			DuelFrame.playerMonsterZone4.setIcon(SmallCards.minicover);
			BoardControl.playerMonster4Occupied = true;
			return true;
		} else if (BoardControl.playerMonster2Occupied == false) {
			currentSetMonsterZone2 = icon;
			DuelFrame.playerMonsterZone2.setIcon(SmallCards.minicover);
			BoardControl.playerMonster2Occupied = true;
			return true;
		} else if (BoardControl.playerMonster1Occupied == false) {
			currentSetMonsterZone1 = icon;
			DuelFrame.playerMonsterZone1.setIcon(SmallCards.minicover);
			BoardControl.playerMonster1Occupied = true;
			return true;
		} else if (BoardControl.playerMonster5Occupied == false) {
			currentSetMonsterZone5 = icon;
			DuelFrame.playerMonsterZone5.setIcon(SmallCards.minicover);
			BoardControl.playerMonster5Occupied = true;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "You can only control five spell and traps!",
					"You can only control five spell and traps!", 0);
			return false;
		}

	}

}
