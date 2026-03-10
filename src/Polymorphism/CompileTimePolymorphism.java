
package  Polymorphism;
// method overloading , static  Polymorphism
class Calculator{

    int add(int a , int b ){
        return  a+b ;
    }
    double add(int a , double b ){
        return  a+b;
    }
}

class CompileTime{
public static void main(String[] args) {
    Calculator cal = new Calculator();
    System.out.println(cal.add(10,5));
    System.out.println(cal.add(10,10.50));

}

}