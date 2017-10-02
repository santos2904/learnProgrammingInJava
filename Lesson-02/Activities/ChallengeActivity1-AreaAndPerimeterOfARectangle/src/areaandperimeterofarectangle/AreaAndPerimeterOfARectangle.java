/* Challenge Activity 1
 * 
 * This program should take two integer inputs:
 *  length and width of a rectangle. 
 *  using those inputs it should calculate and display the 
 *  the area and perimeter of the recrangle. 
 * 
 *  Area = Length x Width
 *  Perimeter = 2 x (Length + Width)
 * 
 * SAMPLE RUN: 
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */

package areaandperimeterofarectangle;

import java.util.Scanner;

public class AreaAndPerimeterOfARectangle {

    public static void main(String[] args) {
        int area, perimeter, length, width; // declare variables
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = in.nextInt(); // get length and width with inputs
        System.out.print("Enter the width: ");
        width = in.nextInt();
        area = length * width; // perform area, perimeter calculations
        perimeter = 2 *(length + width);
        System.out.printf("Area: %d\nPerimeter: %d\n",area, perimeter);// display outputs
    }
}
