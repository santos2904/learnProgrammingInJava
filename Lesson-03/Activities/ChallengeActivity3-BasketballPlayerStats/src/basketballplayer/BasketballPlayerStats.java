/* Challenge Activity 3 - Basketball Player Stats

This challenge activitiy should ask for the following inputs:
- a basketball player's name and the following "stats" (all integers)
- total free throws made / attempted
- total field goals made / attempted

and then display the player's "Stats"

player name, total points, free throw pct, field goal pct

For example:

Enter player's name: Tony
Free throws attempted: 4
Free throws made: 3
Field goals attempted: 10
Field goals made: 5

Tony's stats:
Points: 13 
FT %: 0.75
FG %: 0.50

 */
package basketballplayer;

import java.util.Scanner;


public class BasketballPlayerStats {


    public static void main(String[] args) {
        String name;
        int points, fta, ftm, fga, fgm;
        double FT, FG;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter player's name: ");
        name = in.nextLine();
        System.out.print("Free throws attempted: ");
        fta = in.nextInt();
        System.out.print("Free throws made: ");
        ftm = in.nextInt();
        System.out.print("Field goals attempted: ");
        fga = in.nextInt();
        System.out.print("Field goals made: ");
        fgm = in.nextInt();
        System.out.println();
        FT = (double) ftm / fta;
        FG = (double) fgm / fga;
        points = ftm + 2 * fgm;
        System.out.printf("%s's stats: \nPoints: %d\nFT %% : %.2f\nFG %%: %.2f\n", name, points, FT, FG); // % used when you want to print "%" in a printf statement
    }
    
}
