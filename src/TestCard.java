/** Unit tests for Time class. */

public class TestCard {

   /**
    * A helper method to asserts that two integers are equal.
    * @param exp expected integer value.
    * @param act integer value.
    * @param dsc description of the test.
    */
   public static void assertEquals(int exp, int act, String dsc) {
      if (exp == act) {
         System.out.println("PASS: " + dsc);
      } else {
         System.out.println("FAIL: " + dsc);
      }
   }

   /**
    * A helper method to asserts a boolean expression is true.
    * @param exp boolean expression
    * @param dsc description of the test.
    */
   public static void assertTrue(boolean exp, String dsc) {
      if (exp) {
         System.out.println("PASS: " + dsc);
      } else {
         System.out.println("FAIL: " + dsc);
      }
   }


   /**
    * Execution starts here.
    * @param args command-line arguments.
    */
   public static void main(String[] args) {
      Card kingOfClubs = new Card(13, 1);
      System.out.println(kingOfClubs);
      assertEquals(13, kingOfClubs.getRank(),
             "Rank is correctly assigned.");
      assertEquals(1, kingOfClubs.getSuit(),
             "Suit is correctly assigned.");
   
      Card c1 = new Card(4, 2);
      Card c2 = new Card(3, 3);
      Card c3 = new Card(4, 2);
      Card c4 = new Card(2, 2);
   
      assertTrue(c1.equals(c3), 
         "two cards with same rand and suit are equal.");
      assertTrue(c3.equals(c1), "equals is symmetric.");
      assertTrue(c2.compareTo(c1) < 0,
         "A card with higher suit has higher order.");
      assertTrue(c1.compareTo(c4) > 0, 
         "A card with same suit but higher rank has higher order.");
   }
}