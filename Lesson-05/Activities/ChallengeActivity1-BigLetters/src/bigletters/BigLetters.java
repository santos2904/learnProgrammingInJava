/* Challenge Activity 1 - DAD and ADD in Bigletters
 * 
 * This is a great challenge in writing and calling functions.
 * 
 * This program will print out big letters (but only "D" and "A" 
 * it it then used used to print words DAD and ADD
 * 
 * The letters print vertically. Sample output
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 * 
 *   X  
 *  X X 
 * X   X
 * XXXXX
 * X   X
 * X   X
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 * 
 * 
 *   X  
 *  X X 
 * X   X
 * XXXXX
 * X   X
 * X   X
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 * 
 * XXX  
 * X  X 
 * X   X
 * X   X
 * X  X
 * XXX
 */

package bigletters;

public class BigLetters {

    public static void main(String[] args) {
        PrintDAD();// TODO: print "DAD" then "ADD" in big letters
        System.out.println();
        PrintADD();// do this by calling PrintDAD() and PrintADD
    }

    public static void PrintADD() {
        PrintA();//TODO: Write code to print ADD in big letters
        System.out.println();
        PrintD();// by calling the PrintA() and PrintD() methods
        System.out.println();
        PrintD();
    }
    
    public static void PrintDAD() {
        PrintD();//TODO: Write code to print DAD in big letters, 
        System.out.println();
        PrintA();// by calling the PrintA() and PrintD() methods
        System.out.println();
        PrintD();
    }
    
    public static void PrintA() {
        System.out.println("  X  ");// TODO: Write code to print the letter "A" in big letters
        System.out.println(" X X ");
        System.out.println("X   X");
        System.out.println("XXXXX");
        System.out.println("X   X");
        System.out.println("X   X");
    }
    
    public static void PrintD() {
        System.out.println("XXX  ");// TODO: Write code to print the letter "D" in big letters
        System.out.println("X  X ");
        System.out.println("X   X");
        System.out.println("X   X");
        System.out.println("X  X ");
        System.out.println("XXX  ");
    }
}
