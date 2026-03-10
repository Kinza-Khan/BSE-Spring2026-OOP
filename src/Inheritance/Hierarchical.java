package Inheritance;

class Animal__{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog__ extends Animal__{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal__{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class Hierarchical {
    static void main(String[] args) {
        Dog__ d = new Dog__();
        d.eat();
        d.bark();

        System.out.println();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
