package Array;

public class String_Array {

    static void main(String[] args) {


        String names[] = new String[3];
        names[0] = "kinza" ;
        names[1] = "fareeha" ;
        names[2] = "aqsa";
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);

        }
        System.out.println("using For each");
        for (String name : names){
            System.out.println(name);
        }
    }
}
