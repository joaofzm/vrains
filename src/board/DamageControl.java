package board;

import javax.swing.JOptionPane;

public class DamageControl {

	static String[] Options = { "OK" };

	public static int damage;
	public static int playerLifePoints = 8000;
	public static int opponentLifePoints = 8000;

	public static int currentPlayerMonster1Attack;
	public static int currentPlayerMonster2Attack;
	public static int currentPlayerMonster3Attack;
	public static int currentPlayerMonster4Attack;
	public static int currentPlayerMonster5Attack;

	public static int currentPlayerMonster1Defense;
	public static int currentPlayerMonster2Defense;
	public static int currentPlayerMonster3Defense;
	public static int currentPlayerMonster4Defense;
	public static int currentPlayerMonster5Defense;

	public static int currentOpponentMonster1Attack;
	public static int currentOpponentMonster2Attack;
	public static int currentOpponentMonster3Attack;
	public static int currentOpponentMonster4Attack;
	public static int currentOpponentMonster5Attack;

	public static int currentOpponentMonster1Defense;
	public static int currentOpponentMonster2Defense;
	public static int currentOpponentMonster3Defense;
	public static int currentOpponentMonster4Defense;
	public static int currentOpponentMonster5Defense;

	public static boolean playerMonster1Attacked = false;
	public static boolean playerMonster2Attacked = false;
	public static boolean playerMonster3Attacked = false;
	public static boolean playerMonster4Attacked = false;
	public static boolean playerMonster5Attacked = false;

	public static boolean opponentMonster1Attacked = false;
	public static boolean opponentMonster2Attacked = false;
	public static boolean opponentMonster3Attacked = false;
	public static boolean opponentMonster4Attacked = false;
	public static boolean opponentMonster5Attacked = false;

	public static void damagePlayer(int damage) {
		playerLifePoints -= damage;
		DuelFrame.playerLP.setText("             " + playerLifePoints);
	}

	public static void damageOpponent(int damage) {
		opponentLifePoints -= damage;
		DuelFrame.opponentLP.setText("             " + opponentLifePoints);
		if (opponentLifePoints <= 0) {
			DuelFrame.playerHand1.setEnabled(false);
			DuelFrame.playerHand2.setEnabled(false);
			DuelFrame.playerHand3.setEnabled(false);
			DuelFrame.playerHand4.setEnabled(false);
			DuelFrame.playerHand5.setEnabled(false);
			DuelFrame.playerHand6.setEnabled(false);
			DuelFrame.playerHand7.setEnabled(false);
			DuelFrame.playerHand8.setEnabled(false);
			DuelFrame.playerHand9.setEnabled(false);
			DuelFrame.playerHand10.setEnabled(false);
			DuelFrame.playerHand11.setEnabled(false);
			DuelFrame.playerHand12.setEnabled(false);
			DuelFrame.playerMonsterZone1.setEnabled(false);
			DuelFrame.playerMonsterZone2.setEnabled(false);
			DuelFrame.playerMonsterZone3.setEnabled(false);
			DuelFrame.playerMonsterZone4.setEnabled(false);
			DuelFrame.playerMonsterZone5.setEnabled(false);
			DuelFrame.nextPhaseButton.setEnabled(false);
			JOptionPane.showMessageDialog(null, "Your opponent LP reached 0!", "YOU WIN!", 1);

		}
	}

}
