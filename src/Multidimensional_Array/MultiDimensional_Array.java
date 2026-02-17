package Multidimensional_Array;

public class MultiDimensional_Array {

    static void main(String[] args) {
        int studentMarks[][] = {
                {45, 78},
                {65, 56},
                {95, 88}
        };
        for (int marks[] : studentMarks){
                for (int mark : marks){
                    System.out.print(mark + " ");
                }
            System.out.println();
        }

    }
}
