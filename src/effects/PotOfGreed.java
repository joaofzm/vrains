package effects;

import cards.DrawCardPlayer;

public class PotOfGreed {

	public static boolean potOfGreed() {
		DrawCardPlayer.drawCardPlayer();
		DrawCardPlayer.drawCardPlayer();
		return true;
	}

}
