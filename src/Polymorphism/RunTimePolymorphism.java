package Polymorphism;
// Dynamic Polymorphism , Method Overriding

class Animal {

    void sound(){
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }
    void run(){
        System.out.println("Dog can run");
    }

}

public class RunTimePolymorphism {
    static void main(String[] args) {
        Animal obj = new Dog(); // reference animal , actual object is dog
        obj.sound();
        // obj.run(); it gives compile time error
        Dog d = (Dog) obj ; // reference variable Dog ,actual object Dog
        d.run();
        //Downcasting is used to convert a parent reference into a child reference so that child class specific methods can be accessed.

    }
}
