/** Challenge Activity 3 - Sorting Cards in your Hand
 * 
 * In this activity, we will write code to deal out 2 seven-card hands from
 * 1 deck of shuffled cards. You will then sort those hands by rank, then suit.
 * 
 * Inside Hand.java, implement the following methods.
 * - sortSuitFirst() sorts the hand by suit then rank (similar to the method in Deck.java)
 * - sortRankFirst() sorts the hand by rank then suit.
 * Note: In both cases you should use a comparator with Collections.sort easy.
 * 
 * Inside this file, write a main() method to
 *  use 1 deck of cards, 
 *  shuffle that deck, 
 *  deal 7 cards each into two hand (hint: use a loop, alternate cards to each hand)
 *  show hand 1
 *  sort hand 1 by rank
 *  sort hand 1 by suit
 *  show hand 2
 *  sort hand 2 by rank
 *  sort hand 2 by suit
 * 
 * PROGRAM OUTPUT: (for 1 deck of cards, random number seed 15)

FRESH DECK ==> 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
SHUFFLED DECK ==> T♣ 4♥ T♠ 4♠ J♣ 4♦ 9♥ 5♥ Q♦ Q♠ J♦ 6♠ 6♥ 3♦ J♠ 2♣ 2♥ 5♠ T♥ Q♥ 8♠ 7♦ 5♦ A♣ K♥ T♦ 3♣ 9♦ 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦ 

HAND #1 CARDS     ==> T♣ T♠ J♣ 9♥ Q♦ J♦ 6♥ 
HAND #1 RANK SORT ==> 6♥ 9♥ T♣ T♠ J♣ J♦ Q♦ 
HAND #1 SUIT SORT ==> T♣ J♣ J♦ Q♦ 6♥ 9♥ T♠ 

HAND #2 CARDS     ==> 4♥ 4♠ 4♦ 5♥ Q♠ 6♠ 3♦ 
HAND #2 RANK SORT ==> 3♦ 4♦ 4♥ 4♠ 5♥ 6♠ Q♠ 
HAND #2 SUIT SORT ==> 3♦ 4♦ 4♥ 5♥ 4♠ 6♠ Q♠ 

*/

package sortinghands;
import playingcards.*;
public class SortingHandsRun {

    public static void main(String[] args) {
        // TODO: Implement the code here. random number seed is 15
        Deck d = new Deck(1, 15); // use 1 deck of cards
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        System.out.printf("FRESH DECK  \t ==> %s \n", d.toString());
        d.shuffle(); // shuffle that deck
        System.out.printf("SHUFFLE DECK  \t ==> %s \n", d.toString());
        for (int i = 0; i < 7; i++) { //deal 7 cards each into two hand 
            hand1.add(d.deal());
            hand2.add(d.deal());
        }  
        System.out.println();
        System.out.printf("HAND #1 CARDS \t ==> %s \n", hand1.toString()); //show hand 1
        hand1.sortRankFirst(); // sort hand 1 by rank
        System.out.printf("HAND #1 RANK \t ==> %s \n", hand1.toString()); 
        hand1.sortSuitFirst(); // sort hand 1 by suit
        System.out.printf("HAND #1 SUIT \t ==> %s \n", hand1.toString()); 
        System.out.println();
        System.out.printf("HAND #2 CARDS \t ==> %s \n", hand2.toString());
        hand2.sortRankFirst();
        System.out.printf("HAND #2 RANK \t ==> %s \n", hand2.toString()); 
        hand2.sortSuitFirst();
        System.out.printf("HAND #2 SUIT \t ==> %s \n", hand2.toString());
    }
}

