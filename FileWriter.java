11249A332
Aim : To write a Java program to write uppercase alphabets from A to Z into a file.

Algorithm :
 1.  Start the program.
 2. Create a FileWriter object.
 3. Write characters A to Z into the file.
 4. Close the file.
 5. Handle exceptions if any occur.
 6.Stop.

Program :
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}

Output:
File created: sample2.txt
Content of sample2.txt :
ABCDEFGHIJKLMNOPQRSTUVWXYZ 

Result : Thus, the Java program to write uppercase alphabets into a file was executed successfully.




