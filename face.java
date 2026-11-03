11249A332
Aim : To write a Java Applet program to draw a face using Graphics methods.

Algorithm :
 1. Import the required Java packages.
 2. Create an Applet class named face.
 3. Override the paint(Graphics g) method.
 4. Use drawOval() to draw the face, eyes, and ears.
 5. Use fillOval() to draw the pupils.
 6. Use fillArc() to draw the nose and mouth.
 7. Display the face.

Program :
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}

Output :

Result : Thus, the Java Applet program to draw a face using Graphics methods was successfully executed.
