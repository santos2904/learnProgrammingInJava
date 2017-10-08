/** Challenge Activity 2 - Print Bar Chart
 * 
 * In this activity you will implement a text mode bar chart.
 * For example, if you enter a value of 3 the bar chart will
 * contain three #'s ex. ###
 * The implementation is best explained through a sample run.
 * 
 * SAMPLE RUN(S):
 * 
 * Enter value for A : 4
 * Enter value for B : 13
 *  4 : [####]
 * 13 : [#############]
 * 
 * Enter value for A : 15
 * Enter value for B : 1
 * 15 : [###############]
 *  1 : [#]
 * 
 * 
 * your main() method should call the drawBarChart() method for a and b
 * the heavy lifting is done in the drawBarChart() method which requires a for loop
 */
package barchart;

import java.util.Scanner;

public class BarChartRun {

    public static void main(String[] args) {        
        //TODO: Write code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for A: ");
        int a = in.nextInt();
        System.out.print("Enter a value for B: ");
        int b = in.nextInt();
        drawBarChart(a);
        drawBarChart(b);
    }
    
    public static void drawBarChart(int value) {
        System.out.printf("%d : [", value);
        for (int i = 0; i <= value; i++){
            System.out.print("#");
        }
        System.out.println("]");
    }
}
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /**
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for A: ");
        int a = in.nextInt();
        System.out.print("Enter a value for B: ");
        int b = in.nextInt();
        System.out.printf("%d : [", a);
        for (int i = 0; i <= a; i++)
        {
            System.out.print("#");
        }
        System.out.println("]");
        
        System.out.printf("%d : [", b);
        for (int i = 0; i <= b; i++)
        {
            System.out.print("#");
        }
        System.out.println("]");
        */
    
 
