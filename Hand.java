public class Hand
{
 private Card[] theHand = new Card[12];
 private int numCards = 0;

 // Calculates the total of a hand and also decides whether the ace should be a 1 or 11
 //wanted to give players the choice, but it was easier this way as i already had to code logic for the dealer.
 public int calcTotal() {
  int total =0;
  boolean checkAce = false;
  for (int k = 0; k < numCards; k++) 
  {
   int value = theHand[k].getValue();
   if (value > 10) {
    value = 10;
   }
   else if ( value == 1)
   {
    checkAce = true;
   }
   total += value;
  }
  if (checkAce && total + 10 <= 21) {
   total += 10;
  }
  return total;
 }
 
 public String getInfo(){
  return this.getInfo(false, false);
 }
 
 public String getInfo(boolean isDealer, boolean holeCard){ //hiding the dealers 1st card / hole card never got fully implemented
  String strCard= "";
  int total =0;
  boolean checkAce = false;
  String aceString = "";
  for (int k = 0; k < numCards; k++) 
  {
   if ( isDealer && holeCard && k == 0) 
   {
    strCard= " Showing";
   } 
   else 
   {
    int value = theHand[k].getValue();
    String valueName;
    if (value > 10) {
     valueName = theHand[k].getValueName().substring(0, 1);
    } 
    else if ( value == 1 )
    {
     valueName = "A";
    }
    else
    {
     valueName = Integer.toString(value);
    }
      strCard+= " " +valueName + theHand[k].getSuitTitle();
    if (value > 10) {
     value = 10;
    }
    else if ( value == 1)
    {
     checkAce = true;
    }
    total += value;
   }
  }
  if (checkAce && total + 10 <= 21) {
   aceString = " or "+ (total + 10);
  }
  if ( holeCard)
  {
   return strCard;
  } 
  else 
  {
   return strCard+ ", which totals "+ total + aceString;
  }
  
 }
 
 public void addCard(Card card)
 {
  theHand[numCards++] = card;
 }
 
 public void removeHand()
 {
  numCards = 0;
 }
}