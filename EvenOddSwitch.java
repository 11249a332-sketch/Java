11249A332
Aim : To write a Java program to check whether a number is even or odd using a switch statement.

Algorithm :
 1. Start the program.
 2. Read a number from the user.
 3. Find the remainder using n % 2.
 4. Use switch to check the remainder.
 5. Display whether the number is even or odd.
 6. Stop.    

Program :
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}

Output :
Enter a number: 8
This number is even

Result : Thus, the Java program to check whether a number is even or odd using a switch statement was executed successfully.
