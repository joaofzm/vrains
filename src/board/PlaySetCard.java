package board;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PlaySetCard {


	static String[] spellOptions = { "Activate", "Cancel" };


	public static boolean normalSummoned = false;

	public static boolean playSetCard(JButton handSlot) {

		CheckCardInHandForBigCardInfo.checkCardInHandForBigCardInfo((JButton) handSlot);
		Icon card = handSlot.getIcon();
		int cardType = CheckCardType.checkCardType(card);

		if (cardType == 1) {
			int action = JOptionPane.showOptionDialog(null, null, "Select your action",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, spellOptions, 0);
			if (action == 0) {
					SpellEffects.spellEffects(card);
					handSlot.setIcon(null);
					handSlot.setVisible(false);
					return true;
			} else if (action == 1) {

			}
		}
		return false;

	}
}
