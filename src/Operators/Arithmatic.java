package Operators;

import java.util.Scanner;

public class Arithmatic {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int n2 = sc.nextInt();
        System.out.println("Addition " + n1+n2);
        System.out.println("Multiplication " + n1*n2);
        System.out.println("Subtraction " + (n1-n2));
        System.out.println("division " + n1/n2);
        System.out.println("Remainder  " + n1%n2);

    }
}
