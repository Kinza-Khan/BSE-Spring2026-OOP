package Multidimensional_Array;

public class PassingArrayToFunction {


    public  static void main(String[] args) {
            int array[] = {2,3,4,1, 8} ;
            min(array);
    }

    static void min(int arr[]) {
            int minVal =  arr[0] ;
        for (int i = 0; i <arr.length ; i++) {
                    if(arr[i] < minVal){
                        minVal = arr[i] ;
                        System.out.println(minVal);
                    }
        }
    }
}
