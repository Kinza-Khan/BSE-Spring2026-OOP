package Loop;

import java.util.Scanner;

public class doWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("1 Say Hello");
            System.out.println("2 Say Bye");
            System.out.println("3 Exit");
            System.out.println("Enter a Choice");
             choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Hello! ");
            }
            else if(choice == 2){
                System.out.println("Bye!");
            }
            else if(choice != 3){
                System.out.println("Invalid Choice");
                }
        }
        while(choice != 3 );


    }
}
