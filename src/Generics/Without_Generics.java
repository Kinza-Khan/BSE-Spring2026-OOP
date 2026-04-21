package Generics;

import java.util.ArrayList;
import java.util.List;

public class Without_Generics {
    static void main(String[] args) {
        // arraylists uses object type data, means allowed all types
        ArrayList list = new ArrayList();
        list.add("kinza");
        list.add(123);
        list.add(true);
      //  int name = (String) list.get(1); // runtime error it gives integer value and we cast in string , bug occur at runtime
        String stdName = (String) list.get(0); // manual casting //
        //Solution using Generics
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("FAREEHA");
        // list2.add(123); COMPILE TIME ERROR
        // No casting needed
        String studentName = list2.get(0); // safe

        //
    }
}
