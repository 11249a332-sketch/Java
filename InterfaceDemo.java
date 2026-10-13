11249A332
Aim : To write a Java program to demonstrate an interface using the Animal interface.

Algorithm : 
 1. Start the program.
 2. Create an interface Animal with the method sound().
 3. Implement the interface in the Dog class.
 4. Define the sound() method.
 5. Create a Dog object and call the method.
 6. Stop.

Program : 
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

Output : 
Dog Barks

Result : Thus, the Java program to demonstrate an interface was executed successfully.
