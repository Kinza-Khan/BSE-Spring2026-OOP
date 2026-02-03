package Loop;

public class Loop {
    static void main(String[] args) {
        for(int i = 1 ; i<=10 ;  i++){
            System.out.println("Hello Student , a good day to you all!");
        }


        for(int row = 1 ; row<=3 ;  row++){

            for(int col = 1 ; col<=3 ; col++){
                System.out.println( "row = " + row + " col  = " + col);
            }
            System.out.println("\n");
        }
    }
}
