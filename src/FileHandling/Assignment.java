package FileHandling;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("data.txt");

            // Step 1: Number of categories
            System.out.print("Enter number of categories: ");
            int categories = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            // Loop for categories
            for (int i = 1; i <= categories; i++) {

                System.out.print("Enter name of category " + i + ": ");
                String categoryName = sc.nextLine();

                fw.write("Category: " + categoryName + "\n");

                // Step 2: Number of products in this category
                System.out.print("How many products in " + categoryName + "? ");
                int products = sc.nextInt();
                sc.nextLine(); // consume newline

                // Loop for products
                for (int j = 1; j <= products; j++) {

                    System.out.print("Enter product " + j + ": ");
                    String product = sc.nextLine();

                    fw.write("   - " + product + "\n");
                }

                fw.write("\n"); // spacing between categories
            }

            fw.close();
            System.out.println("Data successfully saved to file!");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        sc.close();
    }
}

