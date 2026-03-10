package Inheritance;

class Animal_{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal_{
    void walk(){
        System.out.println("Mammal walks");
    }
}

class Dog_ extends Mammal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class Multilevel {
    static void main(String[] args) {
        Dog_ d = new Dog_();
        d.eat();
        d.walk();
        d.bark();
    }
}
