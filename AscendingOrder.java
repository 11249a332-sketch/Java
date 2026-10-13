11249A332
Aim : To write a Java program to sort array elements in ascending order.

Algorithm :
 1. Start the program.
 2. Read the number of array elements.
 3. Enter the array elements.
 4. Compare elements using nested loops and swap them if necessary.
 5. Display the elements in ascending order.
 6. Stop.

Program :
import java.util.Scanner;  
public class 
AscendingOrder
{
public static void main(String[] args)
{
int n, temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of elements you want in array:");n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
temp=a[i];
a[j]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for (int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}

Output :
Enter number of elements you want in array: 5
Enter all the elements:
5 2 8 1 3
AscendingOrder:1,2,3,5,8

Result  : Thus, the Java program to sort array elements in ascending order was executed successfully.
