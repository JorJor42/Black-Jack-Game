/*
 @author Jordan Vendrame
 @author Fadil Nizar
 @author Aromal Suresh Kumar
 12/04/2023
 */

public class Dealer 
{

 private Hand hand = new Hand();

 public boolean isBlackjack(){
  if (hand.calcTotal() == 21){
   return true;
  } else {
   return false;
  }
 }
 
 public void dealerPlay(Deck deck){
  System.out.println();
  while (hand.calcTotal() <= 16) {
   System.out.println("The dealer has " + hand.calcTotal()+ " and hits");
   hand.addCard(deck.nextCard());
   System.out.println("The dealer " + this.getHandString(true, false));
  } 
  if ( hand.calcTotal() > 21) {
   System.out.println("The dealer busts. " + this.getHandString(true, false));
  }
  else {
   System.out.println("the dealer stands. " + this.getHandString(true, false));
  }
 }
 
 public void addCard(Card card) {
  hand.addCard(card);

 }
 
 public String getHandString(boolean isDealer, boolean holeCard ) {
  String strCard= "Cards:" + hand.getInfo(isDealer, holeCard);

  return strCard;
 }
 
 public int calcTotal() {
  return hand.calcTotal();
 }
 
 public void removeHand() {
  hand.removeHand();
 }
 
}