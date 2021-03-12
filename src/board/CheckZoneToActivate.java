package board;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class CheckZoneToActivate {

	public static boolean checkZoneToActivate (Icon icon) {
		if (BoardControl.playerSpell3Occupied==false) {
			DuelFrame.playerSpellZone3.setIcon(icon);
			BoardControl.playerSpell3Occupied=true;
			return true;
		} else if (BoardControl.playerSpell4Occupied==false) {
			DuelFrame.playerSpellZone4.setIcon(icon);
			BoardControl.playerSpell4Occupied=true;
			return true;
		} else if (BoardControl.playerSpell2Occupied==false) {
			DuelFrame.playerSpellZone2.setIcon(icon);
			BoardControl.playerSpell2Occupied=true;
			return true;
		} else if (BoardControl.playerSpell1Occupied==false) {
			DuelFrame.playerSpellZone1.setIcon(icon);
			BoardControl.playerSpell1Occupied=true;
			return true;
		} else if (BoardControl.playerSpell5Occupied==false) {
			DuelFrame.playerSpellZone5.setIcon(icon);
			BoardControl.playerSpell5Occupied=true;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "You can only control five monsters!", "You can only control five monsters!", 0);
			return false;
		}
		
	}


}

