package Polymorphism;

class Animall{

    void sound(){
        System.out.println("Animal sound");
    }

}

class Dogg extends Animall{

    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }

    void run(){
        System.out.println("Dog runs");
    }

}

 class Test2{

    public static void main(String[] args){

//        Animall a = new Dogg();
//
//        a.sound();
//
//        Dogg d = (Dogg) a;
//
//        d.sound();
//
//        d.run();
//        Animall a = new Animall();
//        Dogg d = (Dogg) a;

    }

}
