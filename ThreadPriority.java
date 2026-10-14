11249A332
Aim : To write a Java program to demonstrate thread creation and thread priorities using the Thread class.

Algorithm : 
 1. Start the program.
 2. Create three thread classes: A, B, and C.
 3. Override the run() method in each class to print numbers from 1 to 4.
 4. Create objects for all three threads.
 5. Set thread C to maximum priority, thread A to minimum priority, and thread B to the priority of thread A plus one.
 6. Start all three threads using the start() method.
 7. Display the output of the threads.
 8. Stop the program.

 Program :
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}

Output :
start thread A
start thread B
start thread C
end of main thread
Thread A started
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
Thread B started
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
thread C started
thread c =1
thread c =2
thread c =3
thread c =4
exit from c

Result : The Java program demonstrates multithreading and thread priorities using the Thread class and the setPriority() method. Thread priority influences scheduling but does not guarantee execution order.
