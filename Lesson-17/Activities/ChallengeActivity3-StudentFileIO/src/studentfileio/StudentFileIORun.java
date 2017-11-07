/** Challenge Activity 3 - Reading and Writing Students from a file
 * 
 * In this activity, we will write code to use methods which read / write 
 * student object data to / from a file. It demonstrates the use of object
 * serialization.
 * 
 * The Load() and Save() methods of the Student class have been written for you.
 * You task is to write the main() method which should do the following:
 * 
 * 1. Create File object for "student.txt
 * 2. Create two Students s1 and s2
 * 3. get input from user Name & GPA for Student s1
 * 4. Write s1 to the file.
 * 5. Read into s2 from the file
 * 6. print out student s2
 * 7. ??????
 * 8. PROFIT!!!! :-)

EXAMPLE OUTPUT FROM RUN:
Enter Student Name ==> Bill Melator
Enter Student GPA  ==> 3.42
Writing to student.txt...
Reading from student.txt...
Student: Bill Melator	3.420000
 
 * 
*/
package studentfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileIORun {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code your application logic here
        Scanner in = new Scanner (System.in);
        File f = new File("student.txt");
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.printf("Enter Student Name: \t");
        s1.setName(in.nextLine());
        System.out.printf("Enter Student GPA: \t");
        s1.setGPA(in.nextDouble());
        System.out.printf("Adding to %s \n", f.getName());
        s1.Save(f);
        System.out.printf("Loading from %s \n", f.getName());
        s2.Load(f);
        System.out.printf("Student: \t %s", s2);
    }
}
