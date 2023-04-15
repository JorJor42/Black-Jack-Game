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
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */

public class Player
{
 
 private String name;
 private Hand hand;
 
 public Player() 
 {
  hand = new Hand();
  
 }

 public void setName(String name1)
 {
  name = name1;
 }
 
 public String getName()
 {
  return name;
 }

 public int getTotal() 
 {
  return hand.calcTotal();
 }
 
 public void addCard(Card card)
 {
  hand.addCard(card);
 }
 
 public String getHandString() 
 {
  String strCard= "Cards:" + hand.getInfo();
  return strCard;
 }
 public void removeHand()
 {
  hand.removeHand();
 }
}