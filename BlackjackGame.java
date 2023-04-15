/*
 @author Jordan Vendrame
 @author Fadil Nizar
 @author Aromal Suresh Kumar
 12/04/2023
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
  System.out.println("  How to play BlackJack: ");
  System.out.println(" At the start of the game, the dealer and all players are dealt 2 cards");
  System.out.println(" The value of a card is equal to its pip (number written on it). Except the face cards, they are worth 10. The Ace is extra special and is worth either 1 or 11, depending on your choice.");
  System.out.println(" Players could choose to Hit, drawing a card from the deck and adding it into their hand. Players can also choose to Stay, and keep their current cards.");
  System.out.println(" The Dealer MUST hit and draw cards until their score is 17 or higher, at which point they MUST stand.");
  System.out.println(" The players and dealer's score is calculated by adding up the values of all the cards in their hand ");
  System.out.println(" Each player attempts to beat the dealer by getting a score as close to 21 as possible, without going over 21; Going over 21 is a bust and causes you to lose.");
  System.out.println(" If any player has the same score as the dealer, they tie and their hand ends."); //technically its a push, but no time to implement betting
  System.out.println();
  
  // Was hoping to implement multiple players, ran out of time, fragments of that code are still here due to the amount of time it would take to remove.
   users = 1;

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
