package board;

public class RoundControl {

	public static int round = 0;

	public static void passRound() {
		DamageControl.playerMonster1Attacked = false;
		DamageControl.playerMonster2Attacked = false;
		DamageControl.playerMonster3Attacked = false;
		DamageControl.playerMonster4Attacked = false;
		DamageControl.playerMonster5Attacked = false;
		PlayCard.normalSummoned = false;
		round++;
		DuelFrame.round.setText("     " + round);
	}

}
