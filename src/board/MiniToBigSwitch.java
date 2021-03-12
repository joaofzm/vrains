package board;

import javax.swing.Icon;
import javax.swing.JButton;

public class MiniToBigSwitch {
	
	public static void miniToBigSwitch(JButton x) {
		Icon card = x.getIcon();
		System.out.println(x);
		DuelFrame.cardInfo.setIcon(card);
	}

}
