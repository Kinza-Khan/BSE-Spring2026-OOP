package Polymorphism;

class Animals{

    void sound(){
        System.out.println("Animal makes a sound");
    }

    void eat(){
        System.out.println("Animal eats food");
    }

    void sleep(){
        System.out.println("Animal sleeps");
    }

}
class Dogs extends Animals{

    void sound(){
        System.out.println("Dog barks");
    }

    void run(){
        System.out.println("Dog runs fast");
    }

}

class Cat extends Animals{

    void sound(){
        System.out.println("Cat meows");
    }

    void jump(){
        System.out.println("Cat jumps high");
    }

}

public class SimpleRunTime {
    public static void main(String[] args){

        Animals a;

        a = new Dogs();
        a.sound();
        a.eat();
        a.sleep();

        System.out.println();

        a = new Cat();
        a.sound();
        a.eat();
        a.sleep();

    }
}
