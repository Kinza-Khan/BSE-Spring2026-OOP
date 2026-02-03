package Operators;

import java.util.Scanner;

public class TernaryOperators {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks ");
        int marks = sc.nextInt();
        String result = marks >= 50 ? "Pass" : "Fails";
        System.out.println("Result " + result);

//        boolean
        boolean a =  true;
        boolean b = false ;
        System.out.println("!a " + !a);
        System.out.println("!b " + !b);



    }
}
