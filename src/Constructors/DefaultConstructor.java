package Constructors;

public class DefaultConstructor {
    int id ;
    String name ;
    //explicit default constructor
//    DefaultConstructor(){
//        System.out.println("This is default constructor initialized when object is created "+id + " " +name );
//    }

    static void main(String[] args) {

        DefaultConstructor obj = new DefaultConstructor();
        // implicit default constructor
        System.out.println(obj.id); // 0
        System.out.println(obj.name); // null
    }
}
