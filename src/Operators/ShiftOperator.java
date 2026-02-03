package Operators;

import java.util.Scanner;

public class ShiftOperator {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number ");
        int number =  sc.nextInt();
        System.out.println("Enter Shift Value");
        int shiftValue = sc.nextInt();
        int resultLeftShift = number << shiftValue ;
        int resultRightShift = number >> shiftValue ;
        System.out.println("Orignal Value " + number);
        System.out.println("resultLeftShift Value " + resultLeftShift);
        System.out.println("resultRightShift Value " + resultRightShift);
    }
}
