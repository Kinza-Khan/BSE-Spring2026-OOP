package ControlFlowStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElseIf {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age = sc.nextInt();
        if(age<18 && age >0){
            System.out.println("Junior");
        }
        else if(age>=18 && age <=50){
            System.out.println("You're Young ");
        }
        else if( age >50){
            System.out.println("You're senior citizen   ");
        }
        else {
            System.out.println("Enter a bad input ");
        }

    }
}
