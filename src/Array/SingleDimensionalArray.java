package Array;

public class SingleDimensionalArray {

    static void main(String[] args) {
            // step 1
//                int marks[] = {45,56,67,56} ; // direct intialization
//        for (int i = 0; i <marks.length ; i++) {
//            System.out.println("marks " +  marks[i]);
//        }
            // step 2
            // declaration of array
            int marks[] ; // int[] marks // int []marks
            marks = new int[5]; // first method with new keyword // memory allocation
            marks[0] = 56 ;
            marks[1] = 34 ;
            marks[2] = 55 ;
            marks[3] = 67 ;
            marks[4] = 56 ;
//            marks[5] = 78 ;

        System.out.println(marks[0] + " " + marks[1] +  " " +marks[2] + " " + marks[4] + "\n");

        // step 3

        int age[] = new int[3];
        age[0] = 23 ;
        age[1] = 22 ;
        age[2] = 23 ;
        for (int i = 0 ; i < age.length ; i++){
            System.out.println(age[i]);
        }
    }
}
