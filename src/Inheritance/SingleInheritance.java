package Inheritance;

// single inheritance
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
