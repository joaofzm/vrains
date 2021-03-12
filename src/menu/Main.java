package menu;

import java.util.ArrayList;
import java.util.Collections;
import board.DuelFrame;
import cards.CardList;
import board.BoardControl;
import board.HandControl;
import cards.SmallCards;

public class Main  {

	public static int damage;
	
	public static int playerLifePoints = 8000;
	public static int opponentLifePoints = 8000;
	public static int round = 1;
	
	
	public static void main(String[] args) {		
		
		CardList.cardList();
		
		new SelectYourOpponentFrame();
		//new StartFrame();
		
	}


	public static void damagePlayer(int damage) {
		playerLifePoints -= damage;		
		DuelFrame.playerLP.setText("             "+Main.playerLifePoints);
		}
	
	public static void damageOpponent(int damage) {
		opponentLifePoints -= damage;		
		DuelFrame.opponentLP.setText("             "+Main.opponentLifePoints);
		}
	
	public static void passRound() {
		round++;		
		DuelFrame.round.setText("     "+Main.round);
		}
	
	
	
	
}
