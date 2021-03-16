package board;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import cards.SmallCards;

public class CheckZoneToSetMonster {

	public static Icon currentSetMonsterZone1;
	public static Icon currentSetMonsterZone2;
	public static Icon currentSetMonsterZone3;
	public static Icon currentSetMonsterZone4;
	public static Icon currentSetMonsterZone5;

	public static JButton currentSettedMonsterZone1 = new JButton();
	public static JButton currentSettedMonsterZone2 = new JButton();
	public static JButton currentSettedMonsterZone3 = new JButton();
	public static JButton currentSettedMonsterZone4 = new JButton();
	public static JButton currentSettedMonsterZone5 = new JButton();

	public static boolean checkZoneToSetMonster(Icon icon) {
		if (BoardControl.playerMonster3Occupied == false) {
			DuelFrame.playerMonsterZone3.setIcon(SmallCards.minidefensecover);
			BoardControl.playerMonster3Occupied = true;
			currentSetMonsterZone3 = icon;
			currentSettedMonsterZone3.setIcon(currentSetMonsterZone3);
			if (icon == SmallCards.minisumonnedskull) {
				DamageControl.currentPlayerMonster3Attack = 2000;
				DamageControl.currentPlayerMonster3Defense = 100;
				return true;
			} else if (icon == SmallCards.minidarkelf) {
				DamageControl.currentPlayerMonster3Attack = 2000;
				DamageControl.currentPlayerMonster3Defense = 0;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				DamageControl.currentPlayerMonster3Attack = 1900;
				DamageControl.currentPlayerMonster3Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				DamageControl.currentPlayerMonster3Attack = 1800;
				DamageControl.currentPlayerMonster3Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				DamageControl.currentPlayerMonster3Attack = 1900;
				DamageControl.currentPlayerMonster3Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				DamageControl.currentPlayerMonster3Attack = 1200;
				DamageControl.currentPlayerMonster3Defense = 1500;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				DamageControl.currentPlayerMonster3Attack = 1800;
				DamageControl.currentPlayerMonster3Defense = 800;
				return true;
			}

		} else if (BoardControl.playerMonster4Occupied == false) {
			DuelFrame.playerMonsterZone4.setIcon(SmallCards.minidefensecover);
			BoardControl.playerMonster4Occupied = true;
			currentSetMonsterZone4 = icon;
			currentSettedMonsterZone4.setIcon(currentSetMonsterZone4);
			if (icon == SmallCards.minisumonnedskull) {
				DamageControl.currentPlayerMonster4Attack = 2000;
				DamageControl.currentPlayerMonster4Defense = 100;
				return true;
			} else if (icon == SmallCards.minidarkelf) {
				DamageControl.currentPlayerMonster4Attack = 2000;
				DamageControl.currentPlayerMonster4Defense = 0;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				DamageControl.currentPlayerMonster4Attack = 1900;
				DamageControl.currentPlayerMonster4Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				DamageControl.currentPlayerMonster4Attack = 1800;
				DamageControl.currentPlayerMonster4Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				DamageControl.currentPlayerMonster4Attack = 1900;
				DamageControl.currentPlayerMonster4Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				DamageControl.currentPlayerMonster4Attack = 1200;
				DamageControl.currentPlayerMonster4Defense = 1500;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				DamageControl.currentPlayerMonster4Attack = 1800;
				DamageControl.currentPlayerMonster4Defense = 800;
				return true;
			}
		} else if (BoardControl.playerMonster2Occupied == false) {
			DuelFrame.playerMonsterZone2.setIcon(SmallCards.minidefensecover);
			BoardControl.playerMonster2Occupied = true;
			currentSetMonsterZone2 = icon;
			currentSettedMonsterZone2.setIcon(currentSetMonsterZone2);
			if (icon == SmallCards.minisumonnedskull) {
				DamageControl.currentPlayerMonster2Attack = 2000;
				DamageControl.currentPlayerMonster2Defense = 100;
				return true;
			} else if (icon == SmallCards.minidarkelf) {
				DamageControl.currentPlayerMonster2Attack = 2000;
				DamageControl.currentPlayerMonster2Defense = 0;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				DamageControl.currentPlayerMonster2Attack = 1900;
				DamageControl.currentPlayerMonster2Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				DamageControl.currentPlayerMonster2Attack = 1800;
				DamageControl.currentPlayerMonster2Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				DamageControl.currentPlayerMonster2Attack = 1900;
				DamageControl.currentPlayerMonster2Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				DamageControl.currentPlayerMonster2Attack = 1200;
				DamageControl.currentPlayerMonster2Defense = 1500;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				DamageControl.currentPlayerMonster2Attack = 1800;
				DamageControl.currentPlayerMonster2Defense = 800;
				return true;
			}

		} else if (BoardControl.playerMonster1Occupied == false) {
			DuelFrame.playerMonsterZone1.setIcon(SmallCards.minidefensecover);
			BoardControl.playerMonster1Occupied = true;
			currentSetMonsterZone1 = icon;
			currentSettedMonsterZone1.setIcon(currentSetMonsterZone1);
			if (icon == SmallCards.minisumonnedskull) {
				DamageControl.currentPlayerMonster1Attack = 2000;
				DamageControl.currentPlayerMonster1Defense = 100;
				return true;
			} else if (icon == SmallCards.minidarkelf) {
				DamageControl.currentPlayerMonster1Attack = 2000;
				DamageControl.currentPlayerMonster1Defense = 0;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				DamageControl.currentPlayerMonster1Attack = 1900;
				DamageControl.currentPlayerMonster1Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				DamageControl.currentPlayerMonster1Attack = 1800;
				DamageControl.currentPlayerMonster1Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				DamageControl.currentPlayerMonster1Attack = 1900;
				DamageControl.currentPlayerMonster1Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				DamageControl.currentPlayerMonster1Attack = 1200;
				DamageControl.currentPlayerMonster1Defense = 1500;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				DamageControl.currentPlayerMonster1Attack = 1800;
				DamageControl.currentPlayerMonster1Defense = 800;
				return true;
			}
		} else if (BoardControl.playerMonster5Occupied == false) {
			DuelFrame.playerMonsterZone5.setIcon(SmallCards.minidefensecover);
			BoardControl.playerMonster5Occupied = true;
			currentSetMonsterZone5 = icon;
			currentSettedMonsterZone5.setIcon(currentSetMonsterZone5);
			if (icon == SmallCards.minisumonnedskull) {
				DamageControl.currentPlayerMonster5Attack = 2000;
				DamageControl.currentPlayerMonster5Defense = 100;
				return true;
			} else if (icon == SmallCards.minidarkelf) {
				DamageControl.currentPlayerMonster5Attack = 2000;
				DamageControl.currentPlayerMonster5Defense = 0;
				return true;
			} else if (icon == SmallCards.minigeminielf) {
				DamageControl.currentPlayerMonster5Attack = 1900;
				DamageControl.currentPlayerMonster5Defense = 900;
				return true;
			} else if (icon == SmallCards.minilajinn) {
				DamageControl.currentPlayerMonster5Attack = 1800;
				DamageControl.currentPlayerMonster5Defense = 1000;
				return true;
			} else if (icon == SmallCards.minilusterdragon) {
				DamageControl.currentPlayerMonster5Attack = 1900;
				DamageControl.currentPlayerMonster5Defense = 1600;
				return true;
			} else if (icon == SmallCards.minimaneaterbug) {
				DamageControl.currentPlayerMonster5Attack = 1200;
				DamageControl.currentPlayerMonster5Defense = 1500;
				return true;
			} else if (icon == SmallCards.minisevencoloredfish) {
				DamageControl.currentPlayerMonster5Attack = 1800;
				DamageControl.currentPlayerMonster5Defense = 800;
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