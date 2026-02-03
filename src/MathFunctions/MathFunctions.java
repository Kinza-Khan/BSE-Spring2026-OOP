package MathFunctions;

public class MathFunctions {
    static void main(String[] args) {
        int x =  2;
        int y = 4 ;
        double z =2.7 ;
        double t  = 45.36 ;
        int no = -3 ;
        System.out.println("abs "+ Math.abs(no));
        System.out.println("max "+ Math.max(x,y));
        System.out.println("min "+ Math.min(x,y));
        System.out.println("ceil "+ Math.ceil(z)); // greater value if 2.4 it will take 3
        System.out.println("floor "+ Math.floor(z)); // lesser value if value is 2.7 it will take 2
        System.out.println("sqrt "+ Math.sqrt(x));
        System.out.println("random "+ Math.random());
        System.out.println("signum "+ Math.signum(no)); // identify your number is positive negative or zero
        System.out.println("round "+ Math.round(t));
    }
}
