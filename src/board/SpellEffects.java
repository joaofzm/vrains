package board;

import javax.swing.Icon;

import cards.SmallCards;
import effects.DarkHole;
import effects.MirrorForce;

public class SpellEffects {

	public static void spellEffects(Icon icon) {
		if (icon == SmallCards.minidarkhole) {
			DarkHole.darkHole();
		}

		if (icon == SmallCards.minimirrorforce) {
			MirrorForce.mirrorForce();
		}
	}

}
