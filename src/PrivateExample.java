
// private Access Modifier
//Visible only inside the class where it is defined.
//Used to protect data (encapsulation) and force the use of getter and setter methods.

class PrivateExample {

    private int age ;
    // Mutator
    public void setAge(int userAge){
        this.age = userAge;
    }

    //Accessor
    public  int getAge(){
            return  age ;
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
       // obj.age = 20; // cannot access the private data members
          obj.setAge(21); // use setters
        // and use getters for viewing the values
        System.out.println(obj.getAge());
     }
}
