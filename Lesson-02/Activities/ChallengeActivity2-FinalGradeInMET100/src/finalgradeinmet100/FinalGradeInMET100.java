/* Challenge Activity 2
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays your total of all 3
 * exam scores and percentage (as a whole number) 
 * 
 * SAMPLE RUN: 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *  
 */

package finalgradeinmet100;

import java.util.Scanner;

public class FinalGradeInMET100 {

    public static void main(String[] args) {
       int score1, score2, score3, total;
       Scanner in = new Scanner(System.in);
       System.out.print ("Enter the score for Exam 1: ");
       score1 = in.nextInt();
       System.out.print ("Enter the score for Exam 2: ");
       score2 = in.nextInt();
       System.out.print ("Enter the score for Exam 3: ");
       score3 = in.nextInt();
       total = score1 + score2 + score3; // calculate sum total
       double percentage =  total / 4.5; // find the percentage
       System.out.printf ("Total Points : %d\nPercentage : %2.0f\n", total, percentage); // output
    }
}
