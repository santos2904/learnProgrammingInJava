/** Challenge Activity 1 - The Password
 *
 * In this project folder you will find a text file called password.txt
 * inside the file is the password.
 *
 * Write a program to load this password from the file into a string,
 * then build a loop which asks the user to enter the password until they
 * do so correctly
 *
 * Note: don't forget to close the file!
 *
 * SAMPLE RUN:
 * Enter Password: snake
 * Invalid Password!
 * Enter Password: testing
 * Invalid Password!
 * Enter Password: rhubarb
 * Password Accepted!
 */
package thepassword;

import java.io.File; // imported 
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThePassword {

    public static void main(String[] args) throws FileNotFoundException {
            System.out.println("PASSWORD CHECKER");
            File file = new File("password.txt");
            Scanner finput = new Scanner(file);
            Scanner input = new Scanner(System.in);
            String pw = finput.nextLine();
            finput.close();
            while (true) {
                System.out.println("Enter Password: ");
                String typed = input.nextLine();
                if (typed.equals(pw)) {
                    System.out.println("Correct Password!");
                    break;
                } else {
                    System.out.println("Invalid password!");
        }
    }
}
}
