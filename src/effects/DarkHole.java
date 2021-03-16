package effects;

import javax.swing.Icon;

import board.BoardControl;
import board.DamageControl;
import board.DuelFrame;
import cards.BigCards;
import cards.SmallCards;

public class DarkHole {

	public static boolean darkHole() {
		if (BoardControl.playerMonster1Occupied == true && DuelFrame.playerMonsterZone1.getIcon() != SmallCards.minicover ) {
			Icon icon = DuelFrame.playerMonsterZone1.getIcon();
			DuelFrame.playerGraveyard.setIcon(icon);
		} else if (BoardControl.playerMonster2Occupied == true && DuelFrame.playerMonsterZone2.getIcon() != SmallCards.minicover ) {
			Icon icon = DuelFrame.playerMonsterZone2.getIcon();
			DuelFrame.playerGraveyard.setIcon(icon);
		} else if (BoardControl.playerMonster3Occupied == true && DuelFrame.playerMonsterZone3.getIcon() != SmallCards.minicover ) {
			Icon icon = DuelFrame.playerMonsterZone3.getIcon();
			DuelFrame.playerGraveyard.setIcon(icon);
		} else if (BoardControl.playerMonster4Occupied == true && DuelFrame.playerMonsterZone4.getIcon() != SmallCards.minicover ) {
			Icon icon = DuelFrame.playerMonsterZone4.getIcon();
			DuelFrame.playerGraveyard.setIcon(icon);
		} else if (BoardControl.playerMonster5Occupied == true && DuelFrame.playerMonsterZone5.getIcon() != SmallCards.minicover ) {
			Icon icon = DuelFrame.playerMonsterZone5.getIcon();
			DuelFrame.playerGraveyard.setIcon(BigCards.sumonnedskull);
		}

		if (BoardControl.opponentMonster3Occupied == true) {
			DuelFrame.opponentGraveyard.setIcon(SmallCards.minidarkelf);
		}

		DuelFrame.playerMonsterZone1.setIcon(null);
		DuelFrame.playerMonsterZone2.setIcon(null);
		DuelFrame.playerMonsterZone3.setIcon(null);
		DuelFrame.playerMonsterZone4.setIcon(null);
		DuelFrame.playerMonsterZone5.setIcon(null);
		DamageControl.currentPlayerMonster1Attack = 0;
		DamageControl.currentPlayerMonster2Attack = 0;
		DamageControl.currentPlayerMonster3Attack = 0;
		DamageControl.currentPlayerMonster4Attack = 0;
		DamageControl.currentPlayerMonster5Attack = 0;
		DamageControl.currentPlayerMonster1Defense = 0;
		DamageControl.currentPlayerMonster2Defense = 0;
		DamageControl.currentPlayerMonster3Defense = 0;
		DamageControl.currentPlayerMonster4Defense = 0;
		DamageControl.currentPlayerMonster5Defense = 0;

		DuelFrame.opponentMonsterZone1.setIcon(null);
		DuelFrame.opponentMonsterZone2.setIcon(null);
		DuelFrame.opponentMonsterZone3.setIcon(null);
		DuelFrame.opponentMonsterZone4.setIcon(null);
		DuelFrame.opponentMonsterZone5.setIcon(null);
		DamageControl.currentOpponentMonster1Attack = 0;
		DamageControl.currentOpponentMonster2Attack = 0;
		DamageControl.currentOpponentMonster3Attack = 0;
		DamageControl.currentOpponentMonster4Attack = 0;
		DamageControl.currentOpponentMonster5Attack = 0;
		DamageControl.currentOpponentMonster1Defense = 0;
		DamageControl.currentOpponentMonster2Defense = 0;
		DamageControl.currentOpponentMonster3Defense = 0;
		DamageControl.currentOpponentMonster4Defense = 0;
		DamageControl.currentOpponentMonster5Defense = 0;

		BoardControl.playerMonster1Occupied = false;
		BoardControl.playerMonster2Occupied = false;
		BoardControl.playerMonster3Occupied = false;
		BoardControl.playerMonster4Occupied = false;
		BoardControl.playerMonster5Occupied = false;

		BoardControl.opponentMonster1Occupied = false;
		BoardControl.opponentMonster2Occupied = false;
		BoardControl.opponentMonster3Occupied = false;
		BoardControl.opponentMonster4Occupied = false;
		BoardControl.opponentMonster5Occupied = false;

		return true;

	}

}
