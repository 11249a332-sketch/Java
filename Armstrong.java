11249A332
Aim : To write a Java program to check whether a given number is an Armstrong number.

Algorithm :
 1. Start the program.
 2. Read a positive number.
 3. Extract each digit using modulus (%).
 4. Find the sum of cubes of the digits.
 5. Compare the sum with the original number.
 6. Display whether it is an Armstrong number.
 7. Stop.
 
Program : 
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}

Output :
Enter any Positive Number: 153
Armstrong Number

Result : Thus, the Java program to check whether a number is an Armstrong number was executed successfully.
