/* Challenge Activity 3 - ATM

    Let's use the ATMMenu enum and switch statement to a main menu for an ATM.
    1) Print the ATM menu
    2) Prompt for a menu choice: d = deposit, w = withdrawl, b = balance and q = quit.
    3) use the switch statement to determine the choice 
    4) print the output back to the user

SAMPLE EXECUTION:

*********************************
*** Welcome to FudgeBank ATM! ***
***         Main Menu         ***
*********************************

[d=Deposit,w=Withdrawl,b=Balance,q=Quit] ? w
You selected: Withdrawl

 */
package fudgebanking;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        // TODO : code here
        Scanner in = new Scanner (System.in);
        ATMMenu option;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~     Welcome to SantaBank ATM!     ~~~~");
        System.out.println("~~~~            Main Menu              ~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Select an option");
        System.out.println("[d=Deposit, w=Withdrawl, b=Balance, q=Quit]");
        String choice = in.nextLine();
        switch (choice)
        {
            case "d":
                option = ATMMenu.Deposit;
                break;
            case "w":
                option = ATMMenu.Withdrawl;
                break;
            case "b":
                option = ATMMenu.Balance;
                break;
            case "q":
                option = ATMMenu.Quit;
                break;  
            default:
                option = ATMMenu.Quit;
                break; 
        }
        System.out.printf("You selected %s: %s\n", choice, option);
    }
}
