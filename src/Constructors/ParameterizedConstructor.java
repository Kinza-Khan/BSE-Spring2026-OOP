package Constructors;

public class ParameterizedConstructor {
            //data members or member variable or instance variables
            int id ;
            String name ;
        ParameterizedConstructor(int studentId , String studentName){
            this.id = studentId ;
            this.name =studentName;
            System.out.println(studentId + " " + studentName);
        }
    static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(1,"ali khan");
    }
}
