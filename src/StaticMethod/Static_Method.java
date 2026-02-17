package StaticMethod;

public class Static_Method {
       static int x  = 10;
    static  int  add (int a , int b){
        return  a+ x;
    }
    void display(){
        System.out.println("hello " + x);
    }

    static void main(String[] args) {
        int sum = add(10,20) ;
        System.out.println(sum);
        Static_Method sm = new Static_Method();
        sm.display();
    }

}
