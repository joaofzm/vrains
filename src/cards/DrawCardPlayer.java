package cards;

import board.DuelFrame;
import board.HandControl;

public class DrawCardPlayer {
	
	public static void drawCardPlayer() {
	    String nextCard = CardList.playerDeck.get(0); 
	    switch (nextCard) {
	    case "darkelf":
	          if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	  CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minidarkelf);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minidarkelf);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
	          }
				break;
			case "darkhole":
				if (HandControl.playerHand1Occupied == false) {
					HandControl.playerHand1Occupied = true;
					DuelFrame.playerHand1.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand1.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand2Occupied == false) {
					HandControl.playerHand2Occupied = true;
					DuelFrame.playerHand2.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand2.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand3Occupied == false) {
					HandControl.playerHand3Occupied = true;
					DuelFrame.playerHand3.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand3.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand4Occupied == false) {
					HandControl.playerHand4Occupied = true;
					DuelFrame.playerHand4.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand4.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand5Occupied == false) {
					HandControl.playerHand5Occupied = true;
					DuelFrame.playerHand5.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand5.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand6Occupied == false) {
					HandControl.playerHand6Occupied = true;
					DuelFrame.playerHand6.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand6.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand7Occupied == false) {
					HandControl.playerHand7Occupied = true;
					DuelFrame.playerHand7.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand7.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand8Occupied == false) {
					HandControl.playerHand8Occupied = true;
					DuelFrame.playerHand8.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand8.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand9Occupied == false) {
					HandControl.playerHand9Occupied = true;
					DuelFrame.playerHand9.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand9.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand10Occupied == false) {
					HandControl.playerHand10Occupied = true;
					DuelFrame.playerHand10.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand10.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand11Occupied == false) {
					HandControl.playerHand11Occupied = true;
					DuelFrame.playerHand11.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand11.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand12Occupied == false) {
					HandControl.playerHand12Occupied = true;
					DuelFrame.playerHand12.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand12.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minidarkhole);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
				}
	          break;
			case "geminielf":
				if (HandControl.playerHand1Occupied == false) {
					HandControl.playerHand1Occupied = true;
					DuelFrame.playerHand1.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand1.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand2Occupied == false) {
					HandControl.playerHand2Occupied = true;
					DuelFrame.playerHand2.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand2.setVisible(true);
					CardList.playerDeck.remove(0);

				} else if (HandControl.playerHand3Occupied == false) {
					HandControl.playerHand3Occupied = true;
					DuelFrame.playerHand3.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand3.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand4Occupied == false) {
					HandControl.playerHand4Occupied = true;
					DuelFrame.playerHand4.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand4.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand5Occupied == false) {
					HandControl.playerHand5Occupied = true;
					DuelFrame.playerHand5.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand5.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand6Occupied == false) {
					HandControl.playerHand6Occupied = true;
					DuelFrame.playerHand6.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand6.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand7Occupied == false) {
					HandControl.playerHand7Occupied = true;
					DuelFrame.playerHand7.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand7.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand8Occupied == false) {
					HandControl.playerHand8Occupied = true;
					DuelFrame.playerHand8.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand8.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand9Occupied == false) {
					HandControl.playerHand9Occupied = true;
					DuelFrame.playerHand9.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand9.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand10Occupied == false) {
					HandControl.playerHand10Occupied = true;
					DuelFrame.playerHand10.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand10.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand11Occupied == false) {
					HandControl.playerHand11Occupied = true;
					DuelFrame.playerHand11.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand11.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand12Occupied == false) {
					HandControl.playerHand12Occupied = true;
					DuelFrame.playerHand12.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand12.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minigeminielf);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
				}
				break;
	    case "lajinn":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand13Occupied==false) {
	        	  HandControl.playerHand13Occupied=true;
	        	  DuelFrame.playerHand13.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand13.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand14Occupied==false) {
	        	  HandControl.playerHand14Occupied=true;
	        	  DuelFrame.playerHand14.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand14.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand15Occupied==false) {
	        	  HandControl.playerHand15Occupied=true;
	        	  DuelFrame.playerHand15.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand15.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand16Occupied==false) {
	        	  HandControl.playerHand16Occupied=true;
	        	  DuelFrame.playerHand16.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand16.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand17Occupied==false) {
	        	  HandControl.playerHand17Occupied=true;
	        	  DuelFrame.playerHand17.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand17.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand18Occupied==false) {
	        	  HandControl.playerHand18Occupied=true;
	        	  DuelFrame.playerHand18.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand18.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand19Occupied==false) {
	        	  HandControl.playerHand19Occupied=true;
	        	  DuelFrame.playerHand19.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand19.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand20Occupied==false) {
	        	  HandControl.playerHand20Occupied=true;
	        	  DuelFrame.playerHand20.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand20.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand21Occupied==false) {
	        	  HandControl.playerHand21Occupied=true;
	        	  DuelFrame.playerHand21.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand21.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand22Occupied==false) {
	        	  HandControl.playerHand22Occupied=true;
	        	  DuelFrame.playerHand22.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand22.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand23Occupied==false) {
	        	  HandControl.playerHand23Occupied=true;
	        	  DuelFrame.playerHand23.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand23.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand24Occupied==false) {
	        	  HandControl.playerHand24Occupied=true;
	        	  DuelFrame.playerHand24.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand24.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand25Occupied==false) {
	        	  HandControl.playerHand25Occupied=true;
	        	  DuelFrame.playerHand25.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand25.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand26Occupied==false) {
	        	  HandControl.playerHand26Occupied=true;
	        	  DuelFrame.playerHand26.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand26.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand27Occupied==false) {
	        	  HandControl.playerHand27Occupied=true;
	        	  DuelFrame.playerHand27.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand27.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand28Occupied==false) {
	        	  HandControl.playerHand28Occupied=true;
	        	  DuelFrame.playerHand28.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand28.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand29Occupied==false) {
	        	  HandControl.playerHand29Occupied=true;
	        	  DuelFrame.playerHand29.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand29.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand30Occupied==false) {
	        	  HandControl.playerHand30Occupied=true;
	        	  DuelFrame.playerHand30.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand30.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand31Occupied==false) {
	        	  HandControl.playerHand31Occupied=true;
	        	  DuelFrame.playerHand31.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand31.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand32Occupied==false) {
	        	  HandControl.playerHand32Occupied=true;
	        	  DuelFrame.playerHand32.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand32.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand33Occupied==false) {
	        	  HandControl.playerHand33Occupied=true;
	        	  DuelFrame.playerHand33.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand33.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand34Occupied==false) {
	        	  HandControl.playerHand34Occupied=true;
	        	  DuelFrame.playerHand34.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand34.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand35Occupied==false) {
	        	  HandControl.playerHand35Occupied=true;
	        	  DuelFrame.playerHand35.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand35.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand36Occupied==false) {
	        	  HandControl.playerHand36Occupied=true;
	        	  DuelFrame.playerHand36.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand36.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand37Occupied==false) {
	        	  HandControl.playerHand37Occupied=true;
	        	  DuelFrame.playerHand37.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand37.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand38Occupied==false) {
	        	  HandControl.playerHand38Occupied=true;
	        	  DuelFrame.playerHand38.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand38.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand39Occupied==false) {
	        	  HandControl.playerHand39Occupied=true;
	        	  DuelFrame.playerHand39.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand39.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand40Occupied==false) {
	        	  HandControl.playerHand40Occupied=true;
	        	  DuelFrame.playerHand40.setIcon(SmallCards.minilajinn);        	  
	        	  DuelFrame.playerHand40.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          }
	          break;
	    case "lusterdragon":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand13Occupied==false) {
	        	  HandControl.playerHand13Occupied=true;
	        	  DuelFrame.playerHand13.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand13.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand14Occupied==false) {
	        	  HandControl.playerHand14Occupied=true;
	        	  DuelFrame.playerHand14.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand14.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand15Occupied==false) {
	        	  HandControl.playerHand15Occupied=true;
	        	  DuelFrame.playerHand15.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand15.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand16Occupied==false) {
	        	  HandControl.playerHand16Occupied=true;
	        	  DuelFrame.playerHand16.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand16.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand17Occupied==false) {
	        	  HandControl.playerHand17Occupied=true;
	        	  DuelFrame.playerHand17.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand17.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand18Occupied==false) {
	        	  HandControl.playerHand18Occupied=true;
	        	  DuelFrame.playerHand18.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand18.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand19Occupied==false) {
	        	  HandControl.playerHand19Occupied=true;
	        	  DuelFrame.playerHand19.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand19.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand20Occupied==false) {
	        	  HandControl.playerHand20Occupied=true;
	        	  DuelFrame.playerHand20.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand20.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand21Occupied==false) {
	        	  HandControl.playerHand21Occupied=true;
	        	  DuelFrame.playerHand21.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand21.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand22Occupied==false) {
	        	  HandControl.playerHand22Occupied=true;
	        	  DuelFrame.playerHand22.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand22.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand23Occupied==false) {
	        	  HandControl.playerHand23Occupied=true;
	        	  DuelFrame.playerHand23.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand23.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand24Occupied==false) {
	        	  HandControl.playerHand24Occupied=true;
	        	  DuelFrame.playerHand24.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand24.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand25Occupied==false) {
	        	  HandControl.playerHand25Occupied=true;
	        	  DuelFrame.playerHand25.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand25.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand26Occupied==false) {
	        	  HandControl.playerHand26Occupied=true;
	        	  DuelFrame.playerHand26.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand26.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand27Occupied==false) {
	        	  HandControl.playerHand27Occupied=true;
	        	  DuelFrame.playerHand27.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand27.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand28Occupied==false) {
	        	  HandControl.playerHand28Occupied=true;
	        	  DuelFrame.playerHand28.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand28.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand29Occupied==false) {
	        	  HandControl.playerHand29Occupied=true;
	        	  DuelFrame.playerHand29.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand29.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand30Occupied==false) {
	        	  HandControl.playerHand30Occupied=true;
	        	  DuelFrame.playerHand30.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand30.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand31Occupied==false) {
	        	  HandControl.playerHand31Occupied=true;
	        	  DuelFrame.playerHand31.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand31.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand32Occupied==false) {
	        	  HandControl.playerHand32Occupied=true;
	        	  DuelFrame.playerHand32.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand32.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand33Occupied==false) {
	        	  HandControl.playerHand33Occupied=true;
	        	  DuelFrame.playerHand33.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand33.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand34Occupied==false) {
	        	  HandControl.playerHand34Occupied=true;
	        	  DuelFrame.playerHand34.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand34.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand35Occupied==false) {
	        	  HandControl.playerHand35Occupied=true;
	        	  DuelFrame.playerHand35.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand35.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand36Occupied==false) {
	        	  HandControl.playerHand36Occupied=true;
	        	  DuelFrame.playerHand36.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand36.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand37Occupied==false) {
	        	  HandControl.playerHand37Occupied=true;
	        	  DuelFrame.playerHand37.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand37.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand38Occupied==false) {
	        	  HandControl.playerHand38Occupied=true;
	        	  DuelFrame.playerHand38.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand38.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand39Occupied==false) {
	        	  HandControl.playerHand39Occupied=true;
	        	  DuelFrame.playerHand39.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand39.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand40Occupied==false) {
	        	  HandControl.playerHand40Occupied=true;
	        	  DuelFrame.playerHand40.setIcon(SmallCards.minilusterdragon);        	  
	        	  DuelFrame.playerHand40.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          }
	          break;
	    case "maneaterbug":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand13Occupied==false) {
	        	  HandControl.playerHand13Occupied=true;
	        	  DuelFrame.playerHand13.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand13.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand14Occupied==false) {
	        	  HandControl.playerHand14Occupied=true;
	        	  DuelFrame.playerHand14.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand14.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand15Occupied==false) {
	        	  HandControl.playerHand15Occupied=true;
	        	  DuelFrame.playerHand15.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand15.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand16Occupied==false) {
	        	  HandControl.playerHand16Occupied=true;
	        	  DuelFrame.playerHand16.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand16.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand17Occupied==false) {
	        	  HandControl.playerHand17Occupied=true;
	        	  DuelFrame.playerHand17.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand17.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand18Occupied==false) {
	        	  HandControl.playerHand18Occupied=true;
	        	  DuelFrame.playerHand18.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand18.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand19Occupied==false) {
	        	  HandControl.playerHand19Occupied=true;
	        	  DuelFrame.playerHand19.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand19.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand20Occupied==false) {
	        	  HandControl.playerHand20Occupied=true;
	        	  DuelFrame.playerHand20.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand20.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand21Occupied==false) {
	        	  HandControl.playerHand21Occupied=true;
	        	  DuelFrame.playerHand21.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand21.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand22Occupied==false) {
	        	  HandControl.playerHand22Occupied=true;
	        	  DuelFrame.playerHand22.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand22.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand23Occupied==false) {
	        	  HandControl.playerHand23Occupied=true;
	        	  DuelFrame.playerHand23.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand23.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand24Occupied==false) {
	        	  HandControl.playerHand24Occupied=true;
	        	  DuelFrame.playerHand24.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand24.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand25Occupied==false) {
	        	  HandControl.playerHand25Occupied=true;
	        	  DuelFrame.playerHand25.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand25.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand26Occupied==false) {
	        	  HandControl.playerHand26Occupied=true;
	        	  DuelFrame.playerHand26.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand26.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand27Occupied==false) {
	        	  HandControl.playerHand27Occupied=true;
	        	  DuelFrame.playerHand27.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand27.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand28Occupied==false) {
	        	  HandControl.playerHand28Occupied=true;
	        	  DuelFrame.playerHand28.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand28.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand29Occupied==false) {
	        	  HandControl.playerHand29Occupied=true;
	        	  DuelFrame.playerHand29.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand29.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand30Occupied==false) {
	        	  HandControl.playerHand30Occupied=true;
	        	  DuelFrame.playerHand30.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand30.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand31Occupied==false) {
	        	  HandControl.playerHand31Occupied=true;
	        	  DuelFrame.playerHand31.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand31.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand32Occupied==false) {
	        	  HandControl.playerHand32Occupied=true;
	        	  DuelFrame.playerHand32.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand32.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand33Occupied==false) {
	        	  HandControl.playerHand33Occupied=true;
	        	  DuelFrame.playerHand33.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand33.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand34Occupied==false) {
	        	  HandControl.playerHand34Occupied=true;
	        	  DuelFrame.playerHand34.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand34.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand35Occupied==false) {
	        	  HandControl.playerHand35Occupied=true;
	        	  DuelFrame.playerHand35.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand35.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand36Occupied==false) {
	        	  HandControl.playerHand36Occupied=true;
	        	  DuelFrame.playerHand36.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand36.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand37Occupied==false) {
	        	  HandControl.playerHand37Occupied=true;
	        	  DuelFrame.playerHand37.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand37.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand38Occupied==false) {
	        	  HandControl.playerHand38Occupied=true;
	        	  DuelFrame.playerHand38.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand38.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand39Occupied==false) {
	        	  HandControl.playerHand39Occupied=true;
	        	  DuelFrame.playerHand39.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand39.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand40Occupied==false) {
	        	  HandControl.playerHand40Occupied=true;
	        	  DuelFrame.playerHand40.setIcon(SmallCards.minimaneaterbug);        	  
	        	  DuelFrame.playerHand40.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          }
	          break;
	    case "mirrorforce":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand13Occupied==false) {
	        	  HandControl.playerHand13Occupied=true;
	        	  DuelFrame.playerHand13.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand13.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand14Occupied==false) {
	        	  HandControl.playerHand14Occupied=true;
	        	  DuelFrame.playerHand14.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand14.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand15Occupied==false) {
	        	  HandControl.playerHand15Occupied=true;
	        	  DuelFrame.playerHand15.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand15.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand16Occupied==false) {
	        	  HandControl.playerHand16Occupied=true;
	        	  DuelFrame.playerHand16.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand16.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand17Occupied==false) {
	        	  HandControl.playerHand17Occupied=true;
	        	  DuelFrame.playerHand17.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand17.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand18Occupied==false) {
	        	  HandControl.playerHand18Occupied=true;
	        	  DuelFrame.playerHand18.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand18.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand19Occupied==false) {
	        	  HandControl.playerHand19Occupied=true;
	        	  DuelFrame.playerHand19.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand19.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand20Occupied==false) {
	        	  HandControl.playerHand20Occupied=true;
	        	  DuelFrame.playerHand20.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand20.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand21Occupied==false) {
	        	  HandControl.playerHand21Occupied=true;
	        	  DuelFrame.playerHand21.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand21.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand22Occupied==false) {
	        	  HandControl.playerHand22Occupied=true;
	        	  DuelFrame.playerHand22.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand22.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand23Occupied==false) {
	        	  HandControl.playerHand23Occupied=true;
	        	  DuelFrame.playerHand23.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand23.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand24Occupied==false) {
	        	  HandControl.playerHand24Occupied=true;
	        	  DuelFrame.playerHand24.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand24.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand25Occupied==false) {
	        	  HandControl.playerHand25Occupied=true;
	        	  DuelFrame.playerHand25.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand25.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand26Occupied==false) {
	        	  HandControl.playerHand26Occupied=true;
	        	  DuelFrame.playerHand26.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand26.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand27Occupied==false) {
	        	  HandControl.playerHand27Occupied=true;
	        	  DuelFrame.playerHand27.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand27.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand28Occupied==false) {
	        	  HandControl.playerHand28Occupied=true;
	        	  DuelFrame.playerHand28.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand28.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand29Occupied==false) {
	        	  HandControl.playerHand29Occupied=true;
	        	  DuelFrame.playerHand29.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand29.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand30Occupied==false) {
	        	  HandControl.playerHand30Occupied=true;
	        	  DuelFrame.playerHand30.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand30.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand31Occupied==false) {
	        	  HandControl.playerHand31Occupied=true;
	        	  DuelFrame.playerHand31.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand31.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand32Occupied==false) {
	        	  HandControl.playerHand32Occupied=true;
	        	  DuelFrame.playerHand32.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand32.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand33Occupied==false) {
	        	  HandControl.playerHand33Occupied=true;
	        	  DuelFrame.playerHand33.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand33.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand34Occupied==false) {
	        	  HandControl.playerHand34Occupied=true;
	        	  DuelFrame.playerHand34.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand34.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand35Occupied==false) {
	        	  HandControl.playerHand35Occupied=true;
	        	  DuelFrame.playerHand35.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand35.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand36Occupied==false) {
	        	  HandControl.playerHand36Occupied=true;
	        	  DuelFrame.playerHand36.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand36.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand37Occupied==false) {
	        	  HandControl.playerHand37Occupied=true;
	        	  DuelFrame.playerHand37.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand37.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand38Occupied==false) {
	        	  HandControl.playerHand38Occupied=true;
	        	  DuelFrame.playerHand38.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand38.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand39Occupied==false) {
	        	  HandControl.playerHand39Occupied=true;
	        	  DuelFrame.playerHand39.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand39.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand40Occupied==false) {
	        	  HandControl.playerHand40Occupied=true;
	        	  DuelFrame.playerHand40.setIcon(SmallCards.minimirrorforce);        	  
	        	  DuelFrame.playerHand40.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          }
	      	  break;
	    case "monsterreborn":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minimonsterreborn);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minimonsterreborn);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
	          }
		      break;
	    case "potofgreed":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minipotofgreed);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minipotofgreed);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
				}
		      break;
	    case "raigeki":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.miniraigeki);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.miniraigeki);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
	          }
		      break;
	    case "sevencoloredfish":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minisevencoloredfish);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minisevencoloredfish);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
	          }
		      break;
	    case "sumonnedskull":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.minisumonnedskull);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.minisumonnedskull);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
	          }
		      break;
	    case "swordsofrevealinglight":
	    	if (HandControl.playerHand1Occupied==false) {
	        	  HandControl.playerHand1Occupied=true;
	        	  DuelFrame.playerHand1.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand1.setVisible(true); 
	        	    CardList.playerDeck.remove(0);       	  
	          } else if (HandControl.playerHand2Occupied==false) {
	        	  HandControl.playerHand2Occupied=true;
	        	  DuelFrame.playerHand2.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand2.setVisible(true);  
	        	  CardList.playerDeck.remove(0);       	  

	          } else if (HandControl.playerHand3Occupied==false) {
	        	  HandControl.playerHand3Occupied=true;
	        	  DuelFrame.playerHand3.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand3.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand4Occupied==false) {
	        	  HandControl.playerHand4Occupied=true;
	        	  DuelFrame.playerHand4.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand4.setVisible(true); 
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand5Occupied==false) {
	        	  HandControl.playerHand5Occupied=true;
	        	  DuelFrame.playerHand5.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand5.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand6Occupied==false) {
	        	  HandControl.playerHand6Occupied=true;
	        	  DuelFrame.playerHand6.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand6.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand7Occupied==false) {
	        	  HandControl.playerHand7Occupied=true;
	        	  DuelFrame.playerHand7.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand7.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand8Occupied==false) {
	        	  HandControl.playerHand8Occupied=true;
	        	  DuelFrame.playerHand8.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand8.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand9Occupied==false) {
	        	  HandControl.playerHand9Occupied=true;
	        	  DuelFrame.playerHand9.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand9.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand10Occupied==false) {
	        	  HandControl.playerHand10Occupied=true;
	        	  DuelFrame.playerHand10.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand10.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand11Occupied==false) {
	        	  HandControl.playerHand11Occupied=true;
	        	  DuelFrame.playerHand11.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand11.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
	          } else if (HandControl.playerHand12Occupied==false) {
	        	  HandControl.playerHand12Occupied=true;
	        	  DuelFrame.playerHand12.setIcon(SmallCards.miniswordsofrevealinglight);        	  
	        	  DuelFrame.playerHand12.setVisible(true);  
	        	  CardList.playerDeck.remove(0);      
				} else if (HandControl.playerHand13Occupied == false) {
					HandControl.playerHand13Occupied = true;
					DuelFrame.playerHand13.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand13.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand14Occupied == false) {
					HandControl.playerHand14Occupied = true;
					DuelFrame.playerHand14.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand14.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand15Occupied == false) {
					HandControl.playerHand15Occupied = true;
					DuelFrame.playerHand15.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand15.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand16Occupied == false) {
					HandControl.playerHand16Occupied = true;
					DuelFrame.playerHand16.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand16.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand17Occupied == false) {
					HandControl.playerHand17Occupied = true;
					DuelFrame.playerHand17.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand17.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand18Occupied == false) {
					HandControl.playerHand18Occupied = true;
					DuelFrame.playerHand18.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand18.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand19Occupied == false) {
					HandControl.playerHand19Occupied = true;
					DuelFrame.playerHand19.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand19.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand20Occupied == false) {
					HandControl.playerHand20Occupied = true;
					DuelFrame.playerHand20.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand20.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand21Occupied == false) {
					HandControl.playerHand21Occupied = true;
					DuelFrame.playerHand21.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand21.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand22Occupied == false) {
					HandControl.playerHand22Occupied = true;
					DuelFrame.playerHand22.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand22.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand23Occupied == false) {
					HandControl.playerHand23Occupied = true;
					DuelFrame.playerHand23.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand23.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand24Occupied == false) {
					HandControl.playerHand24Occupied = true;
					DuelFrame.playerHand24.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand24.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand25Occupied == false) {
					HandControl.playerHand25Occupied = true;
					DuelFrame.playerHand25.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand25.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand26Occupied == false) {
					HandControl.playerHand26Occupied = true;
					DuelFrame.playerHand26.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand26.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand27Occupied == false) {
					HandControl.playerHand27Occupied = true;
					DuelFrame.playerHand27.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand27.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand28Occupied == false) {
					HandControl.playerHand28Occupied = true;
					DuelFrame.playerHand28.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand28.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand29Occupied == false) {
					HandControl.playerHand29Occupied = true;
					DuelFrame.playerHand29.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand29.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand30Occupied == false) {
					HandControl.playerHand30Occupied = true;
					DuelFrame.playerHand30.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand30.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand31Occupied == false) {
					HandControl.playerHand31Occupied = true;
					DuelFrame.playerHand31.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand31.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand32Occupied == false) {
					HandControl.playerHand32Occupied = true;
					DuelFrame.playerHand32.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand32.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand33Occupied == false) {
					HandControl.playerHand33Occupied = true;
					DuelFrame.playerHand33.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand33.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand34Occupied == false) {
					HandControl.playerHand34Occupied = true;
					DuelFrame.playerHand34.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand34.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand35Occupied == false) {
					HandControl.playerHand35Occupied = true;
					DuelFrame.playerHand35.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand35.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand36Occupied == false) {
					HandControl.playerHand36Occupied = true;
					DuelFrame.playerHand36.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand36.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand37Occupied == false) {
					HandControl.playerHand37Occupied = true;
					DuelFrame.playerHand37.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand37.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand38Occupied == false) {
					HandControl.playerHand38Occupied = true;
					DuelFrame.playerHand38.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand38.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand39Occupied == false) {
					HandControl.playerHand39Occupied = true;
					DuelFrame.playerHand39.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand39.setVisible(true);
					CardList.playerDeck.remove(0);
				} else if (HandControl.playerHand40Occupied == false) {
					HandControl.playerHand40Occupied = true;
					DuelFrame.playerHand40.setIcon(SmallCards.miniswordsofrevealinglight);
					DuelFrame.playerHand40.setVisible(true);
					CardList.playerDeck.remove(0);
	          }
		      break;
		}
	    
	    
	
	}

}
