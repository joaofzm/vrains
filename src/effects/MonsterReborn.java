package effects;

import board.BoardControl;
import board.DuelFrame;
import cards.SmallCards;

public class MonsterReborn {

	public static boolean monsterReborn() {

		if (BoardControl.opponentMonster3Occupied == true) {
			DuelFrame.opponentMonsterZone3.setIcon(null);
			DuelFrame.opponentGraveyard.setIcon(SmallCards.miniberfomet);
			BoardControl.opponentMonster3Occupied = false;
		}
		return true;
	}

}
