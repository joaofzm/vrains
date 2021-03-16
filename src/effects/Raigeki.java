package effects;

import board.BoardControl;
import board.DuelFrame;
import cards.SmallCards;

public class Raigeki {

	public static boolean raigeki() {

		if (BoardControl.opponentMonster3Occupied == true) {
			DuelFrame.opponentMonsterZone3.setIcon(null);
			DuelFrame.opponentGraveyard.setIcon(SmallCards.minimaneaterbug);
			BoardControl.opponentMonster3Occupied = false;
		}
		return true;
	}

}
