/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
  Jordan Vendrame
 Fadil Nizar
 Aromal Suresh Kumar
 12/04/2023
 */

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.Scanner;

public class BlackjackGame 
{
 
 private Scanner input = new Scanner(System.in);
 private int users; 
 private Player[] players;
 private Deck deck;
 private Dealer dealer = new Dealer();

 public void gameStart(){
  String names;
  System.out.println("Welcome to the Blackjack game!");
  System.out.println();
  System.out.println("  Here are the rules of BlackJack: ");
  System.out.println(" Each player is dealt 2 cards. The dealer is also dealt 2 cards.");
  System.out.println(" Cards are equal to the value written on them. Except the face cards, they are worth 10. The Ace is extra special and is worth either 1 or 11, depending on your your choice.");
  System.out.println(" The players cards are then added up to find their score.");
  System.out.println(" Players can choose to Hit, and gain another card from the deck. Players can also choose to Stay, and keep their current cards.");
  System.out.println(" The Dealer chooses hit until their score is equal to or greater than 17.");
  System.out.println(" The goal of the game is to have a higher score than the dealer without going over 21.");
  System.out.println(" If the players and dealers score is the same, it is a Tie and the hand ends."); 
  System.out.println();
  
  // Was hoping to implement multiple players, ran out of time, fragments of that code are still here due to the amount of time it would take to remove.
  do {
   users = 1;
   
  } while (users > 6 || users < 0);

  players = new Player[users];
  deck = new Deck();

  for (int k = 0; k < users; k++) {
   System.out.print("What is the players name? ");
   names = input.next();
   players[k] = new Player();
   players[k].setName(names);
  }
 }
 
 public void shuffle()
 {
  deck.shuffle(); 
 }
 public void dealCards(){
  for (int i = 0; i < 2; i++)
  {
   for (int k =0; k < users; k++) 
   {
    players[k].addCard(deck.nextCard());
       dealer.addCard(deck.nextCard());
    }
   }
  }
 
 public void checkBlackjack()
 {
  if (dealer.isBlackjack() ) 
  {
   System.out.println("The dealer has BlackJack!");
   for (int k =0; k < users; k++)
   {
    if (players[k].getTotal() == 21 )
    {
     System.out.println(players[k].getName() + " ties with the dealer");
    } 
    else 
     System.out.println(players[k].getName() + " loses");
   }
  } 
  else 
  {

   for (int k =0; k < users; k++) 
   {
    if (players[k].getTotal() == 21 ) 
    {
     System.out.println(players[k].getName() + " has blackjack!");
    }
   }
  }  
 }
 
 public void hitStand() 
 {
  String cont;
  char choice;
  for (int k = 0; k < users; k++)
  {
    System.out.println();
    System.out.println(players[k].getName() + " has " + players[k].getHandString());

    do {
     do {
      System.out.print(players[k].getName() + " Hit or Stand? (H / S)");
      cont = input.next();
      choice = cont.toUpperCase().charAt(0); //simpler than ignoring case imo
     } while ( ! ( choice == 'H' || choice == 'S' ) );
     if ( choice == 'H' )
     {
      players[k].addCard(deck.nextCard());
      System.out.println(players[k].getName() + " has " + players[k].getHandString());
     }
    } while (choice != 'S' && players[k].getTotal() <= 21 );
   }
  }
 
 public void dealersTurn()
 {
  boolean checkActivePlayer = false;
  for (int k =0; k < users && checkActivePlayer == false; k++)
  {
   if ( players[k].getTotal() <= 21 ) 
   {
    checkActivePlayer = true;
   }
  }
  if (checkActivePlayer)
  {
   dealer.dealerPlay(deck);
  }
 }
 
 public void checkOutcome() 
 {
  System.out.println();
  for (int k = 0; k < users; k++) {
    if( players[k].getTotal() > 21 ) {
     System.out.println(players[k].getName() + " has busted");
    } 
    else if ( players[k].getTotal() < dealer.calcTotal() && dealer.calcTotal() <= 21 ) 
    {
     System.out.println(players[k].getName() + " has lost");
     
    } 
    else if ( players[k].getTotal() == dealer.calcTotal() )
    {
     System.out.println(players[k].getName() + " has tied the dealer");
     
    }
    else if (players[k].getTotal() == 21)
    {
     System.out.println(players[k].getName() + " has won with blackjack!");
     
    } 
    else 
    {
     System.out.println(players[k].getName() + " has won");
    }
   }
  }

 public void printStatus() 
 {
  for (int k = 0; k < users; k++) 
  {
   System.out.println(players[k].getName() + " has " + players[k].getHandString());
   
  }
  System.out.println("The dealer has " + dealer.getHandString(true, false));
 }
 

 public void removeHands() 
 {
  for (int k = 0; k < users; k++) 
  {
   players[k].removeHand();
  }
  dealer.removeHand();
 }
 
 public boolean playAgain() 
 {
  String cont;
  char choice;
  Boolean gameActive = true;
   do {
   System.out.println();
   System.out.println("The game is over.");
    System.out.println();
    System.out.print("Would you like to play again? Yes or No? (Y/N) ");
    cont = input.next();
    choice = cont.toUpperCase().charAt(0);
   } while ( ! ( choice == 'Y' || choice == 'N' ) );
   if(choice == 'N')
   {
    gameActive = false;
    gameEnd();
   }
   return gameActive;
  }
 
  public void gameEnd()
  {
   System.out.println();
   System.out.println("Thanks for playing!");
  }
}