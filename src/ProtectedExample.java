
//protected Access Modifier
//Visible inside the same package and in subclasses (even in different packages).
//Often used in inheritance scenarios.

public class ProtectedExample {
    protected  String familyName = "kinza";
    String familyName2 = "Mushtaq";  // default  , If you don’t write any modifier, it is “default.”
}
class  child extends ProtectedExample{
    void  display(){
        System.out.println("Family Name " + familyName +  " "+familyName2); // accessible because protected
    }

    static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
