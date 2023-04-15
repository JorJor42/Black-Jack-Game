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
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.Random;

public class Deck
{

 private int nextCardIndex;
 

 Card[] deck = new Card[52];

 public Deck(){

  int count = 0;
  try{
  for (int k = 1; k <= 13; k++) {
   deck[count++] = new Card('H', k);
  }
  for (int k = 1; k <= 13; k++) {
   deck[count++] = new Card('S', k);
  }
  for (int k = 1; k <= 13; k++) {
   deck[count++] = new Card('C', k);
  }
  for (int k = 1; k <= 13; k++) {
   deck[count++] = new Card('D', k);
  } 
  }
  finally
  {
  nextCardIndex = 0;
  }
 }
 
 public String getInfo(){

  String strCard= "";

  for (int k = 0; k < deck.length; k++) {
   strCard+= deck[k].getInfo() + " ";
  }
  return strCard;
 }


 private void cardSwap(int index1, int index2){ 
  Card hold;
  hold = deck[index1];
  deck[index1] = deck[index2];
  deck[index2] = hold;
 }

 public void shuffle() {
  Random rn = new Random();
  for (int k = 0; k < 4; k++){
   for (int i = 0; i < deck.length; i++) 
   {
    cardSwap(k, rn.nextInt(52));
   }
  }
  nextCardIndex = 0;
 }
 
 public Card getCard(int index) {
  return deck[index];
 }

  

 public boolean compareTo(Deck otherDeck) {
  for (int k=0; k < deck.length; k++){
   if (! deck[k].compareTo(otherDeck.getCard(k)) ) {
    return false;
   }
  }
  return true;
 }

 public Card nextCard() {
  return deck[nextCardIndex++];
 }

}