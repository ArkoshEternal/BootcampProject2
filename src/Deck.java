/**
 * This class is used to create a 52 card deck given an existing card class.
 * @author Duncan Parke
 * @version 1.0
 * jhed dep17351
 * date 1/13/2022
 */
public class Deck {

   /**
    * Static constant for the number of cards in a deck.
    */
   public static final int NUMCARDS = 52; // 52 cards in a deck

   /**
    * Private array oof cards
    */
   private Card[] cards;

   /**
    * A class representing a deck of cards.
    *
    */

   public Deck() {
      cards = new Card[NUMCARDS];
      for (int i = 1; i < 5; i++) {
         for (int j = 1; j < 14; j++) {
            cards[(i - 1) * 13 + j - 1] = new Card(j, i);
         }
      }
   }

   @Override

   public String toString() {
      String s = "";
      for (int i = 0; i < NUMCARDS; i++) {
         s += cards[i].toString() + "\n";
      }
      return s;
   }

   /**
    * Shuffles the deck by swapping cards at random indices 104 times.
    *
    * @params: none
    */

   public void shuffle() {
      for (int i = 0; i < 103; i++) {
         int rand1 = (int) (Math.random() * NUMCARDS);
         int rand2 = (int) (Math.random() * NUMCARDS);
         swap(rand1, rand2);
      }
   }

   /**
    * Swaps the cards at the given indices.
    *
    * @param index1 the index of the first card
    * @param index2 the index of the second card
    */

   private void swap(int index1, int index2) {
      Card temp = cards[index1];
      cards[index1] = cards[index2];
      cards[index2] = temp;
   }

   /**
    * Method to sorts the deck back into original order.
    *
    */

   public void sort() {
      for (int j = 0; j < NUMCARDS; j++) {
         Card c = cards[j];
         int i = j - 1;
         while (i >= 0 && cards[i].compareTo(c) > 0) {
            cards[i + 1] = cards[i];
            i--;
         }
         cards[i + 1] = c;
      }
   }
}
