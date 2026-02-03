package ControlFlowStatement;

import java.util.Scanner;

public class IFStatment {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = sc.nextInt();
        // if statement
        if(age>25){
            System.out.println("Eligible for voting ");
        }
//        else statement
        else {
            System.out.println("Not Eligible ");
        }
    }

}
