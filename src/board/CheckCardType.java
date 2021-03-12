package board;

import javax.swing.Icon;

import cards.SmallCards;

public class CheckCardType {
	
	public static int checkCardType(Icon icon) {
		if (icon==SmallCards.minidarkelf
			||icon==SmallCards.minigeminielf	
			||icon==SmallCards.minilajinn	
			||icon==SmallCards.minilusterdragon	
			||icon==SmallCards.minimaneaterbug	
			||icon==SmallCards.minisevencoloredfish	
			||icon==SmallCards.minisumonnedskull) {
			return 0;
		} else if (icon==SmallCards.minimirrorforce) {
			return 2;
		} else {
			return 1;
		}
	
	}

}
