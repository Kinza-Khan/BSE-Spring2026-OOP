package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_one {

    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); //string type list
        // for adding values
        names.add("kinza");
        names.add("fareeha");
        names.add("aqsa");
        System.out.println(names);
        // access the element
        System.out.println(names.get(0));
        System.out.println(names.get(2));
        // for update the value
        names.set(2,"amna"); // index, value
        System.out.println(names);
        // for removing the value or element
        // we can remove by index or by value
        names.remove(2);
        System.out.println(names);
        System.out.println("Print By lOOP");
        names.add(2,"sanaa");
        // iteration
        for (int i = 0; i <names.size(); i++) {
            System.out.println(names.get(i));
        }
        Collections.sort(names);
        System.out.println(names);


        // Iterator is an interface , alternative of loop , Especially useful when we want to delete elements during iteration
        // important methods of iterator hasNext(), next() , remove()
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        Iterator itr = fruits.iterator(); // getting the iterator // iterator() method se Iterator object milta hai
        while(itr.hasNext()){ // check the next element
            System.out.println(itr.next()); // returns the element and move the pointer to the next
        }
    }


}
