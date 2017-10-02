/* Challenge Activity 3 - Area and Perimeter of a right triangle

This activity is similar to the video lesson. You will take input for lengths of 
sides a and b of of a right triangle, en.wikipedia.org/wiki/Right_triangle
then calculate the area and perimeter.

the area is easy:  0.5 x a x b
the permieter is: a + b + c where c is calculated by the pythagorean theorem
to be the square root of a squared + b squared

SAMPLE OUTPUT:

Enter Right Triangle Side A : 3
Enter Right Triangle Side B : 4
Area: 6.000000; Perimeter: 12.000000

*/
package righttriangle;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        // TODO code application logic here get input, 
        // calculate area, perimeter then display output.
        int A, B;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Right Triangle Side A: ");
        A = in.nextInt();
        System.out.print("Enter Right Triangle Side B: ");
        B = in.nextInt();
        double area = triangleArea(A, B);
        double perimeter = trianglePerimeter(A, B);
        System.out.printf("Area: %,.6f; Perimeter: %,.6f \n", area, perimeter);
    }
    /**
     * Calculates the area of a right triangle
     * @param a side a length
     * @param b side b  length
     * @return the area as a double
     */
    public static double triangleArea( int a, int b) {
        return 0.5 * a * b;
    }
    
    /**
     * Calculates the perimeter of a right triangle
     * @param a side a length
     * @param b side b length 
     * @return the perimeter as a double
     */
    public static double trianglePerimeter( int a, int b) {
        return a + b + Math.sqrt(a*a + b*b);
    }
}
