11249A332
Aim : To write a Java program to generate the Fibonacci series for a given value of n.

Algorithm :
 1. Start the program.
 2. Read the value of n.
 3. Initialize the first two numbers as 0 and 1.
 4. Generate the next numbers by adding the previous two numbers.
 5. Display the Fibonacci series.
 6. Stop. 

Program :
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}

Output :
Enter the value of n: 5
0 1 1 2 3 5

Result : Thus, the Java program to generate the Fibonacci series was executed successfully.
