package Operators;

import java.util.Scanner;

public class LogicalOperators {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = sc.nextInt();
        System.out.println("Are you a student? true/false");
        boolean isStudent = sc.nextBoolean();
//        System.out.println("eligible for discount " + (age<25 && isStudent) );
        if(age<25 && isStudent){
            System.out.println("Eligible for discount ");
        }
        else{
            System.out.println("Not Eligible ");
        }


    }
}
