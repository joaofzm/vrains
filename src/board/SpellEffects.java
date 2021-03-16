package board;

import javax.swing.Icon;

import cards.SmallCards;
import effects.DarkHole;
import effects.MonsterReborn;
import effects.PotOfGreed;
import effects.Raigeki;
import effects.SwordsOfRevealingLight;

public class SpellEffects {

	public static void spellEffects(Icon icon) {
		if (icon == SmallCards.minidarkhole) {
			DarkHole.darkHole();
		}

		if (icon == SmallCards.miniraigeki) {
			Raigeki.raigeki();
		}

		if (icon == SmallCards.minipotofgreed) {
			PotOfGreed.potOfGreed();
		}

		if (icon == SmallCards.miniswordsofrevealinglight) {
			SwordsOfRevealingLight.swordsOfRevealingLight();
		}

		if (icon == SmallCards.minimonsterreborn) {
			MonsterReborn.monsterReborn();
		}
	}

}
