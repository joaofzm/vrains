package board;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class CheckZoneToActivate {

	public static boolean checkZoneToActivate(Icon icon) {
		if (BoardControl.playerSpell3Occupied == false) {
			DuelFrame.playerGraveyard.setIcon(icon);
			return true;
		} else if (BoardControl.playerSpell4Occupied == false) {
			DuelFrame.playerGraveyard.setIcon(icon);
			return true;
		} else if (BoardControl.playerSpell2Occupied == false) {
			DuelFrame.playerGraveyard.setIcon(icon);
			return true;
		} else if (BoardControl.playerSpell1Occupied == false) {
			DuelFrame.playerGraveyard.setIcon(icon);
			return true;
		} else if (BoardControl.playerSpell5Occupied == false) {
			DuelFrame.playerGraveyard.setIcon(icon);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "You can only control five spell/traps!",
					"You can only control five spell;traps!", 0);
			return false;
		}

	}

}
