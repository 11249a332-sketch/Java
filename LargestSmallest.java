11249A332
Aim : To write a Java program to find the sum, largest, and smallest elements in an array.

Algorithm : 
 1. Start the program.
 2. Initialize the array and set sum, min, and max.
 3. Traverse the array using a loop.
 4. Calculate the sum and find the largest and smallest elements.
 5. Display the results.
 6. Stop.  

Program : 
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}

Output : 
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9

Result : Thus, the Java program to find the sum, largest, and smallest elements in an array was executed successfully.
