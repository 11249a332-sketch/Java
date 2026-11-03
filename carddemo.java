11249A332
Aim : To write a Java Applet program using the CardLayout Manager to display buttons one at a time. When a button is clicked, the next button is displayed.

Algorithm :
 1. Create an Applet class implementing ActionListener.
 2. Create a Panel and CardLayout object.
 3. Create three buttons and add them to the panel.
 4. Set CardLayout as the panel's layout.
 5. Add action listeners to the buttons.
 6. Use buttonCardLayout.next() to display the next button when clicked.  

Program :
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}

Output :

Result : Thus, the Java Applet using CardLayout was successfully executed.

