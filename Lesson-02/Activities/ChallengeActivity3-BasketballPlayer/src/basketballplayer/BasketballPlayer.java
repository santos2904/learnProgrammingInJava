/* Challenge Activity 3

This challenge activitiy should ask for the following inputs:
- a basketball player's name
- average points per game
- height in inches

and then display the player name, average points per game, 
and height in ft and inches

There are 12 inches in 1 ft. so 75 inches is 6ft 3 inches

 */
package basketballplayer;

import java.util.Scanner;

/**
 *
 * @author mafudge
 */
public class BasketballPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int points, feet, inches, height;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter player's name: ");
        name = in.nextLine();
        System.out.print("Enter average points per game: ");
        points = in.nextInt();
        System.out.print("Enter player height in inches: ");
        inches = in.nextInt();
        feet = inches / 12;
        height = inches % 12;
        //System.out.println(feet + "ft " + height + "inches"); // test
        System.out.printf ("%s is %d ft %d inches tall and his average poinSts per game is %d\n", name, feet, height, points);
                
    }
    
}
