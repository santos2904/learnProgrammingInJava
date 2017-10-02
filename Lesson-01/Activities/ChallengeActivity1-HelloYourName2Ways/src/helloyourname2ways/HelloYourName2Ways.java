/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;

public class HelloYourName2Ways 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String first, last;
        System.out.print("Enter your first name: ");
        first = in.nextLine();
        System.out.print("Enter your first name: ");
        last = in.nextLine();
        System.out.printf("Hello %s %s!\n", first, last); // one way
        System.out.printf("Or should I say: %s, %s!\n", last, first); // another way
    }
    
}
