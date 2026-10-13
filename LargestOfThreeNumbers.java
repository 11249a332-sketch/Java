11249A332
Aim : To write a Java program to find the largest of three integers using if-else.

Algorithm : 
 1. Start the program.
 2. Read three integers.
 3. Compare the numbers using if-else.
 4. Display the largest number.
 5. If numbers are equal, display a suitable message.
 6. Stop. 

Program : 
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}

Output :
Enter three integers:
10
25
15
Second number is largest

Result : Thus, the Java program to find the largest of three integers was executed successfully.
