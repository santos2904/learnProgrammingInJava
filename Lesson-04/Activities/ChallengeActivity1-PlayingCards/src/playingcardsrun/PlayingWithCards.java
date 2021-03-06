/* Challenge Activity 1 - Playing with Cards
 * 
Write a program which uses the Card class in the playingcards package and Random
class in java.util to :

1) Create the queen of hearts card
2) Create a random card (one of the 52 possible cards)
3) print out both cards and whether they are the same suit.
 
 */
package playingcardsrun;

import java.util.Random;
import playingcards.Card;
import playingcards.Ranks;
import playingcards.Suits;

public class PlayingWithCards {

    public static void main(String[] args) {
        Random generator = new Random();
        Card queenHearts = new Card (Ranks.QUEEN, Suits.HEARTS);
        Card randomCard = new Card (generator.nextInt(52));
        System.out.printf ("%s %s cards are same suit: %s\n", queenHearts, randomCard, randomCard.sameSuit(queenHearts)); 
    }
}
