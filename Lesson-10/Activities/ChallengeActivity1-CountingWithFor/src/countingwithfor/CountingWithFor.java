/** Challenge Activity 1 - Counting with a for loop
 * 
 * In this activity you will use a for loop to roll a die 5000 times and count
 * the number of times a 1 comes up on the die. This is a fairly common practice 
 * in "data processing" style computer programs.
 * 
 * Do this 5000 times
 *  roll a die
 *  if it comes up 1 then increase the count
 * 
 * After the loop is over display the number of rolls, count of 1's and 
 * percentage of rolls which came up 1. (Should be close to 0.167)
 * 
 * Make sure to "block out" your code correctly. 
 * Sloppy code is as bad as incorrect code!
 * 
 * SAMPLE RUN:
 * 
 */
package countingwithfor;

public class CountingWithFor {

    public static void main(String[] args) {
        //TODO: Write your code here
        int count = 0;
        int rolls = 5000;
        Die die = new Die(6);
        for (int i = 0; i <= rolls; i++)
        {
            if (die.roll() == 6)
            {
                count++;
            }
        }
        System.out.printf("Number of rolls  : %d\n", rolls);
        System.out.printf("Number of 1s     : %d\n", count);
        System.out.printf("Percentage of 1s : %,.3f\n", (double)count/rolls);
    }    
}
