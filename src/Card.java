/**
 * The card class represents a playing card with the properties of suit and
 * rank.
 *
 * @author Duncan Parke
 * jhed Duncan Parke
 * Date 1/11/2022
 * @version 1.0
 *
 */
public class Card {
   /**
    * The suit of the card.
    */
   private int suit;
   /**
    * The rank of the card.
    */
   private int rank;

   /**
    * Constructs a card with a given rank and suit.
    * If the suit or rank is invalid, the card get suit and rank of 0;
    * @param rank rank of the card
    * @param suit suit of the card
    */
   public Card(int rank, int suit) {
      this.suit = suit;
      this.rank = rank;
   }

   /**
    * Returns the rank of the card.
    * @return rank
    */
   public int getRank() {
      return this.rank;
   }

   /**
    * returns the suit of the card.
    * @return suit
    */
   public int getSuit() {
      return this.suit;
   }

   /**
    * Display card information in a way that
    * is easy to read. This will be read out in the format
    * "The card is the (rank) of (suit)". For invalid inputs,
    * the output will be "The card is invalid".
    * @return String
    */
   @Override
   public String toString() {
      String tempRank = getRankString();
      String tempSuit = getSuitString();
      if ("Invalid".equals(tempRank) || "Invalid".equals(tempSuit)) {
         return "The card is invalid";
      } else {
         return "The card is the " + tempRank + " of " + tempSuit;
      }
   }

   /** Function which returns the plaintext suit of the card.
    * @return
    */

   private String getSuitString() {
      String tempSuit;
      switch (this.suit) {
         case 1:
            tempSuit = "Clubs";
            break;
         case 2:
            tempSuit = "Diamonds";
            break;
         case 3:
            tempSuit = "Hearts";
            break;
         case 4:
            tempSuit = "Spades";
            break;
         default:
            tempSuit = "Invalid";
            break;
      }
      return tempSuit;
   }

   /**  Function which returns the plaintext rank of the card.
    * @return String
    */
   private String getRankString() {
      String tempRank;
      switch (this.rank) {
         case 1:
            tempRank = "Ace";
            break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            tempRank = Integer.toString(this.rank);
            break;
         case 11:
            tempRank = "Jack";
            break;
         case 12:
            tempRank = "Queen";
            break;
         case 13:
            tempRank = "King";
            break;
         default:
            tempRank = "Invalid";
            break;
      }
      return tempRank;
   }

   /**
    * Function to determine if two cards are equal.
    *
    * @param other
    * @return boolean
    */
   @Override
   public boolean equals(Object other) {
      return this.suit == ((Card) other).getSuit() && this.rank ==
         ((Card) other).getRank();
   }

   /** Function to determine the cards
    * given that a higher suit means higher order
    * and a higher rank is used secondary.
    * @param otherCard
    * @return int
    */
   public int compareTo(Card otherCard) {
      if (this.suit > otherCard.getSuit()) {
         return 1;
      }
      else if (this.suit < otherCard.getSuit()) {
         return -1;
      }
      else {
         if (this.rank > otherCard.getRank()) {
            return 1;
         }
         else if (this.rank < otherCard.getRank()) {
            return -1;
         }
         else {
            return 0;
         }
      }
   }
}
