package menu;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import ai.CpuTurns;
import board.BoardControl;
import board.DamageControl;
import board.DuelFrame;
import board.HandControl;
import board.PlayCard;
import board.RoundControl;
import cards.BigCards;
import cards.CardList;
import cards.DrawCardPlayer;
import cards.SmallCards;

public class Main {

	static String[] Options = { "OK" };

	public static void cpuTurn1() {
		DuelFrame.nextPhaseButton.setEnabled(false);
		RoundControl.passRound();
		CpuTurns.disablePlayer();
		Timer timer = new Timer();
		TimerTask task1 = new TimerTask() {
			public void run() {
				HandControl.opponentHand5Occupied = false;
				DuelFrame.opponentHand5.setVisible(false);
				HandControl.opponentHand4Occupied = false;
				DuelFrame.opponentHand4.setVisible(false);
				DuelFrame.opponentMonsterZone3.setIcon(SmallCards.minidefensecover);
				BoardControl.opponentMonster3Occupied = true;
				DamageControl.currentOpponentMonster3Attack = 1800;
				DamageControl.currentOpponentMonster3Defense = 800;
				DuelFrame.opponentSpellZone1.setIcon(SmallCards.minicover);
				BoardControl.opponentSpell1Occupied = true;
			}
		};
		timer.schedule(task1, 1500);

		TimerTask task2 = new TimerTask() {
			public void run() {
				CpuTurns.enablePlayer();
				RoundControl.passRound();
				DrawCardPlayer.drawCardPlayer();
				PlayCard.normalSummoned = false;
				DuelFrame.nextPhaseButton.setEnabled(true);
			}
		};
		timer.schedule(task2, 3000);
	}

	public static void cpuTurn2() {
		RoundControl.passRound();
		DuelFrame.nextPhaseButton.setEnabled(false);
		CpuTurns.disablePlayer();
		DuelFrame.opponentSpellZone1.setIcon(SmallCards.minid);
		DuelFrame.opponentSpellZone2.setIcon(SmallCards.minie);
		BoardControl.opponentSpell2Occupied = true;
		HandControl.opponentHand4Occupied = true;
		DuelFrame.opponentHand4.setVisible(true);
		Timer timer = new Timer();
		TimerTask task1 = new TimerTask() {
			public void run() {
				if (BoardControl.opponentMonster3Occupied == false) {
				HandControl.opponentHand4Occupied = false;
				DuelFrame.opponentHand4.setVisible(false);
					DuelFrame.opponentMonsterZone3.setIcon(SmallCards.minidefensecover);
				BoardControl.opponentMonster3Occupied = true;
				DamageControl.currentOpponentMonster3Attack = 1800;
				DamageControl.currentOpponentMonster3Defense = 800;
				}
			}
		};
		timer.schedule(task1, 1500);

		TimerTask task2 = new TimerTask() {
			public void run() {
				CpuTurns.enablePlayer();
				RoundControl.passRound();
				DrawCardPlayer.drawCardPlayer();
				DuelFrame.nextPhaseButton.setEnabled(true);
			}
		};
		timer.schedule(task2, 3000);
	}

	public static void cpuTurn3() {
		DuelFrame.nextPhaseButton.setEnabled(false);
		RoundControl.passRound();
		CpuTurns.disablePlayer();
		DuelFrame.opponentSpellZone3.setIcon(SmallCards.minia);
		BoardControl.opponentSpell3Occupied = true;
		if (HandControl.opponentHand4Occupied == true) {
			HandControl.opponentHand5Occupied = true;
			DuelFrame.opponentHand5.setVisible(true);
		} else {
			HandControl.opponentHand4Occupied = true;
			DuelFrame.opponentHand4.setVisible(true);
		}

		Timer timer = new Timer();
		TimerTask task1 = new TimerTask() {
			public void run() {
				if (BoardControl.opponentMonster3Occupied == false) {
					HandControl.opponentHand4Occupied = false;
					DuelFrame.opponentHand4.setVisible(false);
					DuelFrame.opponentMonsterZone3.setIcon(SmallCards.minidefensecover);
					BoardControl.opponentMonster3Occupied = true;
					DamageControl.currentOpponentMonster3Attack = 1800;
					DamageControl.currentOpponentMonster3Defense = 800;
				}
			}
		};
		timer.schedule(task1, 1500);

		TimerTask task2 = new TimerTask() {
			public void run() {
				CpuTurns.enablePlayer();
				RoundControl.passRound();
				DrawCardPlayer.drawCardPlayer();
				DuelFrame.nextPhaseButton.setEnabled(true);
			}
		};
		timer.schedule(task2, 3000);
	}

	public static void cpuTurn4() {
		DuelFrame.nextPhaseButton.setEnabled(false);
		RoundControl.passRound();
		CpuTurns.disablePlayer();
		BoardControl.opponentSpell4Occupied = true;
		DuelFrame.opponentSpellZone4.setIcon(SmallCards.minit);
		HandControl.opponentHand4Occupied = true;
		DuelFrame.opponentHand4.setVisible(true);
		Timer timer = new Timer();
		TimerTask task1 = new TimerTask() {
			public void run() {
				if (BoardControl.opponentMonster3Occupied == false) {
					HandControl.opponentHand4Occupied = false;
					DuelFrame.opponentHand4.setVisible(false);
					DuelFrame.opponentMonsterZone3.setIcon(SmallCards.minidefensecover);
					BoardControl.opponentMonster3Occupied = true;
					DamageControl.currentOpponentMonster3Attack = 1800;
					DamageControl.currentOpponentMonster3Defense = 800;
				}
			}
		};
		timer.schedule(task1, 1500);

		TimerTask task2 = new TimerTask() {
			public void run() {
				CpuTurns.enablePlayer();
				RoundControl.passRound();
				DrawCardPlayer.drawCardPlayer();
				DuelFrame.nextPhaseButton.setEnabled(true);
			}
		};
		timer.schedule(task2, 3000);
	}

	public static void cpuTurn5() {
		DuelFrame.nextPhaseButton.setEnabled(false);
		CpuTurns.disablePlayer();
		BoardControl.opponentSpell5Occupied = true;
		DuelFrame.opponentSpellZone5.setIcon(SmallCards.minih);
		HandControl.opponentHand4Occupied = true;
		DuelFrame.opponentHand4.setVisible(true);
		DuelFrame.cardInfo.setIcon(BigCards.d);
		JOptionPane.showOptionDialog(null, "Your opponent assembled all 5 pieces of Destiny Board!", "YOU LOST!",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Options, 0);
	}

	public static void main(String[] args) {

		CardList.cardList();

		new StartFrame();

	}




}
