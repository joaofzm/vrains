package board;

import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.JButton;

import cards.BigCards;
import cards.DrawCardPlayer;
import cards.SmallCards;
import menu.Main;

public class CheckCardInHandForBigCardInfo {

	public static void checkCardInHandForBigCardInfo(JButton x) {
		Icon card = x.getIcon();
		if (card==SmallCards.minidarkelf) {
			card = BigCards.darkelf;			
		} else if(card==SmallCards.minidarkhole){
			card = BigCards.darkhole;	
		} else if(card==SmallCards.minigeminielf){
			card = BigCards.geminielf;	
		} else if(card==SmallCards.minilajinn){
			card = BigCards.lajinn;	
		} else if(card==SmallCards.minilusterdragon){
			card = BigCards.lusterdragon;	
		} else if(card==SmallCards.minimaneaterbug){
			card = BigCards.maneaterbug;	
		} else if(card==SmallCards.minimirrorforce){
			card = BigCards.mirrorforce;	
		} else if(card==SmallCards.minimonsterreborn){
			card = BigCards.monsterreborn;	
		} else if(card==SmallCards.minipotofgreed){
			card = BigCards.potofgreed;	
		} else if(card==SmallCards.miniraigeki){
			card = BigCards.raigeki;	
		} else if(card==SmallCards.minisevencoloredfish){
			card = BigCards.sevencoloredfish;	
		} else if(card==SmallCards.minisumonnedskull){
			card = BigCards.sumonnedskull;	
		} else if(card==SmallCards.miniswordsofrevealinglight){
			card = BigCards.swordsofrevealinglight;	
		}																																									

		DuelFrame.cardInfo.setIcon(card);
	}
}
