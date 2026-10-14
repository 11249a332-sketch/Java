11249A332
Aim : To write a Java program to demonstrate different types of inheritance: Single, Multilevel, Hierarchical, Multiple, and Hybrid Inheritance.

Algorithm : 
 1. Start the program.
 2. Create the Animal class with the eat() method.
 3. Create the Dog class extending Animal.
 4. Create the Puppy class extending Dog.
 5. Create the Cat class extending Animal.
 6. Create Father and Mother interfaces and implement them in the Child class.
 7. Create the Student class and Sports interface.
 8. Create the CollegeStudent class extending Student and implementing Sports.
 9. Create objects and call the methods to demonstrate inheritance.
 10. Stop the program.

Program :
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }
    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}
interface Sports {
    void playSports();
}
class Student {
    void study() {
        System.out.println("Student studies");
    }
}
class CollegeStudent extends Student implements Sports {
    public void playSports() {
        System.out.println("College student plays sports");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
        System.out.println("\nMultiple Inheritance:");
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();
        System.out.println("\nHybrid Inheritance:");
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.playSports();
    }
}

Output :
Single Inheritance:
Animal eats
Dog barks

Multilevel Inheritance:
Animal eats
Dog barks
Puppy plays

Hierarchical Inheritance:
Animal eats
Cat meows

Multiple Inheritance:
Child gets property from Father
Child gets property from Mother

Hybrid Inheritance:
Student studies
College student plays sports

Result : The Java program was executed successfully and demonstrates the five types of inheritance using classes and interfaces.
