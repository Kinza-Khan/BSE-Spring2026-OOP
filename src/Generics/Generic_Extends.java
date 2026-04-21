package Generics;


//Another With Extends
class Calculator<T extends Number> {
    T num1;
    T num2;

    double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}
public class Generic_Extends {
    static void main(String[] args) {
        //calculator example solution

        Calculator<Integer> c = new Calculator<>();
        c.num1 = 20;
        c.num2 = 20;

        System.out.println(c.add());
    }
}
