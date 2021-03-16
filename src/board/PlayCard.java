package board;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PlayCard {

	static String[] monsterOptions = { "Summon", "Set", "Cancel" };
	static String[] spellOptions = { "Activate", "Set", "Cancel" };
	static String[] trapOptions = { "Set", "Cancel" };

	public static boolean normalSummoned = false;

	public static boolean playCard(JButton handSlot) {

		CheckCardInHandForBigCardInfo.checkCardInHandForBigCardInfo((JButton) handSlot);
		Icon card = handSlot.getIcon();
		int cardType = CheckCardType.checkCardType(card);
		if (cardType == 0) {
			int action = JOptionPane.showOptionDialog(null, null, "Select your action",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, monsterOptions, 0);

			if (normalSummoned == false) {
				if (action == 0) {
					boolean summon = CheckZoneToSummon.checkZoneToSummon(card);
					if (summon == true) {
						handSlot.setIcon(null);
						handSlot.setVisible(false);
						PlayCard.normalSummoned = true;
						return true;
					}
				} else if (action == 1) {
				boolean set = CheckZoneToSetMonster.checkZoneToSetMonster(card);
				if (set == true) {
					handSlot.setIcon(null);
					handSlot.setVisible(false);
					PlayCard.normalSummoned = true;
					return true;
				}
			} else if (action == 2) {
				return true;
			}
		} else if (action != 2) {
			JOptionPane.showMessageDialog(null, "You can only normal summon once per turn!");
		}

		} else if (cardType == 1) {
			int action = JOptionPane.showOptionDialog(null, null, "Select your action",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, spellOptions, 0);
			if (action == 0) {
				boolean activate = CheckZoneToActivate.checkZoneToActivate(card);
				if (activate == true) {
					SpellEffects.spellEffects(card);
					handSlot.setIcon(null);
					handSlot.setVisible(false);
					return true;
				}
			} else if (action == 1) {
				boolean set = CheckZoneToSetSpell.checkZoneToSetSpell(card);
				if (set == true) {
					handSlot.setIcon(null);
					handSlot.setVisible(false);
					return true;
				}
			}
		} else if (cardType == 2) {
			int action = JOptionPane.showOptionDialog(null, null, "Select your action",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, trapOptions, 0);
			if (action == 0) {
				boolean set = CheckZoneToSetSpell.checkZoneToSetSpell(card);
				if (set == true) {
					handSlot.setIcon(null);
					handSlot.setVisible(false);
					return true;
				}
			}

		}
		return false;

	}
}
