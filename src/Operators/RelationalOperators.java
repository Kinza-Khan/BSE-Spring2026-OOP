package Operators;

import java.util.Scanner;

public class RelationalOperators {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int n2 = sc.nextInt();
        System.out.println("n1 == n2 " + (n1==n2));
        System.out.println("n1 != n2 " + (n1!=n2));
        System.out.println("n1 >= n2 " + (n1>=n2));
        System.out.println("n1 <= n2 " + (n1<=n2));


    }
}
