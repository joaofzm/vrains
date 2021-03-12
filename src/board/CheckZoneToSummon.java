package board;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import cards.SmallCards;

public class CheckZoneToSummon {

	public static int currentPlayerMonster1Attack;
	public static int currentPlayerMonster2Attack;
	public static int currentPlayerMonster3Attack;
	public static int currentPlayerMonster4Attack;
	public static int currentPlayerMonster5Attack;

	public static int currentPlayerMonster1Defense;
	public static int currentPlayerMonster2Defense;
	public static int currentPlayerMonster3Defense;
	public static int currentPlayerMonster4Defense;
	public static int currentPlayerMonster5Defense;

	public static boolean checkZoneToSummon(Icon icon) {
		if (BoardControl.playerMonster3Occupied == false) {
			DuelFrame.playerMonsterZone3.setIcon(icon);
			BoardControl.playerMonster3Occupied = true;
			if (icon == SmallCards.minisumonnedskull) {
				currentPlayerMonster3Attack = 2500;
				currentPlayerMonster3Defense = 1200;
			} else if (icon == SmallCards.minidarkelf) {
				currentPlayerMonster3Attack = 2000;
				currentPlayerMonster3Defense = 800;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				currentPlayerMonster3Attack = 1900;
				currentPlayerMonster3Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				currentPlayerMonster3Attack = 1800;
				currentPlayerMonster3Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				currentPlayerMonster3Attack = 1900;
				currentPlayerMonster3Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				currentPlayerMonster3Attack = 450;
				currentPlayerMonster3Defense = 600;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				currentPlayerMonster3Attack = 1800;
				currentPlayerMonster3Defense = 800;
				return true;
			}

		} else if (BoardControl.playerMonster4Occupied == false) {
			DuelFrame.playerMonsterZone4.setIcon(icon);
			BoardControl.playerMonster4Occupied = true;
			if (icon == SmallCards.minisumonnedskull) {
				currentPlayerMonster4Attack = 2500;
				currentPlayerMonster4Defense = 1200;
			} else if (icon == SmallCards.minidarkelf) {
				currentPlayerMonster4Attack = 2000;
				currentPlayerMonster4Defense = 800;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				currentPlayerMonster4Attack = 1900;
				currentPlayerMonster4Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				currentPlayerMonster4Attack = 1800;
				currentPlayerMonster4Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				currentPlayerMonster4Attack = 1900;
				currentPlayerMonster4Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				currentPlayerMonster4Attack = 450;
				currentPlayerMonster4Defense = 600;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				currentPlayerMonster4Attack = 1800;
				currentPlayerMonster4Defense = 800;
				return true;
			}
		} else if (BoardControl.playerMonster2Occupied == false) {
			DuelFrame.playerMonsterZone2.setIcon(icon);
			BoardControl.playerMonster2Occupied = true;
			if (icon == SmallCards.minisumonnedskull) {
				currentPlayerMonster2Attack = 2500;
				currentPlayerMonster2Defense = 1200;
			} else if (icon == SmallCards.minidarkelf) {
				currentPlayerMonster2Attack = 2000;
				currentPlayerMonster2Defense = 800;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				currentPlayerMonster2Attack = 1900;
				currentPlayerMonster2Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				currentPlayerMonster2Attack = 1800;
				currentPlayerMonster2Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				currentPlayerMonster2Attack = 1900;
				currentPlayerMonster2Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				currentPlayerMonster2Attack = 450;
				currentPlayerMonster2Defense = 600;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				currentPlayerMonster2Attack = 1800;
				currentPlayerMonster2Defense = 800;
				return true;
			}

		} else if (BoardControl.playerMonster1Occupied == false) {
			DuelFrame.playerMonsterZone1.setIcon(icon);
			BoardControl.playerMonster1Occupied = true;
			if (icon == SmallCards.minisumonnedskull) {
				currentPlayerMonster1Attack = 2500;
				currentPlayerMonster1Defense = 1200;
			} else if (icon == SmallCards.minidarkelf) {
				currentPlayerMonster1Attack = 2000;
				currentPlayerMonster1Defense = 800;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				currentPlayerMonster1Attack = 1900;
				currentPlayerMonster1Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				currentPlayerMonster1Attack = 1800;
				currentPlayerMonster1Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				currentPlayerMonster1Attack = 1900;
				currentPlayerMonster1Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				currentPlayerMonster1Attack = 450;
				currentPlayerMonster1Defense = 600;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				currentPlayerMonster1Attack = 1800;
				currentPlayerMonster1Defense = 800;
				return true;
			}
		} else if (BoardControl.playerMonster5Occupied == false) {
			DuelFrame.playerMonsterZone5.setIcon(icon);
			BoardControl.playerMonster5Occupied = true;
			if (icon == SmallCards.minisumonnedskull) {
				currentPlayerMonster5Attack = 2500;
				currentPlayerMonster5Defense = 1200;
			} else if (icon == SmallCards.minidarkelf) {
				currentPlayerMonster5Attack = 2000;
				currentPlayerMonster5Defense = 800;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				currentPlayerMonster5Attack = 1900;
				currentPlayerMonster5Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				currentPlayerMonster5Attack = 1800;
				currentPlayerMonster5Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				currentPlayerMonster5Attack = 1900;
				currentPlayerMonster5Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				currentPlayerMonster5Attack = 450;
				currentPlayerMonster5Defense = 600;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				currentPlayerMonster5Attack = 1800;
				currentPlayerMonster5Defense = 800;
				return true;
			}
		} else {
			JOptionPane.showMessageDialog(null, "You can only control five monsters!",
					"You can only control five monsters!", 0);
			return false;
		}
		return false;

	}
}