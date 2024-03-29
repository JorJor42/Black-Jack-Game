/*
 @author Jordan Vendrame
 @author Fadil Nizar
 @author Aromal Suresh Kumar
 12/04/2023
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