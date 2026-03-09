package Polymorphism;

class Calculator {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

}


public class CompileTimePolymorphism {
    static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(5,3));
        System.out.println(c.add(5,3,2));

    }
}
