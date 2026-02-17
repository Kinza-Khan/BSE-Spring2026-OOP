package Multidimensional_Array;

public class IntegerArrayMultidimensional {

    static void main(String[] args) {
            int multArray[][] = new int[2][3] ;
        multArray[0][0] = 1 ;
        multArray[0][1] = 2 ;
        multArray[0][2] = 3 ;
        multArray[1][0] = 4;
        multArray[1][1] = 5;
        multArray[1][2] = 6;

        for (int i = 0; i < multArray.length; i++) {
            for (int j = 0; j <multArray[i].length ; j++) {
                System.out.print(multArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
