package interactivehello;

import java.util.Scanner;

public class InteractiveHello 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name > ");                
        String yourName = input.nextLine();
        System.out.printf("Hello, %s!\n", yourName); 
    }
}
