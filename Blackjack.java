public class Blackjack 
{
//RUN THIS FILE TO START THE GAME
 public static void main(String[] args) throws Exception
 {

  BlackjackGame currentGame = new BlackjackGame();

  currentGame.gameStart();
  do {
   currentGame.shuffle();
   currentGame.dealCards();
   currentGame.printStatus();
   currentGame.checkBlackjack();
   currentGame.hitStand();
   currentGame.dealersTurn();
   currentGame.checkOutcome();
   currentGame.removeHands();
  } while (currentGame.playAgain());
 }
}