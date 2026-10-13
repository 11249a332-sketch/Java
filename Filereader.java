11249A332
Aim : To write a Java program to read and display the contents of a file using FileReader.  

Algorithm : 
 1. Start the program.
 2. Open the file using FileReader.
 3. Read characters until the end of the file.
 4. Display each character.
 5. Close the file.
 6. Handle exceptions.
 7. Stop.

Program :
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}

Output :
A
B
C
D
...
Z

Result :  Thus, the Java program to read and display the contents of a file was executed successfully. 
  
