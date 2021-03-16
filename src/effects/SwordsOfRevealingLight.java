package effects;

import board.DamageControl;
import cards.DrawCardPlayer;

public class SwordsOfRevealingLight {

	public static boolean swordsOfRevealingLight() {
		DrawCardPlayer.drawCardPlayer();
		DamageControl.damageOpponent(-1000);
		return true;
	}

}
