/*
 @author Jordan Vendrame
 @author Fadil Nizar
 @author Aromal Suresh Kumar
 12/04/2023
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