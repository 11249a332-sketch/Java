11249A332
Aim : To write a Java program to display the names and marks of students who scored more than 60 marks.

Algorithm : 
 1. Start.
 2. Declare arrays to store six student names and marks.
 3. Read each student's name and marks.
 4. Check whether the marks are greater than 60.
 5. If true, display the student's name and marks.
 6. Stop.

Program : 
import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}

Output :
Enter Name of Student and Marks of Subject 1: Ravi 75
Enter Name of Student and Marks of Subject 2: Rani 55
Enter Name of Student and Marks of Subject 3: Kumar 80
Enter Name of Student and Marks of Subject 4: Priya 65
Enter Name of Student and Marks of Subject 5: Arun 45
Enter Name of Student and Marks of Subject 6: Sita 90

Students scoring more than 60:
Ravi : 75
Kumar : 80
Priya : 65
Sita : 90

Result : The Java program successfully displays the names and marks of students who scored more than 60.
