/*Challenge Activity 2 - degrees of a triangle
 * 
 * The sum of the 3 angles of any triangle should total 180 degrees.
 * Any more or any less then the figure cannot be a triangle.
 * 
 * Write a program to accept 3 integer angles as input and checks 
 * whether it is a valid triangle by checking the sum against 180 degrees
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter degrees for angle 1 : 50
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   180 degrees. That's a GOOD triangle!
 * 
 *   Enter degrees for angle 1 : 51
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   181 degrees. That's a BAD triangle!
 */
package degreesofatriangle;

import java.util.Scanner;

public class DegreesOfATriangle {

    public static void main(String[] args) {
	int angle1, angle2, angle3, sum; 
        Scanner in = new Scanner (System.in);
        System.out.print("Enter degrees for angle 1: ");
        angle1 = in.nextInt();
        System.out.print("Enter degrees for angle 2: ");
        angle2 = in.nextInt();
        System.out.print("Enter degrees for angle 3: ");
        angle3 = in.nextInt();
        sum = angle1 + angle2 + angle3;
        if (sum > 180 || sum < 180)
        {
            System.out.printf("%d degrees. That's a BAD triangle! \n", sum);
        }
        else
        {
            System.out.printf("%d degrees. That's a GOOD triangle! \n", sum);
        }
        //        String result = sum == 180 ? "GOOD" : "BAD";  //(another way to do)
        //        System.out.printf("%d degrees. That's a %s triangle!\n", sum, result);
    }
}
