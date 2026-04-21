package Generics;

class  Box_{

    public <T> void display(T data){
        System.out.println(data);
    }
}

public class Generic_Method {
    static void main(String[] args) {
            Box_ obj_1 = new Box_();
            obj_1.display("kinza");
            obj_1.display(123);
            obj_1.display(true);
            obj_1.display(new String[] {"fariha","kinza","sana","Aqsa"});
    }
}
