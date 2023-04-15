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
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card
{

 private char suit;
 private int value;

 private Card() 
 {
  suit = ' ';
  value = 0;
 }
 public Card(char newSuit, int newValue) 
 {
   this.value = newValue;
   this.suit = newSuit;
  }
 public String getInfo() 
 {
  return getSuit() + " " + this.value;
 }
 public String getSuit() 
 {
  String suit;
  if (this.suit == 'H') 
  {
   suit = "Hearts";
  }
  else if (this.suit == 'S') 
  {
   suit = "Spades";
  }
  else if (this.suit == 'C') 
  {
   suit = "Clubs";
  }
  else if (this.suit == 'D') 
  {
   suit = "Diamonds";
  }
  else 
  {
   suit = "Unknown";
  }
  return suit;
 }
 public char getSuitTitle() 
 {
  return suit;
 }
 public String getValueName()
 {
  String name = "Unknown";
  if (this.value == 1)
  {  
   name = "Ace";
  }
  else if (this.value == 2) 
  {
   name = "Two";
  }
  else if (this.value == 3) 
  {
   name = "Three";
  }
  else if (this.value == 4) 
  {
   name = "Four";
  }
  else if (this.value == 5) 
  {
   name = "Five";
  }
  else if (this.value == 6) 
  {
   name = "Six";
  }
  else if (this.value == 7) 
  {
   name = "Seven";
  }
  else if (this.value == 8) 
  {
   name = "Eight";
  }
  else if (this.value == 9) 
  {
   name = "Nine";
  }
  else if (this.value == 10) 
  {
   name = "Ten";
  }
  else if (this.value == 11) 
  {
   name = "Jack";
  }
  else if (this.value == 12) 
  {
   name = "Queen";
  }
  else if (this.value == 13) 
  {
   name = "King";
  } 
  return name;
 }
 
 public int getValue() 
 {
  return this.value;
 }
 
 
 public boolean compareSuit(Card card)
 {
  return this.suit == card.getSuitTitle();

 }
 
 public boolean compareValue(Card card)
 {
  
  return this.value == card.getValue();
 }
 
 public boolean compareTo(Card card)
 {
  
  return this.suit == card.getSuitTitle() && this.value == card.getValue();
 }
}