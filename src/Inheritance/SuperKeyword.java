package Inheritance;

class Animal___{

    //parent Constructor Call
    Animal___(){
        System.out.println("Animal constructor");
    }

    void eat(){
        System.out.println("Animal eats");
    }

}
class Dog___ extends Animal___{
    Dog___(){
//        super();
        System.out.println("Dog constructor");
    }
    void eat(){
//        super.eat();
        System.out.println("Dog eats bones");
    }

}
public class SuperKeyword {
    static void main(String[] args) {
        Dog___ d = new Dog___();
        d.eat();
    }
}
