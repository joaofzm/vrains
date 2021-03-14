package effects;

import board.CheckZoneToSummon;
import board.DuelFrame;

public class DarkHole {

	public static boolean darkHole() {
		DuelFrame.playerMonsterZone1.setIcon(null);
		DuelFrame.playerMonsterZone2.setIcon(null);
		DuelFrame.playerMonsterZone3.setIcon(null);
		DuelFrame.playerMonsterZone4.setIcon(null);
		DuelFrame.playerMonsterZone5.setIcon(null);
		CheckZoneToSummon.currentPlayerMonster1Attack = 0;
		CheckZoneToSummon.currentPlayerMonster2Attack = 0;
		CheckZoneToSummon.currentPlayerMonster3Attack = 0;
		CheckZoneToSummon.currentPlayerMonster4Attack = 0;
		CheckZoneToSummon.currentPlayerMonster5Attack = 0;
		CheckZoneToSummon.currentPlayerMonster1Defense = 0;
		CheckZoneToSummon.currentPlayerMonster2Defense = 0;
		CheckZoneToSummon.currentPlayerMonster3Defense = 0;
		CheckZoneToSummon.currentPlayerMonster4Defense = 0;
		CheckZoneToSummon.currentPlayerMonster5Defense = 0;

		DuelFrame.opponentMonsterZone1.setIcon(null);
		DuelFrame.opponentMonsterZone2.setIcon(null);
		DuelFrame.opponentMonsterZone3.setIcon(null);
		DuelFrame.opponentMonsterZone4.setIcon(null);
		DuelFrame.opponentMonsterZone5.setIcon(null);
		CheckZoneToSummon.currentPlayerMonster1Attack = 0;
		CheckZoneToSummon.currentPlayerMonster2Attack = 0;
		CheckZoneToSummon.currentPlayerMonster3Attack = 0;
		CheckZoneToSummon.currentPlayerMonster4Attack = 0;
		CheckZoneToSummon.currentPlayerMonster5Attack = 0;
		CheckZoneToSummon.currentPlayerMonster1Defense = 0;
		CheckZoneToSummon.currentPlayerMonster2Defense = 0;
		CheckZoneToSummon.currentPlayerMonster3Defense = 0;
		CheckZoneToSummon.currentPlayerMonster4Defense = 0;
		CheckZoneToSummon.currentPlayerMonster5Defense = 0;

		return true;

	}

}
